/**@LuwaDev*/
// This code validates credit cards using Hans Luhn's algorithm.
package ChapterSix;

import java.util.Scanner;

public class CreditCardValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter credit card number as a long integer: ");
        long number = input.nextLong();
        // check whether the credit card has between 13 and 16 digits and starts with the required prefix
        if ((13 <= getSize(number) && getSize(number) <= 16) && (testValues(number))) {
            if (isValid(number)) {
                System.out.print("The card number " + number + " is Valid!");
            } else {
                System.out.print("The card number " + number + " is Invalid!");
            }
        } else {
            System.out.print("Wrong Credit Card!");
        }
        input.close();
    }

    // This method returns the sum of the double of all the numbers in even positions.
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        char[] numberDigits = getNumbers(number);
        // loop through from the odd number as it is the even number position
        for (int i = 1; i < numberDigits.length; i += 2) {
            sum += getDigit(2 * Character.getNumericValue(numberDigits[i]));// convert the char value to numerical value.
        }
        return sum;
    }

    public static boolean isValid(long number) {
        int sumEven = sumOfDoubleEvenPlace(number);
        int sumOdd = sumOfOddPlace(number);
        int total = sumEven + sumOdd;
        return total % 10 == 0;
    }

    public static int sumOfOddPlace(long number) {
        int sum = 0;
        // get digits once again
        char[] numberDigits = getNumbers(number);
        for (int i = 0; i < numberDigits.length; i += 2) {
            sum += Character.getNumericValue(numberDigits[i]);
        }
        return sum;
    }
    // returns a number if it has a single digit.If it has two digits,
    //it returns the sum of the two digits
    public static int getDigit(int number) {
        if (number < 10) {
            return number;
        } else {
            int num1 = number % 10;
            int num2 = number / 10;
            return num1 + num2;
        }
    }

    // In my approach, I will get all the numbers into a list using this method
    public static char[] getNumbers(long number) {
        char[] numbers = new char[16]; // because the credit card number should not be more than 16.
        int i = 0;// iterator
        while (number > 0 && i < 16) {
            numbers[i] = (char) (number % 10 + '0');
            number /= 10;
            i++;
        }
        return numbers;
    }

    // This method returns the number of digits in d
    public static int getSize(long d) {
        // convert from long to string to enable easy manipulation
        String digitsInString = String.valueOf(d);
        return digitsInString.length();
    }
     // this method returns a boolean value that shows whether or not a number starts with prefix d.
    public static boolean prefixMatched(long number, int d) {
        String num = String.valueOf(number);
        String n = String.valueOf(d);
        return num.startsWith(n);
    }

    // this method tests for all the conditions that the credit card must start with and returns a value in that regard
    public static boolean testValues(long number) {
        return prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37)
                || prefixMatched(number, 6);
    }
}

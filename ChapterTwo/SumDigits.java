// @LuwaDev
/*(Sum the digits in an integer) Write a program that reads an integer between 0 
and 1000 and adds all the digits in the integer. For example, if an integer is 932, 
the sum of all its digits is 14.
 Hint: Use the % operator to extract digits, and use the / operator to remove the 
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93. */
package ChapterTwo;
import java.util.Scanner;
public class SumDigits {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the number of digits: ");
        int numberOfDigits = input.nextInt();
        int[] list = new int[numberOfDigits];
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int count = 10;
        int sum = 0;
        for (int i = 0; i < numberOfDigits; i++) {
            list[i] = number % count;
            number /= count;
        }
        for (int j = 0; j < list.length; j++) {
            sum += list[j];
        }
        System.out.print("The sum of the digits is " + sum);
        input.close();
    }
}

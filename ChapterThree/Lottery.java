package ChapterThree;
//@LuwaDev
/*(Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a three
digit integer. The program prompts the user to enter a three-digit integer and 
determines whether the user wins according to the following rules:
 1. If the user input matches the lottery number in the exact order, the award is 
$10,000.
 2. If all digits in the user input match all digits in the lottery number, the award 
is $3,000.
 3. If one digit in the user input matches a digit in the lottery number, the award 
is $1,000. */
import java.util.Scanner;
public class Lottery {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int lottery = (int)(Math.random()*1000);
        // System.out.print(lottery);
        System.out.print("Enter your guess: ");
        int number = input.nextInt();
        int lottery1 = lottery/100;
        int lottery2 = (lottery/10)%10;
        int lottery3 = lottery%10;
        int number1 = number/100;
        int number2 = (number/10)%10;
        int number3 = number%10;
        if (lottery == number) {
            System.out.print("Wow! Your award is $10000");
        }
        else if ((number1 == lottery1||number1 == lottery2||number1 == lottery3)&& (number2 == lottery1||number2 == lottery2||number2 == lottery3)&&(number3 == lottery1||number3 == lottery2||number3 == lottery3)) {
            System.out.print("Your award is $3000");
        }
        else if((number1 == lottery1||number1 == lottery2||number1 == lottery3) || (number2 == lottery1||number2 == lottery2||number2 == lottery3)||(number3 == lottery1||number3 == lottery2||number3 == lottery3)) {
            System.out.print("Your award is $1000");
        }
        else {
            System.out.print("Nothing for you!");
        }
        input.close();
    }
}

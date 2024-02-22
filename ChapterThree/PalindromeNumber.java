package ChapterThree;
//@LuwaDev
/*(Palindrome integer) Write a program that prompts the user to enter a three-digit 
integer and determines whether it is a palindrome integer. An integer is palindrome 
if it reads the same from right to left and from left to right. A negative integer is 
treated the same as a positive integer. Here are sample runs of this program: */
import java.util.Scanner;
public class PalindromeNumber {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a three digit number: ");
        int number = input.nextInt();
        int digit1 = number/100;
        int digit2 = number%10;
        System.out.print((digit1 == digit2) ? "Palindrome!" : "Not a Palindrome" );
        input.close();
    }
    
}
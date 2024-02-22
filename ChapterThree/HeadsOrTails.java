package ChapterThree;
//@LuwaDev
/*(Game: heads or tails) Write a program that lets the user guess whether the flip 
of a coin results in heads or tails. The program randomly generates an integer 
0 or 1, which represents head or tail. The program prompts the user to enter a 
guess, and reports whether the guess is correct or incorrect. */
import java.util.Scanner;
public class HeadsOrTails {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter your guess(0 or 1): ");
        int guess = input.nextInt();
        int number = (int)(Math.random()*2);
        System.out.print((guess==number) ? "Lucky Winner!" : "Loser");
        input.close();
    }
}

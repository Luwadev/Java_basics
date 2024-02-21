//@LuwaDev
package ChapterThree;
/*(Financial application: monetary units) Modify Listing 2.10, ComputeChange.
 java, to display the nonzero denominations only, using singular words for single 
units such as 1 dollar and 1 penny, and plural words for more than one unit such 
as 2 dollars and 3 pennies. */
import java.util.Scanner;
 
public class ComputeChange {
    public static void main(String[] args) {
            // Create a Scanner
            Scanner input = new Scanner(System.in);
            
            // Receive the amount 
            System.out.print("Enter an amount in double, for example 11.56: ");
            double amount = input.nextDouble();
            
            int remainingAmount = (int)(amount * 100);
            
            // Find the number of one dollars
            int numberOfOneDollars = remainingAmount / 100;
            remainingAmount = remainingAmount % 100;
            
            // Find the number of quarters in the remaining amount
            int numberOfQuarters = remainingAmount / 25;
            // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
    
        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
            remainingAmount = remainingAmount % 5;
        
        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;
        
        // Display results
            System.out.println("Your amount " + amount + " consists of");
            System.out.println((numberOfOneDollars == 0 || numberOfOneDollars == 1) ? ""+numberOfOneDollars+" dollar": ""+numberOfOneDollars+" dollars");
            System.out.println((numberOfQuarters == 0||numberOfQuarters == 1) ? ""+numberOfQuarters+" dollar": ""+numberOfQuarters+" dollars");
            System.out.println((numberOfDimes == 0 || numberOfDimes == 1) ? ""+numberOfDimes+" dimes" : ""+numberOfDimes+" dimes");
            System.out.println((numberOfNickels == 0||numberOfNickels == 1) ? ""+numberOfNickels+" nickel" : ""+numberOfNickels+" nickels");
            System.out.println((numberOfPennies == 0 || numberOfPennies == 1) ? ""+numberOfPennies+" penny" : ""+numberOfPennies+" pennies");
            input.close();
    }
}
 
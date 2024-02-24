package ChapterThree;
//@LuwaDev
/*(Financials: currency exchange) Write a program that prompts the user to enter 
the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the 
user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert 
from  Chinese RMB to U.S. dollars. Prompt the user to enter the amount in U.S. 
dollars or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respec
tively. */
import java.util.Scanner;
public class CurrencyExchange {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double result;
        System.out.print("Enter exchange rate from dollars to PMB: ");
        double exchangeRate = input.nextDouble();
        System.out.print("Enter 0 to convert dollar to RMB and 1 for vice versa: ");
        int choice = input.nextInt();
        System.out.print((choice == 0|| choice == 1) ? "Enter the "+getChoice(choice)+" amount: " : "Incorrect input");
        double amount = input.nextDouble();
        switch (choice) {
            case 0: result = getResult(choice, exchangeRate,amount); break;
            case 1: result = getResult(choice, exchangeRate,amount); break;
            default: result = 1; break;
        }
        System.out.print("The exchanged value is "+ result);
        input.close();                                              
        
        
    }
    public static double getResult(int n, double exchangeRate, double amount) {
        double result = 1;
        switch (n) {
            case 0: result = amount*exchangeRate;break;
            case 1: result = amount/exchangeRate; break;
        }
        return result;
    }
    
    public static String getChoice(int n) {
        String result = "";
        switch (n) {
            case 0: result = "dollar"; break;
            case 1: result = "RMB"; break;
        }
        return result;
    }
    
    
}
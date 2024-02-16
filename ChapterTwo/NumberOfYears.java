//@LuwaDev
/*Find the number of years) Write a program that prompts the user to enter the 
minutes (e.g., 1 billion), and displays the maximum number of years and remain
ing days for the minutes. For simplicity, assume that a year has 365 days. */
package ChapterTwo;
import java.util.Scanner;
public class NumberOfYears {
    public static void main (String[] args) {
        // final int YEAR = 365; 
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();
        int hour = minutes/60;
        int day = hour/24;
        int year = day/365;
        int days = (day%365);
        System.out.print(minutes + " minutes is approximately " + year + " years and " + days + " days");
        input.close();

    }
}

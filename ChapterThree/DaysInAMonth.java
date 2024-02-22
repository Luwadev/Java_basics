package ChapterThree;
//@LuwaDev
/*(Find the number of days in a month) Write a program that prompts the user 
to enter the month and year and displays the number of days in the month. For 
example, if the user entered month 2 and year 2012, the program should display 
that February 2012 has 29 days. If the user entered month 3 and year 2015, the 
program should display that March 2015 has 31 days. */
import java.util.Scanner;
public class DaysInAMonth {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the month: ");
        int month = input.nextInt();
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        switch (month) {
            case 0: System.out.print("January "+year+" had 31 days"); break;
            case 1: System.out.print("February "+year+" had 29 days"); break;
            case 3: System.out.print("March "+year+" had 31 days"); break;
            case 4: System.out.print("April "+year+" had 30 days"); break;
            case 5: System.out.print("May "+year+" had 31 days"); break;
            case 6: System.out.print("June "+year+" had 30 days"); break;
            case 7: System.out.print("July "+year+" had 31 days"); break;
            case 8: System.out.print("August "+year+" had 31 days"); break;
            case 9: System.out.print("September "+year+" had 30 days"); break;
            case 10: System.out.print("October "+year+" had 31 days"); break;
            case 11: System.out.print("November "+year+" had 30 days"); break;
            case 12: System.out.print("December "+year+" had 31 days"); break;
        }
        input.close();

    }
}

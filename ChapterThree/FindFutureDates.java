//@LuwaDev
/*(Find future dates) Write a program that prompts the user to enter an integer for 
today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6). Also 
prompt the user to enter the number of days after today for a future day and dis
play the future day of the week. Here is a sample run: */
package ChapterThree;
import java.util.Scanner;
public class FindFutureDates {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter today's day: ");
        int today = input.nextInt();
        System.out.print("Enter thr number of Days elasped since today: ");
        int future = input.nextInt();
        int futureDay = (future + today)%7;
        String day = "";
        String pday = "";
        switch (futureDay) {
            case 0:  day = "Sunday"; break;
            case 1:  day = "Monday"; break;
            case 2:  day = "Tuesday"; break;
            case 3:  day = "Wednesday"; break;
            case 4:  day = "Thursday"; break;
            case 5:  day = "Friday"; break;
            case 6:  day = "Saturday"; break;
        }
        switch (today) {
            case 0:  pday = "Sunday"; break;
            case 1:  pday = "Monday"; break;
            case 2:  pday = "Tuesday"; break;
            case 3:  pday = "Wednesday"; break;
            case 4:  pday = "Thursday"; break;
            case 5:  pday = "Friday"; break;
            case 6:  pday = "Saturday"; break;
        }
        System.out.print("Today is "+pday+" and the future day is "+ day);
        input.close();
    }
    
}
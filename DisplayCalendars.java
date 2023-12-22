// @LuwaDev
import java.util.Scanner;

public class DisplayCalendars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        System.out.print("Enter the first day of the year (1 for Sunday, 2 for Monday, and so on): ");
        int firstDayOfYear = scanner.nextInt();

        // Display the calendar for each month in the year
        for (int month = 1; month <= 12; month++) {
            String monthName = getMonthName(month);

            // Display month and year
            System.out.println(monthName + " " + year);
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            // Display days in the month
            displayMonth(year, month, firstDayOfYear);

            System.out.println(); // Add a newline for better readability

            // Calculate the first day of the next month
            int daysInMonth = getDaysInMonth(year, month);
            firstDayOfYear = (firstDayOfYear + daysInMonth) % 7;
        }

        scanner.close();
    }

    public static String getMonthName(int month) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June",
                               "July", "August", "September", "October", "November", "December"};
        return monthNames[month - 1];
    }

    public static void displayMonth(int year, int month, int firstDayOfMonth) {
        int daysInMonth = getDaysInMonth(year, month);

        // Print leading spaces
        for (int i = 0; i < firstDayOfMonth - 1; i++) {
            System.out.print("    ");
        }

        // Print days
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);

            // Move to the next line if it's Saturday
            if ((day + firstDayOfMonth - 1) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println(); // Add a newline for better readability
    }

    public static int getDaysInMonth(int year, int month) {
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        } else {
            return 31;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

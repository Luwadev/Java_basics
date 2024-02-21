//@LuwaDev
/*(Sort three integers) Write a program that prompts the user to enter three integers 
and display the integers in non-decreasing order. */
package ChapterThree;
import java.util.Scanner;
import java.util.Arrays;
public class SortThreeNumbers {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter three numbers seperated by space: ");
        int[] numberList = new int [3];
        for (int i = 0; i < 3; i++) {
            numberList[i] = input.nextInt();
        }
        Arrays.sort(numberList);
        for (int i = 0; i < 3; i++) {
            System.out.print(numberList[i] + " ");
        }
        input.close();
    }
    
}
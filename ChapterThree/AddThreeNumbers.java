package ChapterThree;
import java.util.Scanner;
public class AddThreeNumbers {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print(Math.random());
        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);
        int num3 = (int)(Math.random()*10);
        System.out.print(" What is the sum of " + num1 + " + " + num2 + " + " + num3 + " ?: ");
        int answer = input.nextInt();
        System.out.print((answer == (num1 + num2 + num3)) ? "Correct	" : "Wrong The Sum of " + num1 + ", " + num2 + " and " + num3 + " is " + (num1 + num2 + num3));
        input.close();
        
        // System.out.print(MaxNumbers.max(num1, num2));
    }
    
}
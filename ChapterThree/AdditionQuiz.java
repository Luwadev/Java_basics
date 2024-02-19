//@LuwaDev
/*(Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, gen
erates two integers and prompts the user to enter the sum of these two integers. 
Revise the program to generate three single-digit integers and prompt the user to 
enter the sum of these three integers.
 */
package ChapterThree;
import java.util.Scanner;
public class AdditionQuiz {
    public static void main (String[] args) {
        int num1 = (int)(Math.random()*100);
        int num2 = (int)(Math.random()*100);
        int num3 = (int)(Math.random()*100);
        Scanner input = new Scanner (System.in);
        System.out.print("What is "+num1+" + "+num2+" + "+num3+"? ");
        int answer = input.nextInt();
        System.out.print((answer == (num1+num2+num3)) ? "Correct! You sabi book" : "Wrong The ansewer is "+(num1+num2+num3)+"");
        input.close();

    }
}

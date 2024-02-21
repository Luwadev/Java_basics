//@LiwaDev
package ChapterThree;
/*(Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to 
let the user enter weight, feet, and inches. For example, if a person is 5 feet and 
10 inches, you will enter 5 for feet and 10 for inches. Here is a sample run: */
import java.util.Scanner;
public class BMI {
    public static void main (String[] args) {
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter weight in pounds: ");
        int weightInPounds = input.nextInt();
        System.out.print("Enter feet: ");
        int feet = input.nextInt();
        System.out.print("Enter inches: ");
        int inches = input.nextInt();
        double weightInKilograms = weightInPounds*KILOGRAMS_PER_POUND;
        int feetInInches = feet*12;
        int totalInches = feetInInches+inches;
        double heightInMetres = totalInches*METERS_PER_INCH;
        double bmi = weightInKilograms/(heightInMetres*heightInMetres);
        System.out.println("BMI is "+(int)(bmi*1000)/1000.+"");
        input.close();
        if (bmi < 18.5) {
            System.out.println("Underweight");
        }
        else if (bmi < 25) {
            System.out.println("Normal");
        }
        else if (bmi < 30) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
    
    }
}

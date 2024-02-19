//@LuwaDev
package ChapterThree;
/*(Algebra: solve quadratic equations) The two roots of a quadratic equation 
ax2 + bx + c = 0 can be obtained using the following formula:
 r1 =-b + 2b2- 4ac
 2a 
and r2 =-b- 2b2- 4ac
 2a
 b2- 4ac is called the discriminant of the quadratic equation. If it is positive, the 
equation has two real roots. If it is zero, the equation has one root. If it is nega
tive, the equation has no real roots.
 Write a program that prompts the user to enter values for a, b, and c and displays 
the result based on the discriminant. If the discriminant is positive, display two 
roots. If the discriminant is 0, display one root. Otherwise, display “The equation 
has no real roots.”
 Note you can use Math.pow(x, 0.5) to compute 2x. Here are some sample 
runs: */

import java.util.Scanner;
public class QuadraticEquation {
    public static void main (String[] args) {
        // define the variables needed
        double a;
        double b;
        double c;
        double discriminant;
        double imag_part;
        double real_part;
        double x1;
        double x2;
        Scanner input = new Scanner (System.in); //creates a scanner object "input"
        System.out.println("This program solves for the roots of  a quadratic equation. ");
        System.out.print("Enter the coeffecient of A: ");
        a = input.nextDouble();
        System.out.print("Enter the coeffecient of B: ");
        b = input.nextDouble();
        System.out.print("Enter the coeffecient of C: ");
        c = input.nextDouble();
        //Calculate discriminant
        discriminant = b*b - 4. *a * c; //Solve for the determinant and use it to find the roots of the equation
        if (discriminant > 0){
            x1 = (-b + Math.sqrt(discriminant))/(2. * a);
            x2 = (-b - Math.sqrt(discriminant))/(2. * a);
            System.out.println("This equation has 2 real rooots");
            System.out.print("X1 = " + x1 + "X2 = " + x2);
        }
        else if (discriminant == 0) {
            x1 = (-b)/(2. * a);
            System.out.println("This equation has repeating rots");
            System.out.print("X1 = X2 =" + x1);

        }   
        else {
            // if the determinant is less than zero (Complex roots)
            real_part = (-b)/(2. * a);
            imag_part = Math.sqrt(Math.abs(discriminant)/(2. * a));
            System.out.println("This equation has complex roots");
            System.out.print("X1 = " + real_part + "+i" + imag_part);
            System.out.print("X2 = " + real_part + "-i" + imag_part);
        }
        input.close();// close the input
    }
}

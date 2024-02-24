//@LuwaDev
package ChapterThree;
/*(Algebra: solve 2 * 2 linear equations) A linear equation can be solved using 
Cramer’s rule given in Programming Exercise 1.13. Write a program that prompts 
the user to enter a, b, c, d, e, and f and displays the result. If ad- bc is 0, report 
that “The equation has no solution.” */
public class LinearEquations {
    public static void main (String[] args) {
        java.util.Scanner input = new java.util.Scanner (System.in);
        System.out.print("Enter a,b,c,d,e,f seperated by a space: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        double denominator = (a*d - b*c);
        if (denominator == 0) {
            System.out.print("The Equation has no solution");
        }
        else {
            double x = (e*d - b*f)/denominator;
            double y = (a*f - e*c)/denominator;
            System.out.print("x = "+(int)(x*100)/100.0+", y = "+(int)(y*100)/100.0+"");
        }
        
        input.close();

    }
}

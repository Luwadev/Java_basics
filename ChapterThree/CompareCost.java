package ChapterThree;
//@LuwaDev
/*(Financial: compare costs) Suppose you shop for rice in two different packages. 
You would like to write a program to compare the cost. The program prompts the 
user to enter the weight and price of each package and displays the one with the 
better price. */
import java.util.Scanner;
public class CompareCost {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();
        double package1 = price1/weight1;
        double package2 = price2/weight2;
        package1 = (int)(package1 *100)/100.;
        package2 = (int)(package2 *100)/100.;
        if (package1 == package2) {
            System.out.print("The two packages have the same price");
            
        }
        else if (package2 < package1) {
            System.out.print("Package 2 has a better price");
        }
        else {
            System.out.print("Package 1 has a  better price");
        }
        input.close();
    }
    
}
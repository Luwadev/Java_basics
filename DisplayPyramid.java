package ChapterFive;

import java.util.Scanner;
public class DisplayPyramid {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the number of lines between 1 and 15: ");
        int num = input.nextInt();
        String s = " ";
        int count = 1;
        int d = num;
        for (int i = 1; i <= num; i++){
            while (count <= d) {
                System.out.print(s+s);
                count++;
            }
            for (int j = i; j >=1; j--) {
                System.out.print(j + " ");
            }
            for (int k = 2; k<= i; k++) {
                System.out.print(k + " ");
            }
            d-=1;
            count = 1;
            System.out.print(" \n");
        }
        input.close();
    }
    
}
//@LuwaDev
/*(Science: wind-chill temperature) How cold is it outside? The temperature alone is 
not enough to provide the answer. Other factors including wind speed, relative hu
midity, and sunshine play important roles in determining coldness outside. In 2001, 
the National Weather Service (NWS) implemented the new wind-chill temperature 
to measure the coldness using temperature and wind speed. The formula is
 twc = 35.74 + 0.6215ta- 35.75v0.16 + 0.4275tav0.16
 where ta is the outside temperature measured in degrees Fahrenheit, v is the speed 
measured in miles per hour, and twc is the wind-chill temperature. The formula cannot 
be used for wind speeds below 2 mph or temperatures below -58°F or above 41°F.
 Write a program that prompts the user to enter a temperature between -58°F 
and 41°F and a wind speed greater than or equal to 2 then displays the wind-chill 
temperature. */
package ChapterTwo;
import java.util.Scanner;
public class WindChillTemperature {
    public static void main (String args[]) {
        Scanner input = new Scanner (System.in);
        double windChillTemperature;
        double tempInF;
        double windSpeed;
        System.out.print("Enter a temperature between -58F and 41F: ");
        tempInF = input.nextDouble();
        if (-58 <= tempInF && tempInF <= 41) {
            System.out.print("Enter the wind sped (>=2) in miles per hour: ");
            windSpeed = input.nextDouble();
            if (windSpeed >= 2) {
                windChillTemperature = 35.74 + 0.6215*tempInF - 35.75*Math.pow(windSpeed, 0.16) + 0.4275*tempInF*Math.pow(windSpeed, 0.16);
                System.out.print("The wind chill index is " + (int)(windChillTemperature*10000)/10000.0);
            }
            else {
                System.out.print("You have  entered an invalid input.");
            }
           
        }
        else {
            System.out.print("You have  entered an invalid input.");
        }
       
        input.close();
    }


}

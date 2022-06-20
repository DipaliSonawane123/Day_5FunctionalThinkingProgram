/*5. Write a program WindChill.java that takes two double command-line arguments t
and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the
National Weather Service defines the effective temperature (the wind chill) to be:

Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger
than 120 or less than 3 (you may assume that the values you get are in that range).
*/
package day6functional;

import java.util.Scanner;

public class Wind {
	
public static void main(String[] args) {
	

    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    
    System.out.println("Enter the value of temperature(t) and velocity (v) ");
    System.out.println("temperature must less then 50 and velocity must in between 3 - 120: ");
    double t = sc.nextDouble();
   
   double v = sc1.nextDouble();
   
   double w = 35.74 + 0.6215 + (((0.4275 * t) - 35.75) * Math.pow(v, 0.16));
    if (t <= 50 && v > 3 && v < 120) {
        System.out.println("effective temperature is: " + w);
    }
    else{
       
    	System.out.println("values are out of range");
sc.close();
sc1.close();
    }
    }
}

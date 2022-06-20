/*4. Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
can be found using a formula (Note: Take a, b and c as input values)
delta = b*b - 4*a*c
Root 1 of x = (-b + sqrt(delta))/(2*a)
Root 2 of x = (-b - sqrt(delta))/(2*a)*/
package day6functional;

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Please enter value of a: ");
        int a = sc.nextInt();

        System.out.print(" Please enter value of b: ");
        int b = sc.nextInt();

        System.out.print(" Please enter value of c: ");
        int c = sc.nextInt();

        int delta = b * b - 4 * a * c;
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println(" The first root of x is : " + root1);
        System.out.println(" The second root of x is: " + root2);
	sc.close();
	}
}

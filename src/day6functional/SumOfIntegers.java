/*2. Sum of three Integer adds to ZERO
a. Desc -> A program with cubic running time. Read in N integers and counts the
number of triples that sum to exactly 0.
b. I/P -> N number of integer, and N integer input array
c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
d. O/P -> One Output is number of distinct triplets as well as the second output is to
print the distinct triplets.*/
package day6functional;

import java.util.Scanner;

public class SumOfIntegers {
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

/* 2D Array
a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
standard input and printing them out to standard output.
b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with
OutputStreamWriter to print the output to the screen.*/
package day6functional;

import java.io.PrintStream;
import java.util.Scanner;

public class Array2D {
	 static Scanner input = new Scanner(System.in);
     PrintStream pr = new PrintStream(System.out);
     public void IntegerArray(int m, int n) {
         int[][] twoDarray = new int[m][n];
         for (int i = 0; i < m; i++) {
             for (int j = 0; j < n; j++) {
                 System.out.println("Enter the element for " + i + " row " + j + " column.");
                 twoDarray[i][j] = input.nextInt();
             }
         }
         for (int i = 0; i < m; i++) {
             for (int j = 0; j < n; j++) {
                 pr.print(twoDarray[i][j] + " ");
             }
             System.out.println("\n");
         }
     }

     public void BooleanArray( int m, int n) {
         boolean[][] twoDarray = new boolean[m][n];
         for (int i = 0; i < m; i++) {
             for (int j = 0; j < n; j++) {
                 System.out.println("Enter the element for " + i + " row " + j + " column.");
                 twoDarray[i][j] = input.nextBoolean();
             }
         }
         for (int i = 0; i < m; i++) {
             for (int j = 0; j < n; j++) {
                 pr.print(twoDarray[i][j] + " ");
             }
             System.out.println("\n");
         }
     }

     public void DoubleArray(int m, int n) {
         double[][] twoDarray = new double[m][n];
         for (int i = 0; i < m; i++) {
             for (int j = 0; j < n; j++) {
                 System.out.println("Enter the element for " + i + " row " + j + " column.");
                 twoDarray[i][j] = input.nextDouble();
             }
         }
         for (int i = 0; i < m; i++) {
             for (int j = 0; j < n; j++) {
                 pr.print(twoDarray[i][j] + " ");
             }
             System.out.println("\n");
         } 
         pr.flush();
         pr.close();
         }

     public static void main(String[] args) {

         System.out.println("Enter number of rows: ");
         int m = input.nextInt();
         System.out.println("Enter number of columns: ");
         int n = input.nextInt();

         Array2D object = new Array2D();

         System.out.println("Enter your choice \n 1.Integer \n 2.double \n 3.boolean ");
         int choice = input.nextInt();
         switch (choice) {
             case 1:
                 object.IntegerArray(m, n);
                 break;
             case 2:
                 object.DoubleArray(m, n);
                 break;
             case 3:
                 object.BooleanArray(m, n);
                 break;
             default:
                 System.out.println("Enter valid input[1/2/3].");

}
         }
     }

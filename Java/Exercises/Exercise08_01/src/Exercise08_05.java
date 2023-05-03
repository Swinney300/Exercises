/*Step 1: Create a class named Exercise08_05.
Step 2: Add three methods: a main method, addMatrix(double[][] m1, double[][] m2), and printResult(double[][] m1, double[][] m2, double[][] m3, char op) in the class.
Step 3: Implement the addMatrix(double[][] m1, double[][] m2)method as follows:
Step 3.1: Declare and initialize result using new double[m1.length][m1[0].length].
Step 3.2: Write a nested for loop to assign m1[i][j] + m2[i][j] to result[i][j].
Step 3.3: Return result.
Step 4: Implement the printResult(double[][] m1, double[][] m2, double[][] m3, char op) method as follows:
Step 4.1: For each row i from 0 to m1.length - 1, display a row in m1, m2, and m3. In the middle row, display the operation between m1 and m2 and display the = symbol between m2 and m3. 
Step 5: Implement the main method as follows:
Step 5.1: Create array m1. Enter input for m1.
Step 5.2: Create array m2. Enter input for m2.
Step 5.3: Obtain m3 from addMatrix(m1, m2).
Step 5.4: Display the result by invoking printResult(m1, m2, m3) */

import java.util.Scanner;
import java.lang.Math;

public class Exercise08_05 {
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
        double[][] m1 = new double[3][3];
        double[][] m2 = new double[3][3];
        double[][] m3 = new double[3][3];
        char op = ' ';

        System.out.print("Enter matrix1: ");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = input.nextDouble();
            }    
        }

        System.out.print("Enter matrix2: ");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m2[i][j] = input.nextDouble();
            }    
        }

        /*double[][] m1 = 
        {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8 , 9}
        };

        double[][] m2 =
        {
            {10, 11, 12},
            {13, 14, 15},
            {16, 17, 18}
        };

        double[][] m3 = new double[3][3];
        char op = '+';

        m3 = addMatrix(m1, m2);
        printResult(m1, m2, m3, op);
*/
    }

    public static double[][] addMatrix(double[][] m1, double[][] m2)
    {
        double[][] result = new double[m1.length][m1[0].length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }    
        }

        return result;
    }

    public static void printResult(double[][] m1, double[][] m2, double[][] m3, char op)
    {

        System.out.println("The addition of the matrices is");

        for (int i = 0; i < m1.length; i++) 
        {
            for (int j = 0; j < m1[i].length; j++) 
            {
                System.out.printf((i < m1.length && j < m1[i].length)? m1[i][j] + " " : "     ");  
            }

            System.out.print((i == 1) ? op + " " : "  ");

            for (int j = 0; j < m2[i].length; j++) 
            {
                System.out.print((i < m1.length && j < m1[i].length)? m2[i][j] + " " : "    ");  
            }

            System.out.print((i == 1) ? "= " : "  ");

            for (int j = 0; j < m3[i].length; j++) 
            {
                System.out.print((i < m1.length && j < m1[i].length)? m3[i][j] + " " : "     ");  
            }
            System.out.println();
        }
    }
        
}

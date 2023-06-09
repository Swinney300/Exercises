/*
(The Location class) 
Design a class named Location for locating a maximal value and its location in a two-dimensional array.

The class contains public data fields row, column, and maxValue that store the maximal value and its indices 
in a two-dimensional array with row and column as int types and maxValue as a double type.

Write the following method that returns the location of the largest element in a two-dimensional array:

public static Location locateLargest(double[][] a)

The return value is an instance of 
Location.
Write a test program that prompts the user to enter a two-dimensional array and displays the location of the largest 
element in the array.

If there are more than one largest element, find the location with the smallest row index and then the smallest column index.

Sample Run

Enter the number of rows and columns in the array:  3 4
Enter the array:
23.5  35  2  10
4.5   3  45  3.5
35   44  5.5  9.6
The largest element is 45, located at (1, 2)
*/

import java.util.Scanner;

public class Exercise09_13 {
    public static void main(String[] args) {
        // Write your code
        Scanner input = new Scanner(System.in);

        int row = 0; 
        int column = 0;

        System.out.println("Enter the number of rows and columns in the array: ");
        row = input.nextInt();
        column = input.nextInt();


        System.out.println("Enter the array: ");
        double[][] matrix = new double[row][column];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        /*double[][] matrix = {
            {23.5, 35, 2, 10},
            {4.5, 3, 45, 3.5},
            {35, 44, 5.5, 9.6}
        };*/

        Location loc = locateLargest(matrix);
        System.out.println("The largest element is " + loc.maxValue + ", located at (" + loc.row + ", " + loc.column + ")");
    }

    public static Location locateLargest(double[][] a) {
        // Write your code
        int x = 0;
        int y = 0;
        double max = 0.0;
        
        max = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(max < a[i][j]){
                    max = a[i][j];
                    x = i;
                    y = j;
                }    
            }
        }
        // Hint for creating a Location object.
        // Assume the max value in a is m and location is at (x, y)
        Location location = new Location();
        location.maxValue = max; 
        location.row = x; 
        location.column = y;
        return location;
    }
}

class Location {
    // Write your code
    int row = 0;
    int column = 0;
    double maxValue = 0.0;

    Location(){
    }
}

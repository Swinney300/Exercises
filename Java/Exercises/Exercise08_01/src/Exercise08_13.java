import java.util.Scanner;

public class Exercise08_13 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int row, column = 0;

        System.out.println("Enter the number of rows and columns of the array: ");
        row = input.nextInt();
        column = input.nextInt();

        double[][] matrix = new double[row][column];

        /*double[][] matrix = {
                { 23.5, 35, 2, 10 },
                { 4.5, 3, 45, 3.5 },
                { 35, 44, 5.5, 9.6 }
        };*/

        System.out.println("Enter the array: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();    
            }
        }

        locateLargest(matrix);

    }

    public static int[] locateLargest(double[][] a){

        double largest = a[0][0];

        int[] location = { 0, 0 };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (largest < a[i][j]) {
                    largest = a[i][j];
                    location[0] = i;
                    location[1] = j;
                }

            }
        }

        System.out.println("The location of the largest element is at (" + location[0] + ", " + location[1] + ")");

        return location;
    }
}

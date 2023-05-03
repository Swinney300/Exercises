import java.util.Scanner;

public class Exercise08_01 {

    public static void main(String[] args) {
        
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        /*double[][] matrix = {
            {1.5,2,3,4},
            {5.5,6,7,8},
            {9.5,1,3,1}
        };*/

        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][4];
        
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }    
        }

        double[] sum = sumColumn(matrix, 0);

        for (int i = 0; i < sum.length; i++) {
            System.out.println("Sum of the elements at column" + i + "is" + sum[i]);    
        }

    }

    public static double[] sumColumn(double[][] m, int columnIndex){
        double[] columnSum = new double[4];

        for (int i = 0; i < m[columnIndex].length; i++) {
            for (int j = 0; j < m.length; j++) {
                columnSum[i] += m[j][i];    
            }    
        }

        return columnSum;
    }
}
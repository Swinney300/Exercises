import java.util.Scanner;

public class Exercise08_25 {
    public static void main(String[] args) {
        
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        /*double[][] matrix = {
            {0.15,0.875,0.375},
            {0.55,0.005,0.225},
            {0.30,0.12,0.4}
        };*/

        /*double[][] matrix = {
            {0.95,-0.875,0.375},
            {0.55,0.005,0.225},
            {0.30,0.12,-0.4}
        };*/

       Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][3];
        
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }    
        }

        isMarkovMatrix(matrix);

    }

    public static boolean isMarkovMatrix(double[][] m){
        double sum = 0;

        boolean Markov = true;

        for (int i = 0; i < m.length; i++) {
            //sum = 0;
            for (int j = 0; j < m.length; j++) {
                sum += m[j][i];   
            }
            if (sum != 1) {
                Markov = false;
                break;
            }else if (sum == 1){
                Markov = true;
            }
            System.out.println("The current sum is: " + sum);     
        }

        return true;
    }         
}

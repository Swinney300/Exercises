import java.util.Scanner;

class Excercise08_01 
{
    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row:");
        double[][] matrix = {
            {1.5,2,3,4}
            {5.5,6,7,8}
            {9.5,1,3,1}
        }
        
        
    }
    public static double sum Column(double[][] m, int columnIndex)
    {
        
        double sum = 0.0;
        for (int i = 0; i < m[columnIndex].length; i++) 
        {
            sum = 0;
            for (int j = 0; j < matrix.length; j++)
            {
                sum += m[j][i];   
            }
        System.out.println("Sum of the elements at column " + i + " is " + sum);
        }    
    }
}
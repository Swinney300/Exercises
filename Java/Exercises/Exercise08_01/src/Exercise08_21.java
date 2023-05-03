import java.lang.Math;
import java.util.*;

public class Exercise08_21 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter the number of cities: ");
        Scanner input = new Scanner(System.in);
        
        int arraySize = input.nextInt();

        double[][] coordinates = new double[arraySize][2];

        System.out.print("Enter the coordinates of the cities: ");

        for (int i = 0; i < coordinates.length; i++) 
        {
            for (int j = 0; j < coordinates[i].length; j++) 
            {
                coordinates[i][j] = input.nextDouble();
            }
        }

        /*double[][] coordinates = 
        {
            {2.5,5},
            {5.1,3},
            {1,9},
            {5.4,54},
            {5.5,2.1}
        };*/
       
        System.out.println("The total distance to all other cities is " + String.format("%.2f", CheckAllCities(coordinates)));
        
    }
    
    static double CheckAllCities (double[][] coordinates) 
    {
        double[] shortestArray = new double[coordinates.length];
        double shortest = 0.0;
        int locationIndex = 0;

        for (int i = 0; i < coordinates.length; i++) 
        {
            for (int j = 0; j < coordinates[i].length-1; j++) 
            {
                for (int k = 0; k < coordinates.length; k++) 
                {
                    for (int l = 0; l < coordinates[i].length-1; l++) 
                    {
                        shortestArray[i] += Math.sqrt(Math.abs(((coordinates[k][l] - coordinates[i][j]) * (coordinates[k][l] - coordinates[i][j])) + ((coordinates[k][l+1] - coordinates[i][j + 1]) * (coordinates[k][l+1] - coordinates[i][j + 1]))));
                    }    
                }

            }
        } 
        
        shortest = shortestArray[0]; 

        for (int i = 1; i < shortestArray.length - 1; i++) 
        {
            if (shortest > shortestArray[i]){
                shortest = shortestArray[i];
                locationIndex = i;
                
            }
                
        }
        
        System.out.println("The central city is at (" + coordinates[locationIndex][0] + ", " + coordinates[locationIndex][1] + ")");

        return shortest;
    }
    
}

import java.util.Scanner;

public class Exercise07_11 {
    public static void main(String[] args) {
   	    Scanner input = new Scanner(System.in);
        int number = 0, arraySize = 0;
        boolean sorted = true;
        
    	System.out.println("Enter list of numbers: ");
   	 
        arraySize = input.nextInt();
        int[] numberArray = new int[arraySize];

    	for (int i = 0; i < numberArray.length; i++){
        	numberArray[i] = input.nextInt();
        }
        
    	for (int i = 0; i < numberArray.length; i++){
    	    if (numberArray[i] > numberArray[i + 1]){
    	        sorted = false;
    	        break;
    	    } else if (numberArray[i] <= numberArray[i + 1]){
    	         sorted = true;
    	    }
        	    
        }

        if (sorted == false){
            System.out.println("The list is not sorted");
        } else if (sorted == true){
             System.out.println("The list is already sorted");
        }

    } 
}

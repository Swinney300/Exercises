package Java.isRectangular;

public class Rectangular {
    boolean isRectangular = true;
    int[][] a2d = {{1, 1, 1}, 
                    {2, 2, 2}, 
                    {3, 3, 3}, 
                    {4, 4, 4}};
    for (int row = 0; row < a2d.length - 1; row++){
        
        if (a2d[row].length != a2d[row + 1].length){
            isRectangular = false;
            break;
        }
            
    }
    
    System.out.println(isRectangular);

}
public class TestGridArray {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}, {7, 8}};
        int[][] matrix3 = {{9, 10}, {11, 12}};   
        
        printMatrices(matrix1, matrix2, matrix3);
    }

    public static void printMatrices(int[][] m1, int[][] m2, int[][] m3) {
        
        System.out.println("Matrix 1\t\tMatrix 2\t\tMatrix 3");
        
        for (int i = 0; i < m1.length; i++) 
        {
            for (int j = 0; j < m1[i].length; j++) 
            {
                System.out.print(m1[i][j]);  
            }
            for (int j = 0; j < m2[i].length; j++) 
            {
                System.out.print(m2[i][j]);  
            }
            for (int j = 0; j < m3[i].length; j++) 
            {
                System.out.print(m3[i][j]);  
            }
            System.out.println();
        }
    }
    

}

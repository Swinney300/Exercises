public class StrictlyIdentical {
    public static void main(String[] args) {
        int[][] m1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] m2 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println(equals(m1, m2));
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        boolean equals = true;

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    equals = false;
                    break;
                }
            }
        }

        return equals;

    }
}

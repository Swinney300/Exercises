/*
Name: Michael Swinney 
Lab: Chapter 7 
Description: Write a RainFall class that stores the total rainfall for each of 12 months
 * into an array of doubles. The program should have methods that return the
 * following:
 * 
 * the total rainfall for the year
 * 
 * the average monthly rainfall
 * 
 * the month with the most rain
 * 
 * the month with the least rain
 * 
 * Demonstrate the class in a complete program.
 * 
 * Input Validation: Do not accept negative numbers for monthly rainfall
 * figures.
 */

public class RainFall {

    public static void main(String[] args) {
        double[] months = { -1.5, 2.8, 6.7, 9.6, 5.0, -10.7, 2.5, 1.6, 19.3, 16.0, 1.0, 7.0 };

        System.out.println("The total rainfall is " + totalRainFall(months));
        System.out.println("The average rainfall is " + averageRainFall(months));
        System.out.println("The highest rainfall is " + highestRainFall(months));
        System.out.println("The lowest rainfall is " + lowestRainFall(months));

    }

    /*
     * static double[] positiveArray(double[] positiveArray) {
     * 
     * int positiveCount = 0;
     * 
     * for (double d : positiveArray) {
     * if (d >= 0) {
     * positiveCount++;
     * }
     * }
     * 
     * double[] newArray = new double[positiveCount];
     * 
     * for (int i = 0; i < positiveArray.length; i++) {
     * if (positiveArray[i] < 0) {
     * continue;
     * } else {
     * newArray[i] = positiveArray[i];
     * }
     * }
     *
     * return newArray;
     * 
     * }
     */
    static double totalRainFall(double[] months) {

        double total = 0;

        for (double month : positiveArray(months)) {
            total += (month >= 0) ? month : 0;
        }
        return total;
    }

    static double averageRainFall(double[] months) {

        int positiveCount = 0;

        for (double d : months) {
            if (d >= 0) {
                positiveCount++;
            }
        }

        return totalRainFall(months) / positiveCount;
    }

    static double highestRainFall(double[] months) {

        double max = 0;

        for (double month : months) {
            if (max < month)
                max = month;

        }
        return max;
    }

    static double lowestRainFall(double[] months) {

        double lowest = 0;

        for (double month : months) {
            if (month >= 0) {
                lowest = month;
                break;
            }
        }

        for (double month : months) {
            if (lowest > month)
                lowest = month;
        }

        return lowest;
    }

}

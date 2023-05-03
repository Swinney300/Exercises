import java.util.Scanner;
import java.lang.Math;

public class Exercise07_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numberArray = new double[10];

		System.out.println("Enter ten numbers: ");

		for (int i = 0; i < 10; i++) {
			numberArray[i] = input.nextDouble();
		}

		System.out.println("The mean is " + mean(numberArray));
		System.out.println("The standard deviation is " + deviation(numberArray));

	}

	public static double mean(double[] x) {
		double sum = 0;

		for (int i = 0; i < x.length; i++)
			sum += x[i];

		return sum / x.length;

	}

	public static double mean(int[] x) {
		double sum = 0;

		for (int i = 0; i < 10; i++)
			sum += x[i];

		return sum / x.length;
	}

	public static double deviation(double[] x) {
		double squareSum = 0;
		double mean = mean(x);

		for (int i = 0; i < x.length; i++) {
			squareSum += Math.pow(x[i] - mean, 2);
		}

		return Math.sqrt(squareSum / (x.length - 1));
	}

	public static double deviation(int[] x) {
		double squareSum = 0;
		double mean = mean(x);

		for (int i = 0; i < x.length; i++) {
			squareSum += Math.pow(x[i] - mean, 2);
		}

		return Math.sqrt(squareSum / (x.length - 1));
	}

	public void printArray(int[] x) {
		for (int i : x)
			System.out.print(i + " ");

		System.out.println();
	}
}

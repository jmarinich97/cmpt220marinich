package cmpt220;

import java.util.Scanner;

public class Problem7_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[] doubles = new double[10];
		System.out.println("Enter 10 numbers:  ");
		
		for (int i = 0; i < 10; i++) {
			doubles[i] = input.nextDouble();
		}
		System.out.printf("The minimum number is %.2f", min(doubles));
	}
	
	public static double min(double[] array) {
		double min = array[0];
		for (int i = 0; i < 10; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

}

package cmpt220;

import java.util.Scanner;

public class Problem9_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns in the array:  ");
		int rows = input.nextInt();
		int columns = input.nextInt();
		double[][] array = new double[rows][columns];
		System.out.println("Enter the array:  ");
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}
		Location x = Location.locateLargest(array);
		
		System.out.printf("The location of the largest element is %d at (%d, %d)", (int)x.maxValue, x.row, x.column);
		
	}

}

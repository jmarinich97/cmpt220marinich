package cmpt220;

import java.util.Scanner;

public class Problem8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[][] matrix = new double[3][4];
		System.out.println("Enter a 3-by-4 matrix row by row:  ");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextDouble();
			}
		}
		for (int i = 0; i < 4; i++) {
			System.out.printf("Sum of the elements at column %d is %.2f\n", i, sumColumn(matrix, i));
		}
	}
	
	public static double sumColumn(double[][] m, int columnIndex) {
		double total = 0;
		for (int row = 0; row < m.length; row++) {
		    total += m[row][columnIndex];	
		}
		
		return total;
	}
}

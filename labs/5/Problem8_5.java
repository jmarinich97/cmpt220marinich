package cmpt220;

import java.util.Scanner;

public class Problem8_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter matrix1:  ");
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		
		for (int row = 0; row < matrix1.length; row++) {
			for (int column = 0; column < matrix1[row].length; column++) {
				matrix1[row][column] = input.nextDouble();
			}
		}
		
		System.out.println("Enter matrix2:  ");
		for (int row = 0; row < matrix2.length; row++) {
			for (int column = 0; column < matrix2[row].length; column++) {
				matrix2[row][column] = input.nextDouble();
			}
		}
		for (int row = 0; row < matrix1.length; row++) {
			for (int column = 0; column < matrix1[row].length; column++) {
				System.out.print(matrix1[row][column]+ " ");
			}
				System.out.println();
			
		}
		System.out.println("    +");
		
		for (int row = 0; row < matrix2.length; row++) {
			for (int column = 0; column < matrix2[row].length; column++) {
				System.out.print(matrix2[row][column]+ " ");
				
				
			}
			System.out.println();
		}
		
		System.out.println("    =");
		
		double[][] matrix3 = addMatrix(matrix1, matrix2);
		for (int row = 0; row < matrix3.length; row++) {
			for (int column = 0; column < matrix3[row].length; column++) {
				System.out.print(matrix3[row][column]+ " ");
			}
			System.out.println();
		}
		System.out.println();

	}
	
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] c = new double[3][3];
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < c[row].length; column++) {
				c[row][column] = a[row][column] + b[row][column];
			}
		}
		return c;
	}

}

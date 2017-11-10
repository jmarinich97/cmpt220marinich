package cmpt220;

import java.util.Scanner;

public class Problem12_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[100];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int)(Math.random() * 100);
		}
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an index:  ");
		int index = input.nextInt();
		try {		
			System.out.println(array1[index]);
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of bounds");
		}
	}

}

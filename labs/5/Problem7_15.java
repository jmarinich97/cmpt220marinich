package cmpt220;

import java.util.Scanner;

public class Problem7_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		System.out.println("Enter 10 numbers:  ");
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		System.out.print("The distinct numbers are: ");
		numbers = eliminateDuplicates(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
	
	public static int[] eliminateDuplicates(int[] list) {
		boolean isDuplicate;
		int[] duplicates = new int[list.length];
		for (int i = 0; i < list.length; i++) {
			isDuplicate = false;
			for (int j = i++; j < list.length; j++) {
				if (list[i] != list[j]) {
					continue;
				}
				else {
					isDuplicate = true;
				}
				if (!isDuplicate) {
					duplicates[i] = list[i];
				}
			}
		}
		return duplicates;
	}
}

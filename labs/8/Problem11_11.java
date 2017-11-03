package cmpt220;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem11_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		System.out.println("Enter 5 integers");
		int int1 = input.nextInt();
		int int2 = input.nextInt();
		int int3 = input.nextInt();
		int int4 = input.nextInt();
		int int5 = input.nextInt();
		
		a.add(int1);
		a.add(int2);
		a.add(int3);
		a.add(int4);
		a.add(int5);

		sort(a);
		System.out.println(a);


	}
	
	public static void sort(ArrayList<Integer> list) {
		Collections.sort(list); 
	}

}

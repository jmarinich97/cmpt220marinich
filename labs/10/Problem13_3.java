package cmpt220;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem13_3 {

	public static void main(String[] args) {
		// Create and arrayList
		ArrayList<Number> list1 = new ArrayList<>();

		// Add unsorted numbers to list
		list1.add(7);
		list1.add(14);
		list1.add(5.3);
		list1.add(62.7);
		list1.add(90);
		list1.add(81.273);

		System.out.println("Before sorted: " + list1.toString());

		sort(list1);

		System.out.println("After sorted: " + list1.toString());
	}

	public static void sort(ArrayList<Number> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			Number min = list.get(i);
			int minIndex = i;

			for (int count = i + 1; count < list.size(); count++) {
				if (min.doubleValue() > list.get(count).doubleValue()) {
					min = list.get(count);
					minIndex = count;
				}
			}

			if (minIndex != i) {
				list.set(minIndex, list.get(i));
				list.set(i, min);
			} 
		}
	}
}


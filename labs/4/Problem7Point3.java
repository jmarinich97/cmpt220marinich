package cmpt220;

import java.util.Scanner;

public class Problem7Point3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] values = new int[100];
    int element;
    int count = 0;
    System.out.print("Enter ten integers between 1 and 100 (End with 0): ");
    do
    {
      element = input.nextInt();
      values[count] = element;
      count++;
    }
    while (element != 0);

    occurence(values);
  }

  public static void occurence(int[] list) {
    for (int i = 1; i <= 100; i++) {
      int count = 0;
      for (int j = 0; j < list.length - 1; j++) {
        if (list[j] == i)
          count += 1;
        }
        if (count != 0)
          System.out.printf("%d occurs %d %s%n", 
          i, count, count > 1 ? "times" : "time");
    } 
  }
}

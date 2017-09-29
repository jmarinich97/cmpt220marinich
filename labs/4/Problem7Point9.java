package cmpt220;

import java.util.Scanner;

public class Problem7Point9 {

  public static void main(String[] args) {

  double[] numbers = new double[10];
  Scanner input = new Scanner(System.in);

  System.out.print("Enter 10 numbers: ");
  for (int i = 0; i < numbers.length; i++) {
	  numbers[i] = input.nextDouble();
  }
     System.out.println("The minimum number is: " + min(numbers));
    }

  public static double min(double[] array) {

    double min = array[0];
    for (int i = 0; i < array.length; i++) {
      if (min > array[i]) min = array[i];
        }
    return min;
    }
}

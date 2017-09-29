package cmpt220;

import java.util.Scanner;

public class Problem6Point17 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    System.out.println("Enter n:  ");
    int n = input.nextInt();
    printMatrix(n);
  }
  public static void printMatrix(int n) {
	for (int i = 0; i < n; i++) {  
      for (int j = 0; j < n; j++) {
    	    System.out.printf("%d", ((int)(Math.random() * 2)));
    	    if (j != (n-1)) {
    	    	  System.out.print(" ");
    	    }
      }
      if (i != (n-1)) {
        System.out.print("\n");
      }
    }
  }
}

package cmpt220;

import java.util.Scanner;

public class Problem5Point1 {

  public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	System.out.println("Enter an integer, the input ends if it is 0:  ");
	int number;
	number = input.nextInt();
	int total = 0;
	int positives = 0;
	int negatives = 0;
	double average = 0;
	int counter = 0;		
	if (number == 0) {
	  System.out.println("No numbers are entered except 0");
	  System.exit(1);
	}
	while (number != 0) {	
	  total += number;
      counter++;
	  if (number > 0) {
	    positives++;
	  }
	  else if (number < 0) {
	    negatives++;
	  }
	  number = input.nextInt();
	}
	average = (double)total / (double)counter;
	System.out.printf("The number of positives is %d\nThe number of negatives is %d\n"
	  + "The total is %d\nThe average is %.2f", positives, negatives, total, average);
		
	}

}


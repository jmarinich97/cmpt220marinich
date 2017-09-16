package cmpt220;

import java.util.Scanner;

public class Problem3Point2 {

  public static void main(String[] args) {
	// TODO Auto-generated method stub
	int number1  = (int)(System.currentTimeMillis() % 10 );
	int number2  = (int)(System.currentTimeMillis() / 10 % 10);
	int number3 = (int)(System.currentTimeMillis() / 10 % 8);
	
	Scanner input = new Scanner(System.in);
	
	System.out.printf("What is %d + %d + %d?  ", number1, number2, number3);
	int answer = input.nextInt();
	
	System.out.printf("%d + %d + %d = %d is %b", number1, number2, number3, answer, (number1 + number2 + number3 == answer));

	}

}
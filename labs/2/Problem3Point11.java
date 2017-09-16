package cmpt220;

import java.util.Scanner;

public class Problem3Point11 {

  public static void main(String[] args) {
	// TODO Auto-generated method stub
	int year;
	int monthInt;
	String monthStr = "";
	int days = 0;
		
	Scanner input = new Scanner(System.in);
		
	System.out.println("Enter a month:  ");
	monthInt = input.nextInt();
	System.out.println("Enter a year:  ");
	year = input.nextInt();
		
	if (monthInt == 1) {
	  monthStr = "January";
	  days = 31;
	}
	else if (monthInt == 2) {
	  monthStr = "February";
	  if (year % 4 == 0) {
		days = 29;
	  }
	  else {
		days = 28;
	  }
	}
	else if (monthInt == 3) {
	  monthStr = "March";
	  days = 31;
	}
	else if (monthInt == 4) {
	  monthStr = "April";
	  days = 30;
	}
	else if (monthInt == 5) {
	  monthStr = "May";
	  days = 31;
	}
	else if (monthInt == 6) {
	  monthStr = "June";
	  days = 30;
	}
	else if (monthInt == 7) {
	  monthStr = "July";
	  days = 31;
	}
	else if (monthInt == 8) {
	  monthStr = "August";
	  days = 31;
	}
	else if (monthInt == 9) {
	  monthStr = "September";
	  days = 30;
	}
	else if (monthInt == 10) {
	  monthStr = "October";
	  days = 31;
	}
	else if (monthInt == 11) {
	  monthStr = "November";
	  days = 30;
	}
	else if (monthInt == 12) {
	  monthStr = "December";
	  days = 31;
	}
	
	System.out.printf("%s %d has %d days", monthStr, year, days);
	
	}

}

package cmpt220;

import java.util.Scanner;

public class Problem3Point5 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
  
    System.out.println("Enter today's day:  ");
    int todayInt = input.nextInt();
    System.out.println("Enter the number of days elapsed since today:  ");
    int elapsedInt = input.nextInt();
  
    int elapsed  = ((elapsedInt + todayInt) % 7);
   
    String todayStr = "";
    String elapsedStr = "";
  
    if (todayInt == 0) {
      todayStr = "Sunday";
    }
    else if (todayInt == 1) {
  	todayStr = "Monday";
    }
    else if (todayInt == 2) {
  	todayStr = "Tueday";
    }
    else if (todayInt == 3) {
	  todayStr = "Wednesday";
    }
    else if (todayInt == 4) {
	  todayStr = "Thursday";
    }
    else if (todayInt == 5) {
  	todayStr = "Friday";
    }
    else if (todayInt == 6) {
  	todayStr = "Saturday";
    }
  
    if (elapsed == 0) {
      elapsedStr = "Sunday";
    }
    else if (elapsed == 1) {
      elapsedStr = "Monday";
    }
    else if (elapsed == 2) {
	  elapsedStr = "Tueday";
    }
    else if (elapsed == 3) {
	  elapsedStr = "Wednesday";
    }
    else if (elapsed == 4) {
	  elapsedStr = "Thursday";
    }
    else if (elapsed == 5) {
  	  elapsedStr = "Friday";
    }
    else if (elapsed == 6) {
      elapsedStr = "Saturday";
    }
  
    System.out.printf("Today is %s and the future day is %s", todayStr, elapsedStr);
  
  

	}

}

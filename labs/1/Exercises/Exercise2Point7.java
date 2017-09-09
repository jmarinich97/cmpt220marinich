package cmpt220;
import java.util.Scanner;

public class Exercise2Point7 {

  public static void main(String[] args) {
  // TODO Auto-generated method stub
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the number of minutes:  ");
  int minutes = input.nextInt();
  int years = minutes / 525600;
  int remainingMinutes = minutes % 525600;
  int days = remainingMinutes / 1440;
  System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
	}

}

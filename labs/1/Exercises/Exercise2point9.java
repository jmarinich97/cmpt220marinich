package cmpt220;
import java.util.Scanner;

public class Exercise2point9 {

  public static void main(String[] args) {
  // TODO Auto-generated method stub
  Scanner input = new Scanner(System.in);
  System.out.print("Enter v0:  ");
  double startingVelocity = input.nextDouble();
  System.out.print("Enter v1:  ");
  double endingVelocity  = input.nextDouble();
  System.out.print("Enter t:  ");
  double time = input.nextDouble();
  double averageAcceleration = (endingVelocity - startingVelocity) / time;
  System.out.print("The average acceleration is " + averageAcceleration);
  
	}

}

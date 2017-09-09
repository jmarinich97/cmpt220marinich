package cmpt220;
import java.util.Scanner;

public class Exercise2point5 {

  public static void main(String[] args) {
  // TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
    System.out.print("Enter subtotal:  ");
    double subtotal = input.nextDouble();
    System.out.print("Enter gratuity rate:  ");
    double gratuityRate = input.nextDouble();
    double gratuity = (gratuityRate * subtotal) / 100;
    double total = gratuity + subtotal;
    System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
    
	}

}

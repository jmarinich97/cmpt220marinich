package cmpt220;

import java.util.Scanner;

public class Problem3Point17 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    String userChoice = "";
    String compChoice = "";
  
    int comp = (1 + (int)(Math.random() * (3)));
  
    System.out.println("Enter scissor <0> rock <1> paper <2>");
    int user = input.nextInt();
  
    if (comp == 0) {
      compChoice = "scissor";
    }
    else if (comp == 1) {
	  compChoice = "rock";
    }
    else {
	  compChoice = "paper";
    }
  
  
    if (user == 0) {
      userChoice = "scissor";
    }
    else if (user == 1) {
      userChoice = "rock";
    }
    else {
      userChoice = "paper";
    }
  
  
    if (user > comp) {
      System.out.printf("The computer is %s. You are %s. You win!", compChoice, userChoice);
    }
    else if (user == comp) {
      System.out.printf("The computer is %s. You are %s. It is a draw!", compChoice, userChoice);
    }
    else {
      System.out.printf("The computer is %s. You are %s. You lose!", compChoice, userChoice);
    }
   
  
    }

}

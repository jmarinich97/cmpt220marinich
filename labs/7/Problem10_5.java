package cmpt220;

import java.util.Scanner;

public class Problem10_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/***********
		 * 
		 * 
		 * Had trouble getting an input for this
		 * 
		 */
		Scanner input = new Scanner(System.in);
        int[] primeNums = new int[100];
        StackOfIntegers stack = new StackOfIntegers();

        System.out.println("Enter a positive integer: ");
        int num = input.nextInt();

        int size = stack.getSize();
        System.out.println("The smallest prime factors of " + num + " are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void getFactors(int value, StackOfIntegers stack) {
        int[] values = new int[100];
        values[0] = value;

        int count = 1;

        for (int maybePrime : values) {
            if (isPrime(maybePrime)) {
                stack.push(maybePrime);
                break;
            } 

            for (int i = 2; i < maybePrime; i++) {
                if (maybePrime % i == 0) {
                    stack.push(i);
                    values[count] = maybePrime / i;
                    break;
                }
            }
            count++;
        }
    }



    public static boolean isPrime(int value) {
        if (value == 1 || value == 2) {
            return true;
        } 
        else {
            for (int i = 2; i < value; i++) {
                if (value % i == 0)
                    return false;
            }
        }
        return true;
    }
}



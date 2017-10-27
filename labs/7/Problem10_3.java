package cmpt220;

public class Problem10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInteger myInt = new MyInteger(10);
		System.out.println("getValue(): " + myInt.getValue());
		
		System.out.println("isEven(): " + myInt.isEven());
		System.out.println("isOdd(): " + myInt.isOdd());
		System.out.println("isPrime(): " + myInt.isPrime());
		
		System.out.println("getValue(): " + myInt.getValue());
		
		System.out.println("isEven(int 5): " + myInt.isEven(5));
		System.out.println("isOdd(int 5): " + myInt.isOdd(5));
		System.out.println("isPrime(int 5): " + myInt.isPrime(5));
		
		System.out.println("isEven(new MyInteger(20)): " + myInt.isEven(new MyInteger(20)));
		System.out.println("isOdd(new MyInteger(20)): " + myInt.isOdd(new MyInteger(20)));
		System.out.println("isPrime(new MyInteger(20)): " + myInt.isPrime(new MyInteger(20)));

		System.out.println("equals(int 5): " + myInt.equals(5));
		System.out.println("equals(new MyInteger(20): " + myInt.equals(new MyInteger(20)));
		
		System.out.println("parseInt(\"12\"): " + myInt.parseInt("12"));


	}

}

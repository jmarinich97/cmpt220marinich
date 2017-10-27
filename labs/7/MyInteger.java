package cmpt220;

public class MyInteger {
	private int value;
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isEven() {
		return value % 2 == 0;
	}
	
	public boolean isOdd() {
		return (value % 2) != 0;
	}
	
	public boolean isPrime() {
		boolean isPrime = true;
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				isPrime = false;
				break;
			}		
		}
		return isPrime;
	}
	
	public static boolean isEven(int value) {
		return value % 2 == 0;
	}
	
	public static boolean isOdd(int value) {
		return value % 2 != 0;
	}
	
	public static boolean isPrime(int value) {
		boolean isPrime = true;
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				isPrime = false;
				break;
			}		
		}
		return isPrime;
	}
	
	public boolean isEven(MyInteger value) {
		return value.isEven();
	}
	
	public boolean isOdd(MyInteger value) {
		return value.isOdd();
	}
	
	public boolean isPrime(MyInteger value) {
		return value.isPrime();
	}
	
	public boolean equals(int value) {
		return this.value == value;
	}
	
	public boolean equals(MyInteger value) {
		return this.value == value.getValue();
	}
	
	public static int parseInt(char[] value) {
		int intVal = 0;
		for (char char1 : value) {
			intVal += Character.getNumericValue(char1);
		}
		return intVal;
	}
	
	public static int parseInt(String value) {
		return Integer.parseInt(value);
	}
}

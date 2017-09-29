package cmpt220;

public class Problem6Point13 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	System.out.printf("i\tm(i)\n--------------\n");
    for (int i = 1; i <= 20; i++) {
    	  System.out.printf("%d\t%.4f\n", i, summation((double)i));
    }
  }
  public static double summation(double number) {
	double finalSum = 0;
	double tempSum = 0;
	for (int i = 1; i <= number; i++) {
	  tempSum = ((double)i/(i+1));
	  finalSum += tempSum;
	}
    return finalSum;
  }

}

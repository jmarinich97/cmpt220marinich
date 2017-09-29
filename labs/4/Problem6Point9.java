package cmpt220;

public class Problem6Point9 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	System.out.println("Feet\tMeters\t|\tMeters\tFeet\n-------------------------------------");
	double j = 20.0;
	for (double i = 1.0; i <= 10; i++) {
	  System.out.printf("%.1f\t%.3f\t|\t%.1f\t%.3f\n", i, footToMeter(i), j, meterToFoot(j));
	  j += 5;
	}
  }
  public static double footToMeter(double foot) {
    return (.305 * foot);	
  }
  
  public static double meterToFoot(double meter) {
	  return (3.279 * meter);
  }

}

package cmpt220;

public class Problem5Point5 {

  public static void main(String[] args) {
  // TODO Auto-generated method stub
  int kilos = 0;
  int pounds = 20;
  System.out.println("Kilograms\tPounds\t  |\tPounds\tKilograms");
  for (kilos = 1; kilos <= 199; kilos += 2) {
	double kilosToPounds = (1 / .45) * kilos;
	double poundsToKilos = (1 / 2.2) * pounds;
    System.out.printf("%d\t\t%.2f\t  |\t%d\t%.2f\n", kilos, kilosToPounds, pounds, poundsToKilos);
    pounds += 5;
    }
  }

}

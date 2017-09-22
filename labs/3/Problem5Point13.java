package cmpt220;

public class Problem5Point13 {

  public static void main(String[] args) {
  // TODO Auto-generated method stub
  int n = 0;
  while (Math.pow(n, 3) < 12000) {
    System.out.println(n);
    n++;
  }
  System.out.println("The largest integer n such that n^3 < 12000 is " + (n - 1));
  }

}

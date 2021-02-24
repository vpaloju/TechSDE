package interviewquestions.salesForce;

/**
 * calculate power(x,n) in log(n) time
 */
public class PowerOfNumber {

  public static int power(int x, int n) {
    if (n == 0) {
      return 1;
    }
    int result = power(x, n / 2);
    if (n % 2 == 0) {
      return result * result;
    } else {
      return x * result * result;
    }
  }

  public static void main(String[] args) {
    System.out.println(power(5, 1));
  }
}

package interviewquestions.serviceNow;

/**
 * Given a number which is a factorial of the number need to find out that number.
 */
public class FindNumberOfFactorial {

  public static int findNumberOfFactorial(int n) {
    int factorial = 1;
    if (n == 0) {
      return 1;
    }
    for (int i = 1; i < Math.sqrt(n); i++) {
      factorial = factorial * i;
      if (factorial == n) {
        return i;
      }
    }
    System.out.println("The given number is not a factorial!");
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(findNumberOfFactorial(120));
  }
}

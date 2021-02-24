package interviewquestions.salesForce;

public class Factorial {

  public static int factorial(int num) {
    return (num == 1 || num == 0) ? 1 : num * factorial(num - 1);
  }

  public static void main(String[] args) {
    System.out.println(factorial(5));
  }
}

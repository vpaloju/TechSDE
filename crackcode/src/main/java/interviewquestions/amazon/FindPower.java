package interviewquestions.amazon;

public class FindPower {

  public static int findPowerOfNumber(int base, int exponent) {
    int result = 1;
    if (exponent == 0) {
      return result;
    } else {
      while (exponent != 0) {
        result *= base;
        exponent--;
      }
      return result;
    }
  }

  public static int power(int base, int exponent) {
    int result = 1;
    for (int i = 1; i <= exponent / 2; i++) {
      result *= base;
    }
    if (exponent % 2 == 0) {
      return result * result;
    } else {
      return result * result * base;
    }
  }

  public static int powerUsingRecursion(int base, int exponent) {
    if (exponent == 0) {
      return 1;
    }
    return base * (powerUsingRecursion(base, exponent - 1));
  }

  public static void main(String[] args) {
    System.out.println(findPowerOfNumber(2, 4));
    System.out.println(power(2, 5));
    System.out.println(powerUsingRecursion(2, 5));
  }
}

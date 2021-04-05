package interviewquestions.serviceNow;

public class CheckBinaryNumber {

  public static boolean isBinaryNumber(int n) {
    while (n > 0) {
      if (n % 10 > 1) {
        return false;
      }
      n /= 10;
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.print(isBinaryNumber(1100101));
  }
}

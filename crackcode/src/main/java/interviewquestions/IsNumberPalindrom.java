package interviewquestions;

public class IsNumberPalindrom {

  public static boolean isPalindrom(int n) {
    int reverse = 0, temp = n;
    while (n > 0) {
      reverse = reverse * 10 + n % 10;
      n /= 10;
    }
    if (reverse == temp) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    System.out.println(isPalindrom(333));
  }
}

package interviewquestions.salesForce;

public class NumberPalindrome {

  public static boolean isPalindrome(int num) {
    int x = num, reverse = 0;
    while (x > 0) {
      int digitValue = x % 10;
      reverse = reverse * 10 + digitValue;
      x /= 10;
    }
    return reverse == num;
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome(363));
  }
}

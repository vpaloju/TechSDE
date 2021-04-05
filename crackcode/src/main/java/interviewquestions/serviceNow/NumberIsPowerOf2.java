package interviewquestions.serviceNow;

public class NumberIsPowerOf2 {

  public static boolean isNumberPowerOf2(int num) {
    return num != 0 && ((num & (num - 1)) == 0);
  }

  public static void main(String[] args) {
    System.out.println(isNumberPowerOf2(32));
    System.out.println(isNumberPowerOf2(33));
  }
}

package interviewquestions;

/**
 * The first few Armstrong numbers between 0 to 999 are 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407. Some other Armstrong numbers are 1634, 8208, 9474, 54748, 92727, 93084, 548834, 1741725, 4210818, 9800817, 9926315, 24678050, 24678051, 88593477, 146511208, 472335975, 534494836, 912985153, 4679307774, 32164049650, 32164049651.
 */
public class ArmstrongNumber {

  public static int lenghtOfNumber(int num) {
    int length = 0;
    while (num > 0) {
      num /= 10;
      length++;
    }
    return length;
  }

  public static boolean armstrong(int num) {
    int sum = 0, temp = num;
    int length = lenghtOfNumber(num);
    while (temp > 0) {
      int digit = temp % 10;
      sum += Math.pow(digit, length);
      temp /= 10;
    }
    if (sum == num) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    System.out.println(armstrong(472335975));
  }
}

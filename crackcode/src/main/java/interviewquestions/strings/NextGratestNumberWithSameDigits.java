package interviewquestions.strings;

import java.util.Arrays;

public class NextGratestNumberWithSameDigits {

  public static void nextGratestNumberWithSameDigits(char[] a, int n) {
    int i;
    //From n to 0 checking current element is grater than previous.
    for (i = n - 1; i > 0; i--) {
      if (a[i] > a[i - 1]) {
        break;
      }
    }
    //Digits are in de sending order.
    if (i == 0) {
      System.out.println("Not possible");
      return;
    } else {
      //Find smallest digit in right side from i-1 to n.
      int x = a[i - 1], min = i;
      for (int j = i; j < n; j++) {
        if (a[j] > x && a[j] < a[min]) {
          min = j;
        }
      }
      //Swap the above found smallest digit with number[i-1]
      swap(a, i - 1, min);
    }
    //Sort the digits after (i-1)  in ascending order
    Arrays.sort(a, i, n);
    System.out.println("Next gratest numbet is: ");
    for (i = 0; i < n; i++) {
      System.out.print(a[i]);
    }
  }

  public static void swap(char[] a, int i, int j) {
    char temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

  public static void main(String[] args) {
    String s = "218765";
    nextGratestNumberWithSameDigits(s.toCharArray(), s.length());
  }
}

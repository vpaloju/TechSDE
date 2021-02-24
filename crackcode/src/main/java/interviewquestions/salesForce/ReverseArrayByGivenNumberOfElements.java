package interviewquestions.salesForce;

import java.util.Arrays;

public class ReverseArrayByGivenNumberOfElements {

  public static int[] reverseArray(int[] a, int numberOfElementsToReverse) {
    int start = 0, end = numberOfElementsToReverse;
    while (start <= end) {
      int temp = a[start];
      a[start] = a[end];
      a[end] = temp;
      start++;
      end--;
    }
    return a;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(reverseArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5)));
  }
}

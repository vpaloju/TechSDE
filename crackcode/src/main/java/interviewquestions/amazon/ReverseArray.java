package interviewquestions.amazon;

import java.util.Arrays;

public class ReverseArray {

  public static int[] reverseArray(int[] a, int limit) {
    int start = 0;
    if (limit > a.length || limit < 0) {
      return null;
    }
    while (start < limit) {
      a[start] ^= a[limit];
      a[limit] ^= a[start];
      a[start] ^= a[limit];
      start++;
      limit--;
    }
    return a;
  }

  public static int[] reverseArray(int[] a) {
    for (int start = 0, end = a.length - 1; start < end; start++, end--) {
      int temp = a[start];
      a[start] = a[end];
      a[end] = temp;
    }
    return a;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(reverseArray(new int[]{1, 2, 3, 4, 5, 6}, 5)));
    System.out.println(Arrays.toString(reverseArray(new int[]{1, 2, 3, 4, 5, 6})));
  }
}

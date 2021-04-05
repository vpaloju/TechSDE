package interviewquestions.serviceNow;

import java.util.Arrays;

public class SortBinaryArray {

  public static int[] sortBinaryArray(int[] a) {
    int k = a.length - 1;
    for (int i = 0; i < a.length; i++) {
      if (a[i] != 0) {
        a[k--] = a[i];
      }
    }
    while (k >= 0) {
      a[k--] = 0;
    }
    return a;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(sortBinaryArray(new int[]{1, 0, 1, 0, 0, 1, 0, 1})));
  }
}

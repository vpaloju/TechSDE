package arrays.arrayRotations;

import java.util.Arrays;

/**
 * Split the array and add the first part to the end
 * Last Updated: 06-12-2019
 * There is a given an array and split it from a specified position, and move the first part of array add to the end.
 * Split the array and add the first part to the end
 * <p>
 * Examples:
 * <p>
 * Input : arr[] = {12, 10, 5, 6, 52, 36}
 * k = 2
 * Output : arr[] = {5, 6, 52, 36, 12, 10}
 * Explanation : Split from index 2 and first
 * part {12, 10} add to the end .
 * <p>
 * Input : arr[] = {3, 1, 2}
 * k = 1
 * Output : arr[] = {1, 2, 3}
 * Explanation : Split from index 1 and first
 * part add to the end.
 */
public class SplitArrayAddFirstPartToLast {

  public static int[] splitArrayAddFirstPartToLast(int[] a, int k) {
    int n = a.length;
    for (int i = 0; i < k; i++) {
      int x = a[0];
      for (int j = 0; j < n - 1; j++) {
        a[j] = a[j + 1];
      }
      a[n - 1] = x;
    }
    return a;
  }

  public static void main(String[] args) {
    int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println(Arrays.toString(splitArrayAddFirstPartToLast(a, 3)));
  }
}

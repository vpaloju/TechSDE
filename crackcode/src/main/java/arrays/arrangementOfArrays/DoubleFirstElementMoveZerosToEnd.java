package arrays.arrangementOfArrays;

import java.util.Arrays;

/**
 * Double the first element and move zero to end
 * Last Updated: 08-08-2019
 * Given an array of integers of size n. Assume ‘0’ as invalid number and all other as valid number. Convert the array in such a way that if next number is a valid number and same as current number, double its value and replace the next number with 0. After the modification, rearrange the array such that all 0’s are shifted to the end.
 *
 * Examples:
 *
 * Input : arr[] = {2, 2, 0, 4, 0, 8}
 * Output : 4 4 8 0 0 0
 *
 * Input : arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8}
 * Output :  4 2 12 8 0 0 0 0 0 0
 */
public class DoubleFirstElementMoveZerosToEnd {

  public static int[] rearrangeByDouble(int[] a) {
    int n = a.length - 1;
    for (int i = 0; i < n; i++) {
      if (a[i] != 0 && a[i] == a[i + 1]) {
        a[i] *= 2;
        a[i + 1] = 0;
        i++;
      }
    }
    return moveAllZerosToEnd(a);
  }

  public static int[] moveAllZerosToEnd(int[] a) {
    int n = a.length;
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (a[i] != 0) {
        a[count++] = a[i];
      }
    }
    while (count < n) {
      a[count++] = 0;
    }
    return a;
  }

  public static void main(String[] args) {
    int[] a = new int[]{0, 2, 2, 2, 0, 6, 6, 0, 0, 8};
    System.out.println(Arrays.toString(rearrangeByDouble(a)));
  }
}

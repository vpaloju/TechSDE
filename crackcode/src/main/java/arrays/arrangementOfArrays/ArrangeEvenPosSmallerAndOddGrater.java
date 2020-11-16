package arrays.arrangementOfArrays;

import java.util.Arrays;

/**
 * Rearrange array such that even index elements are smaller and odd index elements are greater
 * Last Updated: 29-10-2018
 * Given an array, rearrange the array such that :
 * <p>
 * If index i is even, arr[i] <= arr[i+1]
 * If index i is odd, arr[i] >= arr[i+1]
 * Note : There can be multiple answers.
 * <p>
 * Examples:
 * <p>
 * Input  : arr[] = {2, 3, 4, 5}
 * Output : arr[] = {2, 4, 3, 5}
 * Explanation : Elements at even indexes are
 * smaller and elements at odd indexes are greater
 * than their next elements
 * <p>
 * Note : Another valid answer
 * is arr[] = {3, 4, 2, 5}
 * <p>
 * Input  :arr[] = {6, 4, 2, 1, 8, 3}
 * Output :arr[] = {4, 6, 1, 8, 2, 3}
 */
public class ArrangeEvenPosSmallerAndOddGrater {

  public static int[] arrangeEvenPosSmallerOddGrater(int[] a) {
    int n = a.length;
    for (int i = 0; i < n - 1; i++) {
      if (i % 2 == 0 && a[i] > a[i + 1]) {
        int temp = a[i];
        a[i] = a[i + 1];
        a[i + 1] = temp;
      }
      if (i % 2 != 0 && a[i] < a[i + 1]) {
        int temp = a[i];
        a[i] = a[i + 1];
        a[i + 1] = temp;
      }
    }
    return a;
  }

  public static void main(String[] args) {
    int[] a = new int[]{6, 4, 2, 1, 8, 3};//{4, 6, 1, 8, 2, 3}
    System.out.println(Arrays.toString(arrangeEvenPosSmallerOddGrater(a)));
  }
}

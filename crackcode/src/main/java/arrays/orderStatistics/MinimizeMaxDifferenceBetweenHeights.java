package arrays.orderStatistics;

import java.util.Arrays;

/**
 * Minimize the maximum difference between the heights
 * Given heights of n towers and a value k. We need to either increase or decrease height of every tower by k (only once) where k > 0. The task is to minimize the difference between the heights of the longest and the shortest tower after modifications, and output this difference.
 * <p>
 * Examples:
 * <p>
 * Input  : arr[] = {1, 15, 10}, k = 6
 * Output :  Maximum difference is 5.
 * Explanation : We change 1 to 6, 15 to
 * 9 and 10 to 4. Maximum difference is 5
 * (between 4 and 9). We can't get a lower
 * difference.
 */
public class MinimizeMaxDifferenceBetweenHeights {

  public static void main(String[] args) {
    int[] a = new int[]{3, 7, 8, 10, 14};
    System.out.println(minimizeMaxDifferenceBetweenHeights(a, a.length, 2));
  }

  /**
   * Modifies the array by subtracting/adding k to every element such that the difference between maximum and minimum is minimized
   *
   * @param a
   * @param n
   * @param k
   * @return
   */
  public static int minimizeMaxDifferenceBetweenHeights(int[] a, int n, int k) {
    if (n == 0) {
      return 0;
    }
    Arrays.sort(a);
    int result = a[n - 1] - a[0];
    //Handle corner elements first and last elements
    int small = a[0] + k;
    int big = a[n - 1] - k;

    if (small > big) {
      int temp = small;
      small = big;
      big = temp;
    }
    for (int i = 0; i < n; i++) {
      int add = a[i] + k;
      int substract = a[i] - k;
      // If both subtraction and addition do not change diff
      if (substract >= small || add <= big) {
        continue;
      }
      // Either subtraction causes a smaller number or addition causes a greater number. Update small or big using greedy approach (If big - subtract causes smaller diff, update smallElse update big)
      if (big - substract <= add - small) {
        small = substract;
      } else {
        big = add;
      }
    }
    return Math.min(result, big - small);
  }
}

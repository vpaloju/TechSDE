package arrays.orderStatistics;

import java.util.Arrays;

public class ChoclateDistribution {

  public static int minDifference(int[] a, int m) {
    int n = a.length;
    if (n < m) {
      return -1;
    }
    int min_diff = Integer.MAX_VALUE;
    Arrays.sort(a);
    for (int i = 0; i + m - 1 < n; i++) {
      int diff = a[i + m - 1] - a[i];
      if (diff < min_diff) {
        min_diff = diff;
      }
    }
    return min_diff;
  }

  public static void main(String[] args) {
    int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
    int m = 7;  // Number of students
    System.out.println("Minimum Difference is: " + minDifference(arr, m));
  }
}

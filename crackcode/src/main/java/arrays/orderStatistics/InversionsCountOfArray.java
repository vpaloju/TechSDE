package arrays.orderStatistics;

import java.util.Arrays;

public class InversionsCountOfArray {

  public static int inversionsCount(int[] a) {
    int inversionCount = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (a[i] > a[j]) {
          inversionCount++;
        }
      }
    }
    return inversionCount;
  }

  private static int mergeAndCount(int[] arr, int l, int m, int r) {
    int[] left = Arrays.copyOfRange(arr, l, m + 1);
    int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);
    int i = 0, j = 0, k = l, swaps = 0;
    while (i < left.length && j < right.length) {
      if (left[i] <= right[j])
        arr[k++] = left[i++];
      else {
        arr[k++] = right[j++];
        swaps += (m + 1) - (l + i);
      }
    }
    return swaps;
  }

  private static int mergeSortAndCount(int[] arr, int l, int r) {
    int count = 0;
    if (l < r) {
      int m = (l + r) / 2;
      // Total inversion count = left subarray count + right subarray count + merge count
      // Left subarray count
      count += mergeSortAndCount(arr, l, m);
      // Right subarray count
      count += mergeSortAndCount(arr, m + 1, r);
      // Merge count
      count += mergeAndCount(arr, l, m, r);
    }
    return count;
  }

  public static void main(String[] args) {
    int[] a = new int[]{8, 4, 2, 1};
    int[] b = new int[]{3, 1, 2};
    System.out.println(inversionsCount(a));
    System.out.println(inversionsCount(b));
    System.out.println(mergeSortAndCount(a, 0, a.length - 1));
    System.out.println(mergeSortAndCount(b, 0, b.length - 1));
  }
}

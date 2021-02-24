package arrays.orderStatistics;

import java.util.Arrays;

/**
 * Analysis
 * <p>
 * The steps to solve this problem:
 * 1) scan from right to left, find the first element that is less than its previous one.
 * 4 5 6 3 2 1
 * |
 * p
 * 2) scan from right to left, find the first element that is greater than p.
 * 4 5 6 3 2 1
 * |
 * q
 * 3) swap p and q
 * 4 5 6 3 2 1
 * swap
 * 4 6 5 3 2 1
 * 4) reverse elements [p+1, nums.length]
 * 4 6 1 2 3 5
 */
public class NextPermutation {
  public static void nextPermutation(int[] a) {
    //find first decreasing digit
    int mark = -1;
    for (int i = a.length - 1; i > 0; i--) {
      if (a[i] > a[i - 1]) {
        mark = i - 1;//p
        break;
      }
    }
    if (mark == -1) {
      reverse(a, 0, a.length - 1);
      return;
    }
    int idx = a.length - 1;
    for (int i = a.length - 1; i >= mark + 1; i--) {
      if (a[i] > a[mark]) {
        idx = i;
        break;
      }
    }
    swap(a, mark, idx);
    reverse(a, mark + 1, a.length - 1);
  }

  private static void swap(int[] nums, int i, int j) {
    int t = nums[i];
    nums[i] = nums[j];
    nums[j] = t;
  }

  private static void reverse(int[] nums, int i, int j) {
    while (i < j) {
      swap(nums, i, j);
      i++;
      j--;
    }
  }

  public static void main(String[] args) {
    int[] a = new int[]{4, 5, 6, 3, 2, 1};
    nextPermutation(a);
    System.out.println(Arrays.toString(a));
  }
}

package arrays.arrangementOfArrays;

import java.util.Arrays;

/**
 * Rearrange positive and negative numbers with constant extra space
 * Last Updated: 26-08-2019
 * Given an array of positive and negative numbers, arrange them such that all negative integers appear before all the positive integers in the array without using any additional data structure like hash table, arrays, etc. The order of appearance should be maintained.
 * <p>
 * Examples:
 * <p>
 * Input:  [12 11 -13 -5 6 -7 5 -3 -6]
 * Output: [-13 -5 -7 -3 -6 12 11 6 5]
 * Recommended: Please try your approach on {IDE} first, before moving on to the solution.
 * A simple solution is to use another array. We copy all elements of original array to new array. We then traverse the new array and copy all negative and positive elements back in original array one by one. This approach is discussed here. The problem with this approach is that it uses auxiliary array and we’re not allowed to use any data structure to solve this problem.
 * <p>
 * One approach that does not use any data structure is to use use partition process of QuickSort. The idea is to consider 0 as pivot and divide the array around it. The problem with this approach is that it changes relative order of elements. The similar partition process is discussed here .
 * Let’s now discuss few methods which do not use any other data structure and also preserves relative order of elements.
 * <p>
 * Approach 1: Modified Insertion Sort
 * <p>
 * We can modify insertion sort to solve this problem.
 * <p>
 * Algorithm –
 * <p>
 * Loop from i = 1 to n - 1.
 * a) If the current element is positive, do nothing.
 * b) If the current element arr[i] is negative, we
 * insert it into sequence arr[0..i-1] such that
 * all positive elements in arr[0..i-1] are shifted
 * one position to their right and arr[i] is inserted
 * at index of first positive element.
 */
public class ReArrangePosNegMaintainOrder {

  public static int[] reArrangePosNegWithSameOrder(int[] a) {
    int n = a.length;
    int key, j;
    for (int i = 1; i < n; i++) {
      key = a[i];
      if (key > 0) {
        continue;
      }
      j = i - 1;
      while (j >= 0 && a[j] > 0) {
        a[j + 1] = a[j];
        j--;
      }
      a[j + 1] = key;
    }
    return a;
  }

  public static void main(String[] args) {
    int[] a = new int[]{-12, 11, -13, -5, 6, -7, 5, -3, -6};
    System.out.println(Arrays.toString(reArrangePosNegWithSameOrder(a)));
  }
}

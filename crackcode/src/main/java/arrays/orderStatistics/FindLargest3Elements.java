package arrays.orderStatistics;

import java.util.Arrays;

/**
 * Find the largest three elements in an array
 * Last Updated: 07-09-2020
 * Given an array with all distinct elements, find the largest three elements. Expected time complexity is O(n) and extra space is O(1).
 * Examples :
 * <p>
 * Input: arr[] = {10, 4, 3, 50, 23, 90}
 * Output: 90, 50, 23
 * Recommended: Please try your approach on {IDE} first, before moving on to the solution.
 * Method 1 –
 * Below is algorithm:
 * <p>
 * 1) Initialize the largest three elements as minus infinite.
 * first = second = third = -∞
 * <p>
 * 2) Iterate through all elements of array.
 * a) Let current array element be x.
 * b) If (x > first)
 * {
 * // This order of assignment is important
 * third = second
 * second = first
 * first = x
 * }
 * c)  Else if (x > second)
 * {
 * third = second
 * second = x
 * }
 * d)  Else if (x > third)
 * {
 * third = x
 * }
 * <p>
 * 3) Print first, second and third.
 */
public class FindLargest3Elements {

  public static int[] largest3Numbers(int[] a) {
    int n = a.length;
    int first, second, third;
    first = second = third = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      if (a[i] > first) {
        third = second;
        second = first;
        first = a[i];
      } else if (a[i] > second) {
        third = second;
        second = a[i];
      } else if (a[i] > third) {
        third = a[i];
      }
    }
    return new int[]{first, second, third};
  }

  public static void main(String[] args) {
    int[] a = {12, 13, 1, 10, 34, 1};//34,13,12
    System.out.println(Arrays.toString(largest3Numbers(a)));
  }
}

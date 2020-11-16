package arrays.arrangementOfArrays;

import java.util.Arrays;

/**
 * Rearrange an array in order – smallest, largest, 2nd smallest, 2nd largest, ..
 * Last Updated: 30-07-2018
 * Given an array of integers, task is to print the array in the order – smallest number, Largest number, 2nd smallest number, 2nd largest number, 3rd smallest number, 3rd largest number and so on…..
 * <p>
 * Examples:
 * <p>
 * Input : arr[] = [5, 8, 1, 4, 2, 9, 3, 7, 6]
 * Output :arr[] = {1, 9, 2, 8, 3, 7, 4, 6, 5}
 * <p>
 * Input : arr[] = [1, 2, 3, 4]
 * Output :arr[] = {1, 4, 2, 3}
 */
public class ArrangeSmallestLargest {

  public static int[] arrangeSmallestLargest(int[] a) {
    int n = a.length;
    Arrays.sort(a);
    int[] res = new int[n];
    int resIndex = 0;
    // Traverse from begin and end simultaneously
    for (int i = 0, j = n - 1; i <= n / 2 || j > n / 2; i++, j--) {
      if (resIndex < n) {
        res[resIndex++] = a[i];
      }
      if (resIndex < n) {
        res[resIndex++] = a[j];
      }
    }
    return res;
  }

  /**
   * Rearrange an array in maximum minimum form | Set 2 (O(1) extra space)
   * Last Updated: 21-06-2019
   * Given a sorted array of positive integers, rearrange the array alternately i.e first element should be the maximum value, second minimum value, third-second max, fourth-second min and so on.
   * <p>
   * Examples:
   * <p>
   * Input: arr[] = {1, 2, 3, 4, 5, 6, 7}
   * Output: arr[] = {7, 1, 6, 2, 5, 3, 4}
   * <p>
   * Input: arr[] = {1, 2, 3, 4, 5, 6}
   * Output: arr[] = {6, 1, 5, 2, 4, 3}
   * <p>
   * We have discussed a solution in below post:
   * Rearrange an array in maximum minimum form | Set 1 : The solution discussed here requires extra space, how to solve this problem with O(1) extra space.
   * <p>
   * <p>
   * <p>
   * <p>
   * Recommended: Please solve it on “PRACTICE ” first, before moving on to the solution.
   * In this post a solution that requires O(n) time and O(1) extra space is discussed. The idea is to use multiplication and modular trick to store two elements at an index.
   * <p>
   * even index : remaining maximum element.
   * odd index  : remaining minimum element.
   * <p>
   * max_index : Index of remaining maximum element
   * (Moves from right to left)
   * min_index : Index of remaining minimum element
   * (Moves from left to right)
   * <p>
   * Initialize: max_index = 'n-1'
   * min_index = 0
   * max_element = arr[max_index] + 1 //can be any element which is more than the maximum value in array
   * <p>
   * For i = 0 to n-1
   * If 'i' is even
   * arr[i] += arr[max_index] % max_element * max_element
   * max_index--
   * ELSE // if 'i' is odd
   * arr[i] +=  arr[min_index] % max_element * max_element
   * min_index++
   * How does expression “arr[i] += arr[max_index] % max_element * max_element” work ?
   * The purpose of this expression is to store two elements at index arr[i]. arr[max_index] is stored as multiplier and “arr[i]” is stored as remainder. For example in {1 2 3 4 5 6 7 8 9}, max_element is 10 and we store 91 at index 0. With 91, we can get original element as 91%10 and new element as 91/10.
   *
   * @param arr
   */
  public static int[] rearrange(int arr[]) {
    int n = arr.length;
    // initialize index of first minimum and first maximum element
    int max_idx = n - 1, min_idx = 0;
    // store maximum element of array
    int max_elem = arr[n - 1] + 1;
    // traverse array elements
    for (int i = 0; i < n; i++) {
      // at even index : we have to put maximum element
      if (i % 2 == 0) {
        arr[i] += (arr[max_idx] % max_elem) * max_elem;
        max_idx--;
      }
      // at odd index : we have to put minimum element
      else {
        arr[i] += (arr[min_idx] % max_elem) * max_elem;
        min_idx++;
      }
    }
    // array elements back to it's original form
    for (int i = 0; i < n; i++) {
      arr[i] = arr[i] / max_elem;
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] a = new int[]{1,2,3,4};
    //System.out.println(Arrays.toString(arrangeSmallestLargest(a)));
    System.out.println(Arrays.toString(rearrange(a)));
  }
}

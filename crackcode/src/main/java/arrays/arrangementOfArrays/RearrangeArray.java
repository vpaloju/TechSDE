package arrays.arrangementOfArrays;

import java.util.Arrays;

/**
 * Rearrange an array such that ‘arr[j]’ becomes ‘i’ if ‘arr[i]’ is ‘j’ | Set 1
 * Last Updated: 29-05-2020
 * Given an array of size n where all elements are distinct and in range from 0 to n-1, change contents of arr[] so that arr[i] = j is changed to arr[j] = i.
 * Examples:
 * <p>
 * Example 1:
 * Input: arr[]  = {1, 3, 0, 2};
 * Output: arr[] = {2, 0, 3, 1};
 * Explanation for the above output.
 * Since arr[0] is 1, arr[1] is changed to 0
 * Since arr[1] is 3, arr[3] is changed to 1
 * Since arr[2] is 0, arr[0] is changed to 2
 * Since arr[3] is 2, arr[2] is changed to 3
 * <p>
 * Example 2:
 * Input: arr[]  = {2, 0, 1, 4, 5, 3};
 * Output: arr[] = {1, 2, 0, 5, 3, 4};
 * <p>
 * Example 3:
 * Input: arr[]  = {0, 1, 2, 3};
 * Output: arr[] = {0, 1, 2, 3};
 * <p>
 * Example 4:
 * Input: arr[]  = {3, 2, 1, 0};
 * Output: arr[] = {3, 2, 1, 0};
 */
public class RearrangeArray {

  public static int[] rearrangeNaive(int[] a) {
    int n = a.length;
    int[] res = new int[n];
    for (int i = 0; i < n; i++) {
      res[a[i]] = i;
    }
    return res;
  }

  public static int[] rearrange(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      // retrieving old value and storing with the new one
      arr[arr[i] % n] += i * n;
    }
    for (int i = 0; i < n; i++) {
      // retrieving new value
      arr[i] /= n;
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] a = new int[]{2, 0, 1, 4, 5, 3};
    //{1, 2, 0, 5, 3, 4}
    System.out.println(Arrays.toString(rearrangeNaive(a)));
    System.out.println(Arrays.toString(rearrange(a)));
  }
}

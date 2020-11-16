package arrays.arrangementOfArrays;

import java.util.Arrays;

/**
 * Reorder an array according to given indexes
 * Last Updated: 17-12-2018
 * Given two integer arrays of same size, “arr[]” and “index[]”, reorder elements in “arr[]” according to given index array. It is not allowed to given array arr’s length.
 * <p>
 * Example:
 * <p>
 * Input:  arr[]   = [10, 11, 12];
 * index[] = [1, 0, 2];
 * Output: arr[]   = [11, 10, 12]
 * index[] = [0,  1,  2]
 * <p>
 * Input:  arr[]   = [50, 40, 70, 60, 90]
 * index[] = [3,  0,  4,  1,  2]
 * Output: arr[]   = [40, 60, 90, 50, 70]
 * index[] = [0,  1,  2,  3,   4]
 * Expected time complexity O(n) and auxiliary space O(1)
 * <p>
 * We strongly recommend you to minimize your browser and try this yourself first.
 * <p>
 * A Simple Solution is to use an auxiliary array temp[] of same size as given arrays. Traverse the given array and put all elements at their correct place in temp[] using index[]. Finally copy temp[] to arr[] and set all values of index[i] as i.
 */
public class ReorderArrayAsPerGivenIndexs {

  public static int[] reorderArray(int[] a, int[] index) {
    int n = a.length;
    int res[] = new int[n];
    for (int i = 0; i < n; i++) {
      res[i] = a[index[i]];
    }
    return res;
  }

  public static void main(String[] args) {
    int a[] = {50, 40, 70, 60, 90};
    int index[] = {3, 0, 4, 1, 2};
    System.out.println(Arrays.toString(reorderArray(a, index)));
  }
}

package arrays.arrangementOfArrays;

import java.util.Arrays;

/**
 * Rearrange array such that even positioned are greater than odd
 * Last Updated: 22-09-2020
 * Given an array A of n elements, sort the array according to the following relations :
 * <p>
 * A[i] >= A[i-1]
 * <p>
 * , if i is even.
 * <p>
 * A[i] <= A[i-1]
 * <p>
 * , if i is odd.
 * Print the resultant array.
 * Examples :
 * <p>
 * <p>
 * <p>
 * <p>
 * Input : A[] = {1, 2, 2, 1}
 * Output :  1 2 1 2
 * Explanation :
 * For 1st element, 1  1, i = 2 is even.
 * 3rd element, 1  1, i = 4 is even.
 * <p>
 * Input : A[] = {1, 3, 2}
 * Output : 1 3 2
 * Explanation :
 * Here, the array is also sorted as per the conditions.
 * 1  1 and 2 < 3.
 */
public class ArrangeEvenPosGraterThanOdd {

  public static int[] arrangeEvenAndOdd(int[] a) {
    int n = a.length;
    Arrays.sort(a);
    int p = 0, q = n - 1;
    int[] res = new int[n];
    for (int i = 0; i < n; i++) {
      if ((i + 1) % 2 == 0) {
        // Assign even indexes with maximum elements
        res[i] = a[q--];
      } else {
        // Assign odd indexes with remaining elements
        res[i] = a[p++];
      }
    }
    return res;
  }

  public static void main(String[] args) {
    int[] a = new int[]{6, 4, 2, 1, 8, 3};//{4, 6, 1, 8, 2, 3}
    System.out.println(Arrays.toString(arrangeEvenAndOdd(a)));
  }
}

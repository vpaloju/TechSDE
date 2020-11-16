package arrays.arrangementOfArrays;

/**
 * Positive elements at even and negative at odd positions (Relative order not maintained)
 * Last Updated: 10-04-2019
 * You have been given an array and you have to make a program to convert that array such that positive elements occur at even numbered places in the array and negative elements occur at odd numbered places in the array. We have to do it in place.
 * <p>
 * There can be unequal number of positive and negative values and the extra values have to left as it is.
 * <p>
 * Examples:
 * <p>
 * Input : arr[] = {1, -3, 5, 6, -3, 6, 7, -4, 9, 10}
 * Output : arr[] = {1, -3, 5, -3, 6, 6, 7, -4, 9, 10}
 * <p>
 * Input : arr[] = {-1, 3, -5, 6, 3, 6, -7, -4, -9, 10}
 * Output : arr[] = {3, -1, 6, -5, 3, -7, 6, -4, 10, -9}
 * Recommended: Please try your approach on {IDE} first, before moving on to the solution.
 * The idea is to use Hoare’s partition process of Quick Sort.
 * We take two pointers positive and negative. We set the positive pointer at start of the array and the negative pointer at 1st position of the array.
 * We move positive pointer two steps forward till it finds a negative element. Similarly we move negative pointer forward by two places till it finds a positive value at its position.
 * If the positive and negative pointers are in the array then we will swap the values at these indexes otherwise we will stop executing the process.
 */
public class PossitiveAtEvenNegativeAtOdd {

  public static void arrangePossitiveAtEvenNegativeAtOdd(int[] a) {
    int n = a.length;
    int posIndex = 0, negIndex = 1;
    while (true) {
      /* Move forward the positive pointer till negative number number not encountered */
      while (posIndex < n && a[posIndex] >= 0) {
        posIndex += 2;
      }
      /*Move forward the negative pointer till positive number number not encountered */
      while (negIndex < n && a[negIndex] <= 0) {
        negIndex += 2;
      }
      // Swap array elements to fix their position.
      if (posIndex < n && negIndex < n) {
        int temp = a[posIndex];
        a[posIndex] = a[negIndex];
        a[negIndex] = temp;
      }
      /* Break from the while loop when any index exceeds the size of the array */
      else {
        break;
      }
    }
  }

  public static void main(String[] args) {
    int[] a = {1, -3, 5, 6, -3, 6, 7, -4, 9, 10};//1 -3 5 -3 6 6 7 -4 9 10
    arrangePossitiveAtEvenNegativeAtOdd(a);
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
  }
}

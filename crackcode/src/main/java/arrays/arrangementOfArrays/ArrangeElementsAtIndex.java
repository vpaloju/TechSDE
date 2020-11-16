package arrays.arrangementOfArrays;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Given an array of elements of length N, ranging from 0 to N – 1. All elements may not be present in the array. If element is not present then there will be -1 present in the array. Rearrange the array such that A[i] = i and if i is not present, display -1 at that place.
 * Rearrange an array such that arr[i] = i
 * Last Updated: 26-09-2020
 * Given an array of elements of length N, ranging from 0 to N – 1. All elements may not be present in the array. If the element is not present then there will be -1 present in the array. Rearrange the array such that A[i] = i and if i is not present, display -1 at that place.
 * Examples:
 * <p>
 * Input : arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
 * Output : [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]
 * <p>
 * Input : arr = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8,
 * 11, 10, 9, 5, 13, 16, 2, 14, 17, 4}
 * Output : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
 * 11, 12, 13, 14, 15, 16, 17, 18, 19]
 */
public class ArrangeElementsAtIndex {

  public static int[] reArrangeArray(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {

      if (array[i] != -1 && array[i] != i) {
        int x = array[i];
        //Check the desired place is vacant or not
        while (array[x] != -1 && array[x] != x) {
          int y = array[x];
          array[x] = x;
          x = y;
        }
        array[x] = x;
        if (array[i] != i) {
          array[i] = -1;
        }
      }
    }
    return array;
  }

  public static int[] reArrangeUsingHashSet(int[] array) {
    HashSet<Integer> hashSet = new HashSet<Integer>();
    for (int i = 0; i < array.length - 1; i++) {
      hashSet.add(array[i]);
    }
    for (int i = 0; i < array.length - 1; i++) {
      if (hashSet.contains(i)) {
        array[i] = i;
      } else
        array[i] = -1;
    }
    return array;

  }

  public static void main(String args[]) {
    int[] a = new int[]{0, 1, 2, 3, 4, 5, 6, 10, 8, 9, 7};
    System.out.println(Arrays.toString(reArrangeUsingHashSet(a)));
  }
}



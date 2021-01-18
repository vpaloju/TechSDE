package arrays.orderStatistics;

import java.util.Arrays;

public class MergeSortedArrays {

  public static void main(String[] args) {
    int a[] = new int[]{1, 5, 9, 10, 15, 20};
    int b[] = new int[]{2, 3, 8, 13};
    mergeSordedArrays(a, b, a.length, b.length);
    System.out.print("After Merging nFirst Array: ");
    System.out.println(Arrays.toString(a));
    System.out.print("Second Array:  ");
    System.out.println(Arrays.toString(b));
  }

  public static void mergeSordedArrays(int[] a, int[] b, int aLength, int bLength) {
    for (int i = bLength - 1; i >= 0; i--) {
        /* Find the smallest element greater than ar2[i]. Move all
           elements one position ahead till the smallest greater
           element is not found */
      int j, last = a[aLength - 1];
      for (j = aLength - 2; j >= 0 && a[j] > b[i]; j--)
        a[j + 1] = a[j];

      // If there was a greater element
      if (j != aLength - 2 || last > b[i]) {
        a[j + 1] = b[i];
        b[i] = last;
      }
    }
  }
}

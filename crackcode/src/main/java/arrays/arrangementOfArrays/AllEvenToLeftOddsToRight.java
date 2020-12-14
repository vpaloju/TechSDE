package arrays.arrangementOfArrays;

import java.util.Arrays;

/**
 * Segregate even and odd numbers | Set 3
 * Last Updated: 23-10-2018
 * Given an array of integers, segregate even and odd numbers in the array. All the even numbers should be present first, and then the odd numbers.
 * <p>
 * Examples:
 * <p>
 * Input : 1 9 5 3 2 6 7 11
 * Output : 2 6 5 3 1 9 7 11
 * <p>
 * Input : 1 3 2 4 7 6 9 10
 * Output : 2 4 6 10 7 1 9 3
 */
public class AllEvenToLeftOddsToRight {

  public static int[] moveAllEvensToLeft(int[] array) {
    int n = array.length, evenNumberIndex = -1;
    for (int i = 0; i < n; i++) {
      if (array[i] % 2 == 0) {
        evenNumberIndex++;
        int temp = array[i];
        array[i] = array[evenNumberIndex];
        array[evenNumberIndex] = temp;
      }
    }
    return array;
  }

  public static int[] moveAllEvenToLeftOddsToRight(int[] array) {
    int n = array.length - 1;
    int evenIndex = 0, oddIndex = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[evenIndex] % 2 == 0) {
        swap(evenIndex, oddIndex, array);
        evenIndex++;
        oddIndex++;
      } else {
        evenIndex++;
      }
    }
    System.out.println("array = " + Arrays.toString(array));
    return array;
  }

  private static void swap(int evenIndex, int oddIndex, int[] array) {
    int temp = array[evenIndex];
    array[evenIndex] = array[oddIndex];
    array[oddIndex] = temp;
  }

  public static int[] moveAllEvenToLeftWithSameOrder(int[] a) {
    int n = a.length;
    int key, j;
    for (int i = 0; i < n; i++) {
      key = a[i];
      if (key % 2 != 0) {
        continue;
      }
      j = i - 1;
      while (j >= 0 && a[j] % 2 != 0) {
        a[j + 1] = a[j];
        j--;
      }
    }
    return a;
  }

  public static void main(String[] args) {
    moveAllEvenToLeftOddsToRight(new int[]{3, 1, 2, 5, 6, 8, 0});
    System.out.println("array = " + Arrays.toString(moveAllEvensToLeft(new int[]{3, 1, 2, 5, 6, 8, 0})));
    moveAllEvenToLeftOddsToRight(new int[]{3, 1, 2, 5, 6, 8, 0});
    System.out.println("array = " + Arrays.toString(moveAllEvenToLeftWithSameOrder(new int[]{3, 1, 2, 5, 6, 8, 0})));
  }
}

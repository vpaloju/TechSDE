package arrays.sorting;

import java.util.Arrays;

public class InsertionSort {

  public static int[] insertionSort(int[] array) {
    int n = array.length - 1;
    for (int i = 1; i <= n; i++) {
      int j, valueToBeSort = array[i];
      for (j = i - 1; j >= 0 && array[j] > valueToBeSort; j--) {
        array[j + 1] = array[j];
      }
      array[j + 1] = valueToBeSort;
    }
    return array;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(insertionSort(new int[]{1, 3, 5, 4, 8, 6, 7, 10, 9})));
  }
}

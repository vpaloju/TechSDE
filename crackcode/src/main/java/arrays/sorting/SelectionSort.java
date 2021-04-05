package arrays.sorting;

import java.util.Arrays;

public class SelectionSort {

  public static int[] selectionSort(int[] array) {
    int n = array.length - 1;
    for (int i = 0; i < n; i++) {
      int minIndex = i;
      for (int j = i + 1; j <= n; j++) {
        if (array[j] < array[minIndex]) {
          int temp = array[minIndex];
          array[minIndex] = array[j];
          array[j] = temp;
        }
      }
    }
    return array;
  }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionSort(new int[]{1, 3, 5, 4, 8, 6, 7, 10, 9})));
    }
}

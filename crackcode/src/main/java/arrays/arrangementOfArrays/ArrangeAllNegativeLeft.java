package arrays.arrangementOfArrays;

import java.util.Arrays;

public class ArrangeAllNegativeLeft {

  public static int[] arrangeAllNegativeLeft(int array[]) {
    int start = 0, end = array.length - 1;
    while (true) {
      while (array[start] < 0 && start < end)
        start++;
      while (array[end] > 0 && start < end)
        end--;
      if (start < end) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
      } else
        break;

    }
    return array;
  }

  public static int[] arrangeAllPossitivesRight(int array[]) {
    int negativeNumberIndex = -1;
    for (int i = 0; i < array.length; i++) {
      if (array[i] < 0) {
        negativeNumberIndex++;
        int temp = array[negativeNumberIndex];
        array[negativeNumberIndex] = array[i];
        array[i] = temp;
      }
    }
    return array;
  }

  public static void main(String[] args) {
    int[] a = {1, -1, 3, 2, -7, -5, 11, 6};
    System.out.println(Arrays.toString(arrangeAllPossitivesRight(a)));
  }

}

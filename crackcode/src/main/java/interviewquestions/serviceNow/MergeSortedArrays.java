package interviewquestions.serviceNow;

import java.util.Arrays;

public class MergeSortedArrays {

  public static int[] mergeSortedArrays(int[] a, int[] b) {
    int[] result = new int[a.length + b.length];
    int j = 0;
    for (int i : a) {
      result[j++] = i;
    }
    for (int i = 0; i < b.length; i++) {
      insertInSortedOrder(result, j++, b[i]);
    }
    return result;
  }

  public static int[] insertInSortedOrder(int[] result, int length, int key) {
    int i;
    for (i = length - 1; (i >= 0 & result[i] > key); i--) {
      result[i + 1] = result[i];
    }
    result[i + 1] = key;
    return result;
  }

  public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
    int[] result = new int[a.length + b.length];
    int i = 0, j = 0, k = 0;
    while (i < a.length && j < b.length) {
      if (a[i] < b[j]) {
        result[k++] = a[i++];
      } else {
        result[k++] = b[j++];
      }
    }
    while (i < a.length) {
      result[k++] = a[i++];
    }
    while (j < b.length) {
      result[k++] = b[j++];
    }
    return result;
  }

  public static void main(String[] args) {
    int[] ar1 = {1, 3, 7, 11};
    int[] ar2 = {2, 5, 8, 22};
    System.out.println(Arrays.toString(mergeSortedArrays(ar1, ar2)));
    System.out.println("******************************");
    System.out.println(Arrays.toString(mergeTwoSortedArrays(ar1, ar2)));
  }
}

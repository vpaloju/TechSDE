package arrays.orderStatistics;

import java.util.Arrays;

public class FindElementsWithTwoGraterElements {

  public static void findElementsWithTwoGratestElements(int[] a) {
    int n = a.length;
    int[] res = new int[n];
    int first, second;
    first = second = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      if (a[i] > first) {
        second = first;
        first = a[i];
      } else if (a[i] > second) {
        second = a[i];
      }
    }
    for (int i = 0; i < n; i++) {
      if (a[i] < second) {
        System.out.print(a[i] + " ");
      }
    }
  }

  public static void findElements(int arr[]) {
    int n = arr.length;
    Arrays.sort(arr);
    for (int i = 0; i < n - 2; i++)
      System.out.print(arr[i] + " ");
  }

  public static void main(String[] args) {
    int[] a = {7, -2, 3, 4, 9, -1};
    findElements(a);
    System.out.println("");
    findElementsWithTwoGratestElements(a);
  }
}

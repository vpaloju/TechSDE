package arrays.arrangementOfArrays;

import java.util.Arrays;

/**
 * Move all negative elements to end in order with extra space allowed
 * Last Updated: 03-12-2018
 * Given an unsorted array of both negative and positive integer. The task is place all negative element at the end of array without changing the order of positive element and negative element.
 * <p>
 * Examples:
 * <p>
 * Input : arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
 * Output : 1  3  2  11  6  -1  -7  -5
 * <p>
 * Input : arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
 * Output : 7  9  10  11  -5  -3  -4  -1
 */
public class MoveAllPossitiveToLeft {

  public static int[] moveAllPossitiveToLeft(int[] a) {
    int posIndex = -1;
    int n = a.length;
    for (int i = 0; i < n; i++) {
      if (a[i] > 0) {
        posIndex++;
        int temp = a[posIndex];
        a[posIndex] = a[i];
        a[i] = temp;
      }
    }
    return a;
  }

  /**
   * This method helps to move all possitive numbers to left and negative to right with maintaining order.
   * @param a
   * @return
   */
  public static int[] moveAllPossitiveToLeftInSameOrder(int[] a) {
    int n = a.length;
    int key, j;
    for (int i = 0; i < n; i++) {
      key = a[i];
      if (key < 0) {
        continue;
      }
      j = i - 1;
      while (j > 0 && a[j] < 0) {
        a[j + 1] = a[j];
        j--;
      }
      a[j + 1] = key;
    }
    return a;
  }

  public static void main(String[] args) {
    int[] a = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
    System.out.println(Arrays.toString(moveAllPossitiveToLeft(a)));
    System.out.println(Arrays.toString(moveAllPossitiveToLeftInSameOrder(a)));
  }
}

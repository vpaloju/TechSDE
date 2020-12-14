package arrays.arrangementOfArrays;

import java.util.Arrays;

/**
 * Write a program to reverse an array or string
 * Last Updated: 08-09-2020
 * <p>
 * Given an array (or string), the task is to reverse the array/string.
 * Examples :
 * <p>
 * <p>
 * Input  : arr[] = {1, 2, 3}
 * Output : arr[] = {3, 2, 1}
 * <p>
 * Input :  arr[] = {4, 5, 1, 2}
 * Output : arr[] = {2, 1, 5, 4}
 */
public class ReverseArray {

  /**
   * O(n) complexity.
   *
   * @param array
   * @return
   */
  public static int[] reverseArray(int[] array) {
    int startIndex = 0;
    int endIndex = array.length - 1;
    if (startIndex >= endIndex) {
      return array;
    }
    for (startIndex = 0, endIndex = array.length - 1; startIndex < endIndex; startIndex++, endIndex--) {
      int temp = array[startIndex];
      array[startIndex] = array[endIndex];
      array[endIndex] = temp;
      startIndex++;
      endIndex--;
    }
    return array;
  }

  /**
   * @param array
   * @param startIndex
   * @param endIndex
   * @return
   */
  public static int[] reverseRecursive(int[] array, int startIndex, int endIndex) {
    if (startIndex >= endIndex)
      return null;
    int temp = array[startIndex];
    array[startIndex] = array[endIndex];
    array[endIndex] = temp;
    reverseRecursive(array, startIndex + 1, endIndex - 1);
    return array;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(reverseArray(new int[]{1, 2, 3, 4, 5, 6})));
    System.out.println(Arrays.toString(reverseRecursive(new int[]{1, 2, 3, 4, 5, 6}, 0, 5)));
  }
}

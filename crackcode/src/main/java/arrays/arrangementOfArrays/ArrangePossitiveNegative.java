package arrays.arrangementOfArrays;

import java.util.Arrays;

/**
 * Rearrange positive and negative numbers in O(n) time and O(1) extra space
 * Last Updated: 05-03-2019
 * An array contains both positive and negative numbers in random order. Rearrange the array elements so that positive and negative numbers are placed alternatively. Number of positive and negative numbers need not be equal. If there are more positive numbers they appear at the end of the array. If there are more negative numbers, they too appear in the end of the array.
 * <p>
 * For example, if the input array is [-1, 2, -3, 4, 5, 6, -7, 8, 9], then the output should be [9, -7, 8, -3, 5, -1, 2, 4, 6]
 * <p>
 * Note: The partition process changes relative order of elements. I.e. the order of the appearance of elements is not maintained with this approach. See this for maintaining order of appearance of elements in this problem.
 * <p>
 * The solution is to first separate positive and negative numbers using partition process of QuickSort. In the partition process, consider 0 as value of pivot element so that all negative numbers are placed before positive numbers. Once negative and positive numbers are separated, we start from the first negative number and first positive number, and swap every alternate negative number with next positive number.
 */
public class ArrangePossitiveNegative {

  /**
   * The main function that rearranges elements of given array.  It puts positive elements at even indexes (0,2, ..) and negative numbers at odd indexes (1, 3, ..).
   *
   * @param array
   */
  public static int[] arrangePossitiveNegative(int[] array) {
    int size = array.length;
    int negativeNumberIndex = -1, temp = 0;
    for (int j = 0; j < size; j++) {
      if (array[j] < 0) {
        negativeNumberIndex++;
        temp = array[negativeNumberIndex];
        array[negativeNumberIndex] = array[j];
        array[j] = temp;
      }
    }

    int possitive = negativeNumberIndex + 1, negative = 0;
    while (possitive < size && negative < possitive && array[negative] < 0) {
      temp = array[negative];
      array[negative] = array[possitive];
      array[possitive] = temp;
      possitive++;
      negative += 2;
    }
    return array;
  }

  public static void main(String args[]) {
    int[] a = new int[]{-1, 2, -3, 4, 5, 6, -7, 8, 9};
    System.out.println(Arrays.toString(arrangePossitiveNegative(a)));
  }
}

package arrays.arrangementOfArrays;

import java.util.Arrays;

/**
 * Given an array of n elements. Our task is to write a program to rearrange the array such that elements at even positions are greater than all elements before it and elements at odd positions are less than all elements before it.
 * <p>
 * Examples:
 * <p>
 * Input : arr[] = {1, 2, 3, 4, 5, 6, 7}
 * Output : 4 5 3 6 2 7 1
 * <p>
 * Input : arr[] = {1, 2, 1, 4, 5, 6, 8, 8}
 * Output : 4 5 2 6 1 8 1 8
 */
public class ArrangeArrayByGivenCondition {

  public static int[] arrangeArray(int[] array) {
    //size of the array.
    int size = array.length;
    //Even and odd positions in Array.
    int evenPositions = size / 2;
    int oddPositions = size - evenPositions;

    //Copy the whole array into temp array and sort it out to arrange in given order.
    int[] temp = new int[size];
    for (int i = 0; i < size; i++) {
      temp[i] = array[i];
    }
    Arrays.sort(temp);
    int j = oddPositions - 1;
    //Fill the odd positions.
    for (int i = 0; i < size; i += 2) {
      array[i] = temp[j];
      j--;
    }

    j = oddPositions;
    //Fill the even positions.
    for (int i = 1; i < size; i += 2) {
      array[i] = temp[j];
      j++;
    }
    return array;
  }

  public static void main(String args[]) {
    int[] a = new int[]{1, 2, 3, 4, 31, 40, 5, 6, 7, 8, 9, 10};
    System.out.println(Arrays.toString(arrangeArray(a)));
  }
}

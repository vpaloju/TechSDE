package arrays.arrangementOfArrays;

import java.util.Arrays;

/**
 * Replace every array element by multiplication of previous and next
 * Last Updated: 11-12-2018
 * Given an array of integers, update every element with multiplication of previous and next elements with following exceptions.
 * a) First element is replaced by multiplication of first and second.
 * b) Last element is replaced by multiplication of last and second last.
 * <p>
 * Example:
 * <p>
 * Input: arr[] = {2, 3, 4, 5, 6}
 * Output: arr[] = {6, 8, 15, 24, 30}
 * <p>
 * // We get the above output using following
 * // arr[] = {2*3, 2*4, 3*5, 4*6, 5*6}
 * Source: Top 25 Interview Questions
 * <p>
 * A Simple Solution is to create an auxiliary array, copy contents of given array to auxiliary array. Finally traverse the auxiliary array and update given array using copied values. Time complexity of this solution is O(n), but it requires O(n) extra space.
 * <p>
 * An efficient solution can solve the problem in O(n) time and O(1) space. The idea is to keep track of previous element in loop.
 */
public class ReplaceEveryArrayElement {

  public static int[] replaceEveryElementWithProductOfPreAndNext(int[] a) {
    int n = a.length;
    if (n <= 1) {
      return a;
    }
    int prev = a[0];
    a[0] = a[0] * a[1];
    for (int i = 1; i < n - 1; i++) {
      int current = a[i];
      a[i] = prev * a[i + 1];
      prev = current;
    }
    a[n - 1] = prev * a[n - 1];
    return a;
  }

  public static void main(String[] args) {
    int[] a = {2, 3, 4, 5, 6};//6 8 15 24 30
    System.out.println(Arrays.toString(replaceEveryElementWithProductOfPreAndNext(a)));
  }

}

package interviewquestions.arrays;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Count pairs with given sum
 * Last Updated: 11-12-2020
 * Given an array of integers, and a number ‘sum’, find the number of pairs of integers in the array whose sum is equal to ‘sum’.
 * <p>
 * Examples:
 * <p>
 * Input  :  arr[] = {1, 5, 7, -1},
 * sum = 6
 * Output :  2
 * Pairs with sum 6 are (1, 5) and (7, -1)
 * <p>
 * Input  :  arr[] = {1, 5, 7, -1, 5},
 * sum = 6
 * Output :  3
 * Pairs with sum 6 are (1, 5), (7, -1) &
 * (1, 5)
 */
public class CountPairsSumMatchWithGivenSum {

  public static int countNumberOfPairs(int[] a, int sum) {
    int numberOfPairs = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < a.length; i++) {
      if (!map.containsKey(a[i])) {
        map.put(a[i], 1);
      } else {
        map.put(a[i], map.get(a[i]) + 1);
      }
    }
    for (int i = 0; i < a.length; i++) {
      if (map.get(sum - a[i]) != null) {
        numberOfPairs += map.get(sum - a[i]);
      }
      if (sum - a[i] == a[i]) {
        numberOfPairs--;
      }
    }
    return numberOfPairs / 2;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = "";
    s += scanner.nextLine();
    System.out.println(countNumberOfPairs(new int[]{10, 12, 10, 15, -1, 7, 6,
      5, 4, 2, 1, 1, 1}, 11));
    System.out.println(s);
  }
}

package arrays.orderStatistics;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers, find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.
 *
 * Examples:
 *
 * Input: arr[] = {1, 9, 3, 10, 4, 20, 2}
 * Output: 4
 * Explanation:
 * The subsequence 1, 3, 4, 2 is the longest
 * subsequence of consecutive elements
 *
 * Input: arr[] = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42}
 * Output: 5
 * Explanation:
 * The subsequence 36, 35, 33, 34, 32 is the longest
 * subsequence of consecutive elements.
 */
public class LongestConsecutiveSubsequence {

  /**
   * Complexity Analysis:
   * Time complexity: O(n).
   * Only one traversal is needed and the time complexity is O(n) under the assumption that hash insert and search take O(1) time.
   * Auxiliary space: O(n).
   * To store every element in hashmap O(n) space is needed.
   * @param a
   * @return
   */
  public static int largestConsecutiveSubSequence(int[] a) {
    Set<Integer> set = new HashSet<>();
    int ans = 0;
    for (int i : a) {
      set.add(i);
    }
    for (int i = 0; i < a.length; i++) {
      if (!set.contains(a[i] - 1)) {
        int j = a[i];
        while (set.contains(j)) {
          j++;
        }
        if (ans < j - a[i]) {
          ans = j - a[i];
        }
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int[] a = new int[]{1, 9, 3, 10, 4, 20, 2};
    System.out.println(largestConsecutiveSubSequence(a));
  }
}

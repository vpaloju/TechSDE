package strings;

import java.util.Arrays;

/**
 * Given a string, find length of the longest repeating subseequence such that the two subsequence don’t have same string character at same position, i.e., any i’th character in the two subsequences shouldn’t have the same index in the original string.
 * Examples:
 * <p>
 * Input: str = "abc"
 * Output: 0
 * There is no repeating subsequence
 * <p>
 * Input: str = "aab"
 * Output: 1
 * The two subssequence are 'a'(first) and 'a'(second).
 * Note that 'b' cannot be considered as part of subsequence
 * as it would be at same index in both.
 * <p>
 * Input: str = "aabb"
 * Output: 2
 * <p>
 * Input: str = "axxxy"
 * Output: 2
 */
public class LongestRecurringSubSequence {
  static int dp[][] = new int[1000][1000];

  /**
   * O(2^n)
   *
   * @param str
   * @return
   */
  public static int longestRecurringSubSequence(String str) {
    int n = str.length();
    int[][] dp = new int[n + 1][n + 1];
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (str.charAt(i - 1) == str.charAt(j - 1) && i != j) {
          dp[i][j] = 1 + dp[i - 1][j - 1];
        } else {
          dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
        }
      }
    }
    return dp[n][n];
  }

  /**
   * O(m*n)
   *
   * @param a
   * @param m
   * @param n
   * @return
   */
  public static int findLongestRepeatingSubSeq(char[] a, int m, int n) {
    if (dp[m][n] != -1) {
      return dp[m][n];
    }
    if (m == 0 || n == 0) {
      return dp[m][n] = 0;
    }
    if (a[m - 1] == a[n - 1] && m != n) {
      return dp[m][n] = findLongestRepeatingSubSeq(a, m - 1, n - 1) + 1;
    }
    return dp[m][n] = Math.max(findLongestRepeatingSubSeq(a, m, n - 1), findLongestRepeatingSubSeq(a, m - 1, n));
  }

  public static void main(String[] args) {
    String str = "aabb";
    int m = str.length();
    for (int[] row : dp) {
      Arrays.fill(row, -1);
    }
    System.out.println("The length of the largest subsequence that"
      + " repeats itself is : "
      + findLongestRepeatingSubSeq(str.toCharArray(), m, m));
    System.out.println("The length of the largest subsequence that"
      + " repeats itself is : "
      + longestRecurringSubSequence(str));
  }
}

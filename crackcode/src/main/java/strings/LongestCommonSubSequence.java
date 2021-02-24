package strings;

public class LongestCommonSubSequence {

  /**
   * O(2^n)
   *
   * @param a [0...m-1]
   * @param b [0...n-1]
   * @param m
   * @param n
   * @return
   */
  public static int longestCommonSubSequence(char[] a, char[] b, int m, int n) {
    if (m == 0 || n == 0) {
      return 0;
    }
    if (a[m - 1] == b[n - 1]) {
      return 1 + longestCommonSubSequence(a, b, m - 1, n - 1);
    } else {
      return Math.max(longestCommonSubSequence(a, b, m, n - 1), longestCommonSubSequence(a, b, m - 1, n));
    }
  }

  /**
   *O(m*n)
   * @param a
   * @param b
   * @param m
   * @param n
   * @return
   */
  public static int longestCommonSubSeq(char[] a, char[] b, int m, int n) {
    //Create Table and fill the 0th row and column with 0
    int[][] l = new int[m + 1][n + 1];
    for (int i = 0; i <= m; i++) {
      for (int j = 0; j <= n; j++) {
        if (i == 0 || j == 0) {
          l[i][j] = 0;
        } else if (a[i - 1] == b[j - 1]) {
          l[i][j] = l[i - 1][j - 1] + 1;
        } else {
          l[i][j] = Math.max(l[i - 1][j], l[i][j - 1]);
        }
      }
    }
    return l[m][n];
  }

  public static void main(String[] args) {
    String s1 = "AGGTAB";
    String s2 = "GXTXAYB";
    char[] X = s1.toCharArray();
    char[] Y = s2.toCharArray();
    int m = X.length;
    int n = Y.length;
    System.out.println("Length of LCS is" + " " +
      longestCommonSubSequence(X, Y, m, n));
    System.out.println("Length of LCS is" + " " +
      longestCommonSubSeq(X, Y, m, n));
  }
}

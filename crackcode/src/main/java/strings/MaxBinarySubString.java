package strings;

/**
 * Split the binary string into substrings with equal number of 0s and 1s
 * Difficulty Level : Easy
 * Last Updated : 20 Nov, 2019
 * Given a binary string str of length N, the task is to find the maximum count of substrings str can be divided into such that all the substrings are balanced i.e. they have equal number of 0s and 1s. If it is not possible to split str satisfying the conditions then print -1.
 * <p>
 * Example:
 * <p>
 * Input: str = “0100110101”
 * Output: 4
 * The required substrings are “01”, “0011”, “01” and “01”.
 * <p>
 * Input: str = “0111100010”
 * Output: 3
 */
public class MaxBinarySubString {

  public static int maxSubStrings(String str) {
    int count0 = 0, count1 = 0, subStringsCount = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '0') {
        count0++;
      } else if (str.charAt(i) == '1') {
        count1++;
      }
      if (count0 == count1) {
        subStringsCount++;
      }
    }
    if (count0 != count1) {
      return -1;
    }
    return subStringsCount;
  }

  public static void main(String[] args) {
    String str = "0100110101";
    int n = str.length();
    System.out.println("\n" + maxSubStrings(str));
  }
}

package strings;

/**
 * Find if a string is interleaved of two other strings | DP-33
 * Difficulty Level : Hard
 * Last Updated : 01 Dec, 2020
 * Given three strings A, B and C. Write a function that checks whether C is an interleaving of A and B. C is said to be interleaving A and B, if it contains all characters of A and B and order of all characters in individual strings is preserved.
 * <p>
 * Example:
 * <p>
 * Input: strings: "XXXXZY", "XXY", "XXZ"
 * Output: XXXXZY is interleaved of XXY and XXZ
 * The string XXXXZY can be made by
 * interleaving XXY and XXZ
 * String:    XXXXZY
 * String 1:    XX Y
 * String 2:  XX  Z
 * <p>
 * Input: strings: "XXY", "YX", "X"
 * Output: XXY is not interleaved of YX and X
 * XXY cannot be formed by interleaving YX and X.
 * The strings that can be formed are YXX and XYX
 */
public class CheckShuffleOfTwoStrings {

  public static boolean shuffleCheck(String first, String second, String result) {
    if (first.length() + second.length() != result.length()) {
      return false;
    }
    int i = 0, j = 0, k = 0;

    while (k != result.length()) {
      if (i < first.length() && first.charAt(i) == result.charAt(k)) {
        i++;
      } else if (j < second.length() && second.charAt(j) == result.charAt(k)) {
        j++;
      } else {
        return false;
      }
      k++;
    }
    if (i < first.length() || j < second.length()) {
      return false;
    }
    return true;
  }

  public static void main(String[] args) {
    String first = "XXY";
    String second = "XXZ";
    String[] results = {"XXXXZY", "Y12X"};
    System.out.println(shuffleCheck(first, second, results[0]));
    //System.out.println(shuffleCheck(first, second, results[1]));
  }
}

package strings;

/**
 * A permutation, also called an “arrangement number” or “order,” is a rearrangement of the elements of an ordered list S into a one-to-one correspondence with S itself. A string of length n has n! permutation.
 * Algorithm Paradigm: Backtracking
 * <p>
 * Time Complexity: O(n*n!) Note that there are n! permutations and it requires O(n) time to print a a permutation.
 */
public class PermutationsOfString {

  public static void permutationsOfString(String str, int start, int end) {
    if (start == end) {
      System.out.println(str);
    }
    for (int i = start; i <= end; i++) {
      str = swap(str, start, i);
      permutationsOfString(str, start + 1, end);
      str = swap(str, start, i);
    }
  }

  public static String swap(String str, int i, int j) {
    char[] charArray = str.toCharArray();
    char temp = charArray[i];
    charArray[i] = charArray[j];
    charArray[j] = temp;
    return String.valueOf(charArray);
  }

  public static void permutations(String input, String result) {
    if (input.length() == 0) {
      System.out.println(result + "");
      return;
    }
    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);
      String subString = input.substring(0, i) + input.substring(i + 1);
      permutations(subString, result + ch);
    }
  }

  public static boolean shouldWeSwap(char[] str, int start, int curr) {
    for (int i = start; i < curr; i++) {
      if (str[i] == str[curr]) {
        return false;
      }
    }
    return true;
  }

  public static void distinctPermutations(String s, int sart, int end) {
    char[] str = s.toCharArray();
    if (sart >= end) {
      System.out.println(s);
      return;
    }
    for (int i = sart; i < end; i++) {
      if (shouldWeSwap(str, sart, i)) {
        s = swap(s, sart, i);
        distinctPermutations(s, sart + 1, end);
        s = swap(s, sart, i);
      }
    }
  }

  public static void main(String[] args) {
    String str = "ABC";
    String str1 = "ABCA";
    int n = str.length();
    permutationsOfString(str, 0, n - 1);
    System.out.println("**************");
    permutations(str, "");
    System.out.println("**************");
    distinctPermutations(str1, 0, str1.length());

  }

}

package interviewquestions.strings;

public class LongestPalindrom {
  public static String longestPalindrom(String str) {
    char[] a = str.toCharArray();
    int longestStart = 0;
    int longestEnd = 0;
    for (int start = 0; start < a.length; start++) {
      for (int end = start + 1; end < a.length; end++) {
        if (isPalindrom(a, start, end - 1)) {
          if (end - start > longestEnd - longestStart) {
            longestEnd = end;
            longestStart = start;
          }
        }
      }
    }
    return str.substring(longestStart, longestEnd);
  }

  public static boolean isPalindrom(char[] str, int start, int end) {
    for (int i = start; i <= (start + end) / 2; i++) {
      if (str[i] == str[start + end - i])
        continue;
      else
        return false;
    }
    return true;
  }

  public static String intermediatePalindrome(String str, int left, int right) {
    if (left > right) {
      return null;
    }
    if (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
      left++;
      right--;
    }
    return str.substring(left + 1, right);
  }

  public static String longestPalindrome(String str) {
    if (str == null) {
      return null;
    }
    String longestString = str.substring(0, 1);
    for (int i = 0; i < str.length() - 1; i++) {
      //Odd length case
      String palindrome = intermediatePalindrome(str, i, i);
      if (palindrome.length() > longestString.length()) {
        longestString = palindrome;
      }
      //Even length case
      palindrome = intermediatePalindrome(str, i, i + 1);
      if (palindrome.length() > longestString.length()) {
        longestString = palindrome;
      }
    }
    return longestString;
  }

  public static void main(String[] args) {
    System.out.println(longestPalindrom("forgeeksskeegfor"));//geeksskeeg
  }

}

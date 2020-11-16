package dailyCodingProblems;

/**
 * Given a word W and a string S, find all starting indices in S which are anagrams of W.
 * <p>
 * For example, given that W is "ab", and S is "abxaba", return 0, 3, and 4.
 */
public class IsSubStringAnagram {

  public static void isSubStringAnagram(String s, String w) {
    int wLength = w.length();
    for (int i = 0; i < s.length() && wLength <= s.length(); i++, wLength++) {
      if (isAnagram(s.substring(i, wLength), w)) {
        System.out.println(i);
      }
    }
  }

  public static boolean isAnagram(String str1, String str2) {
    if (str1.length() == 0 || str2.length() == 0 || str1.length() != str2.length()) {
      return false;
    }
    int[] map = new int[256];
    for (char c : str1.toCharArray()) {
      map[c]++;
    }
    for (char c : str2.toCharArray()) {
      map[c]--;
      if (map[c] < 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    isSubStringAnagram("abxaba", "ab");
  }
}

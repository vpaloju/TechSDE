package strings;

/**
 * Examples:
 * <p>
 * Input : ABCA
 * Output : AABC AACB ABAC ABCA ACBA
 * ACAB BAAC BACA BCAA CABA
 * CAAB CBAA
 */
public class DistinctPermutationsOfString {


  public static boolean shouldWeSwap(char[] str, int start, int curr) {
    for (int i = start; i < curr; i++) {
      if (str[i] == str[curr]) {
        return false;
      }
    }
    return true;
  }

  public static void distinctPermutations(char[] str, int sart, int end) {
    if (sart >= end) {
      System.out.println(str);
      return;
    }
    for (int i = sart; i < end; i++) {
      if (shouldWeSwap(str, sart, i)) {
        swap(str, sart, i);
        distinctPermutations(str, sart + 1, end);
        swap(str, sart, i);
      }
    }
  }

  public static void swap(char[] str, int i, int j) {
    char temp = str[i];
    str[i] = str[j];
    str[j] = temp;
  }

  public static void main(String[] args) {
    char str[] = {'A', 'B', 'C', 'A'};
    int n = str.length;
    distinctPermutations(str, 0, n);
  }
}

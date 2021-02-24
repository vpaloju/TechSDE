package strings;

public class DuplicateCharactersInString {
  static final int NO_OF_CHARS = 256;

  public static void fillCharCount(String str, int[] count) {
    for (int i = 0; i < str.length(); i++) {
      count[str.charAt(i)]++;
    }
  }

  public static void printDuplicates(String str) {
    int[] count = new int[NO_OF_CHARS];
    for (int i = 0; i < str.length(); i++) {
      count[str.charAt(i)]++;
    }
    for (int i = 0; i < str.length(); i++) {
      if (count[str.charAt(i)] > 1) {
        System.out.println(str.charAt(i) + " Present in " + count[str.charAt(i)] + " Times in the given String");
      }
    }
  }

  public static void main(String[] args) {
    printDuplicates("aaaavhjggkgju");
  }
}

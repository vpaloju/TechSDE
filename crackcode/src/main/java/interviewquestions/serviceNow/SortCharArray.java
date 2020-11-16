package interviewquestions.serviceNow;

import java.util.Arrays;
import java.util.Comparator;

public class SortCharArray {

  public static char[] sortArray(char[] ch) {
    for (int i = 0; i < ch.length; i++) {
      for (int j = i + 1; j < ch.length; j++) {
        if (ch[i] > ch[j]) {
          char temp = ch[i];
          ch[i] = ch[j];
          ch[j] = temp;
        }
      }
    }
    return ch;
  }

  public static Character[] sort(Character[] ch) {
    // Sort, ignoring case during sorting
    Arrays.sort(ch, new Comparator<Character>() {

      @Override
      public int compare(Character c1, Character c2) {
        // ignoring case
        return Character.compare(Character.toLowerCase(c1),
          Character.toLowerCase(c2));
      }
    });
    return ch;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(sortArray(new char[]{'g', 'e', 'f', 'a', 'c', 'd', 'b'})));
    System.out.println(Arrays.toString(sort(new Character[]{'g', 'e', 'f', 'a', 'c', 'd', 'b'})));
  }
}

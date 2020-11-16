package strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateWords {

  public static List<String> duplicateWords(String s) {
    String[] str = s.split("\\W+");
    Set<String> set = new HashSet<>();
    List<String> list = new ArrayList<>();
    for (String word : str) {
      if (!set.add(word)) {
        list.add(word);
      }
    }
    return list;
  }

  public static void main(String[] args) {
    List<String> duplicateWordslist = duplicateWords("&&&&(Hello***** !!!!!world^^^^^^ Hello world");
    for (String word : duplicateWordslist) {
      System.out.println(word);
    }
  }
}

package streams;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class CharactersCount {

  public static void distinctCharCount(String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    List<Character> list = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
    System.out.println("Characters list: " + list);
    list.stream().forEach(c -> map.merge(c, 1, Integer::sum));
    System.out.println(map);
  }

  public static void main(String[] args) {
    distinctCharCount("This is One Compiler Platform.");
  }
}

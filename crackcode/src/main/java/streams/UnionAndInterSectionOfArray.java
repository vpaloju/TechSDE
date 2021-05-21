package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UnionAndInterSectionOfArray {

  public static Set<Object> unionAndInterSection(List<Object> a, List<Object> b) {
    return a.stream().distinct().filter(b::contains).collect(Collectors.toSet());
  }

  public static void main(String[] args) {
    List<Object> a = Arrays.asList(1, 2, 5, 6, 2, 3, 5);
    List<Object> b = Arrays.asList(2, 4, 5, 6, 8, 9, 4, 6, 5);
    List<Object> list = Arrays.asList("red", "blue", "blue", "green", "red");
    List<Object> otherList = Arrays.asList("red", "green", "green", "yellow");
    unionAndInterSection(a, b).stream().forEach(System.out::println);
    unionAndInterSection(list, otherList).stream().forEach(System.out::println);
  }
}

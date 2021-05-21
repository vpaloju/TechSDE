package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctElmentsInArray<T> {

  public List<T> distinctElements(T[] a) {
    List<T> list = Arrays.asList(a);
    return list.stream().distinct().collect(Collectors.toList());
  }

  public static void main(String[] args) {
    DistinctElmentsInArray d = new DistinctElmentsInArray();
    Integer[] a = new Integer[]{1, 2, 3, 4, 5, 6, 2, 3, 4};
    String[] s = new String[]{"Geeks", "for", "Geeks",
      "GeeksQuiz", "for", "GeeksforGeeks"};
    List<Integer> aList = d.distinctElements(a);
    List<String> sList = d.distinctElements(s);
    aList.stream().forEach(System.out::println);
    sList.stream().forEach(System.out::println);
  }
}

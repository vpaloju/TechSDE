package interviewquestions.salesForce.distinctCharCountPredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filter {

  public static Predicate<String> nameStartingWithPrefix(String prefix) {
    return p -> p.startsWith(prefix);
  }

  public static List<String> filterEmployees(List<String> names, Predicate<String> predicate) {
    return names.stream().filter(predicate).collect(Collectors.toList());
  }

  public static void main(String[] args) {
    String[] names = new String[]{"Ram", "RamRaj", "RamKrishna", "Sriram"};
    Predicate<String> p = nameStartingWithPrefix("Ram");
    List<String> namesStartWithPrefix = filterEmployees(Arrays.asList(names), p);
    for (String name : namesStartWithPrefix) {
      System.out.print(name + " ");
    }
  }
}

package streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {

  public Object[] reverse(Object[] a) {
    return IntStream.range(0, a.length).mapToObj(i -> a[a.length - i - 1]).toArray();
  }

  public static void main(String[] args) {
    Integer[] a = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    String[] b = new String[]{"Hello", "Welcome", "To", "The", "World"};
    ReverseArray r = new ReverseArray();
    Arrays.stream(r.reverse(a)).forEach(System.out::println);
    Arrays.stream(r.reverse(b)).forEach(System.out::println);
  }
}

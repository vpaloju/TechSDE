package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayRotation<T> {

  public void rotateArray(List<T> a, int distance) {
    Collections.rotate(a, distance);
  }

  public static void main(String[] args) {
    List<Integer> a = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
    ArrayRotation ar = new ArrayRotation();
    ar.rotateArray(a, 1);
    a.stream().forEach(System.out::println);
  }
}

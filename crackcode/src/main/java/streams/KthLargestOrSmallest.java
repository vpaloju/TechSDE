package streams;

import java.util.Arrays;

public class KthLargestOrSmallest {

  public static int kthMinElement(int[] a, int k) {
    return Arrays.stream(a).distinct().sorted().skip(k - 1).limit(1).findFirst().getAsInt();
  }

  public static int kthMaxElement(int[] a, int k) {
    return Arrays.stream(a).distinct().sorted().skip(a.length - k - 1).limit(1).findFirst().getAsInt();
  }

  public static void main(String[] args) {
    int[] a = {2, 3, 1, 4, -2, 0, -3, 0, -1, 5};
    System.out.println(kthMaxElement(a, 3));
    System.out.println(kthMinElement(a, 3));
    System.out.println("*************");
    Arrays.stream(a).sorted().forEach(System.out::println);
  }

}

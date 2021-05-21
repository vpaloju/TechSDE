package streams;

import java.util.Arrays;

public class MinMaxElementInArray {

  public static int minElement(int[] a) {
    return Arrays.stream(a).min().getAsInt();
  }

  public static int maxElement(int[] a) {
    return Arrays.stream(a).max().getAsInt();
  }

  public static void main(String[] args) {
    int a[] = {1000, 11, 445, 1, 330, 3000};
    System.out.printf("\nMinimum element is %d", minElement(a));
    System.out.printf("\nMaximum element is %d", maxElement(a));
  }
}

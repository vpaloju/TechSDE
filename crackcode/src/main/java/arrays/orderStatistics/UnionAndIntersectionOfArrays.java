package arrays.orderStatistics;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersectionOfArrays {

  public static void unionAndInterSectionOfTwoArrays(int[] a, int[] b) {
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < a.length; i++) {
      set.add(a[i]);
    }
    for (int i = 0; i < b.length; i++) {
      set.add(b[i]);
    }
    System.out.println("Union of Two Arrays: ");
    for (Integer i : set) {
      System.out.print(i + " ");
    }
    set.clear();
    System.out.println();
    for (int i = 0; i < a.length; i++) {
      set.add(a[i]);
    }
    System.out.println("Intersection of Two Arrays: ");
    for (int i = 0; i < b.length; i++) {
      if (set.contains(b[i])) {
        System.out.print(b[i] + " ");
      }
    }
  }

  public static void main(String[] args) {
    int[] a = new int[]{7, 1, 5, 2, 3, 6};
    int[] b = new int[]{3, 8, 6, 20, 7};
    unionAndInterSectionOfTwoArrays(a, b);
  }
}

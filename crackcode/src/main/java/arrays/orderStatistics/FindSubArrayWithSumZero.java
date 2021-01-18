package arrays.orderStatistics;

import java.util.HashSet;
import java.util.Set;

public class FindSubArrayWithSumZero {

  public static void main(String[] args) {
    int[] a = new int[]{4, 2, -3, 1, 6};
    if (subArrayIsThereWithSumZero(a))
      System.out.println("Found a subarray with 0 sum");
    else
      System.out.println("No Such Sub Array Exists!");
  }

  public static boolean subArrayIsThereWithSumZero(int[] a) {
    Set<Integer> set = new HashSet<Integer>();
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
      if (a[i] == 0 || sum == 0 || set.contains(sum)) {
        return true;
      }
      set.add(sum);
    }
    return false;
  }
}

package arrays.orderStatistics;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of size n, find all elements in array that appear more than n/k times. For example, if the input arrays is {3, 1, 2, 2, 1, 2, 3, 3} and k is 4, then the output should be [2, 3]. Note that size of array is 8 (or n = 8), so we need to find all elements that appear more than 2 (or 8/4) times. There are two elements that appear more than two times, 2 and 3.
 */
public class OccuranceOfElementMoreThanGivenTimes {

  public static void occuranceOfElement(int[] a, int k) {
    int x = a.length / k;
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < a.length; i++) {
      if (!map.containsKey(a[i])) {
        map.put(a[i], 1);
      } else {
        map.put(a[i], map.get(a[i])+1);
      }
    }
    for (Map.Entry entry : map.entrySet()) {
      if ((Integer) entry.getValue() > x) {
        System.out.println(entry.getKey());
      }
    }
  }

  public static void main(String[] args) {
    int a[] = new int[]{1, 1, 2, 2, 3, 5, 4, 2, 2, 3, 1, 1, 1};
    int k = 4;
    occuranceOfElement(a, k);
  }

}

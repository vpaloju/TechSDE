package interviewquestions.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Dutch national flag problem.
 */
public class SortArrayOf0sand1sand2 {

  public static int[] sortArrayOf0sand1sand2(int[] array, int n) {

    int lo = 0;
    int hi = n - 1;
    int mid = 0, temp = 0;
    while (mid <= hi) {
      switch (array[mid]) {
        case 0: {
          temp = array[lo];
          array[lo] = array[mid];
          array[mid] = temp;
          lo++;
          mid++;
          break;
        }
        case 1:
          mid++;
          break;
        case 2: {
          temp = array[mid];
          array[mid] = array[hi];
          array[hi] = temp;
          hi--;
          break;
        }
      }
    }
    return array;
  }

  public static void main(String[] args) {
    Map map = new HashMap<Integer, String>();
    map.put(1, "a");
    int[] array = new int[]{0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
    System.out.println(Arrays.toString(sortArrayOf0sand1sand2(array, array.length)));
  }
}

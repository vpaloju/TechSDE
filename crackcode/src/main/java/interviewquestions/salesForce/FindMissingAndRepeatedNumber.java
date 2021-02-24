package interviewquestions.salesForce;

import java.util.HashMap;
import java.util.Map;

public class FindMissingAndRepeatedNumber {

  public static void missingAndRepeatedNumber(int[] a) {
    Map<Integer, Boolean> map = new HashMap<>();
    for (int i : a) {
      if (map.get(i) == null) {
        map.put(i, true);
      } else {
        System.out.println("Repeated number is " + i);
      }
    }
    for (int i = 1; i <= a.length; i++) {
      if (map.get(i) == null) {
        System.out.println("Missing number is " + i);
      }
    }
  }

  public static void main(String[] args) {
    missingAndRepeatedNumber(new int[]{4, 3, 6, 2, 1, 1});
  }
}

package interviewquestions.QAProfile;

/**
 * You have an array of n integers, find the number (if exist ) which is occurring more than n/2 no. of times in O(1) space and O(n) time complexity
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OccuranceOfNumber {

  public static int occuranceOfNumber(int[] array) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < array.length; i++) {
      if (!map.containsKey(array[i])) {
        map.put(array[i], 1);
      } else {
        map.put(array[i], map.get(array[i]) + 1);
      }
      if (map.get(array[i]) == (array.length / 2) - 1) {
        return array[i];
      }
    }
    return 0;
  }

  public static int occuranceOfNumber(int[] array, int key) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < array.length; i++) {
      if (!map.containsKey(array[i])) {
        map.put(array[i], 1);
      } else {
        map.put(array[i], map.get(array[i]) + 1);
      }
    }
    return map.get(key);
  }

    public static void countFreq(int arr[], int n) {
        boolean visited[] = new boolean[n];
        //Assigns the specified boolean value to each element of the specified array of booleans.
        Arrays.fill(visited, false);
        // Traverse through array elements and count frequencies
        for (int i = 0; i < n; i++) {
            // Skip this element if already processed
            if (visited[i] == true)
                continue;
            // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }

  public static void main(String[] args) {
    System.out.println(occuranceOfNumber(new int[]{1, 2, 3, 4, 5, 6, 6, 6}));
    System.out.println(occuranceOfNumber(new int[]{1, 2, 3, 4, 5, 6, 6, 6}, 6));
  }
}

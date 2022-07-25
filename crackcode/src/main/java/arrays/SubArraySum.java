package arrays;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {

    public static boolean subArraySum(int[] a, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        int curr_sum = 0, start = 0, end = -1;
        for (int i = 0; i < a.length; i++) {
            curr_sum += a[i];
            if (curr_sum - sum == 0) {
                start = 0;
                end = i;
                break;
            }
            if (map.containsKey(curr_sum-sum)) {
                start = map.get(curr_sum - sum) + 1;
                end = i;
                break;
            }
            map.put(curr_sum, i);
        }
        if (end == -1) {
            System.out.println("No subarray with given sum exists");
            return false;
        } else {
            System.out.println("Sum found between indexes " + start + " to " + end);
            return true;
        }
    }

    public static void main(String[] args) {
        subArraySum(new int[]{ 3, 6, 12, 35 }, 47);
    }
}

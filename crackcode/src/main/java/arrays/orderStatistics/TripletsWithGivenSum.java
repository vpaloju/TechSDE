package arrays.orderStatistics;

import java.util.HashSet;
import java.util.Set;

/**
 * Find a triplet that sum to a given value
 * Difficulty Level : Medium
 * Last Updated : 13 Nov, 2020
 * Given an array and a value, find if there is a triplet in array whose sum is equal to the given value. If there is such a triplet present in array, then print the triplet and return true. Else return false.
 * Example:
 * <p>
 * Input: array = {12, 3, 4, 1, 6, 9}, sum = 24;
 * Output: 12, 3, 9
 * Explanation: There is a triplet (12, 3 and 9) present
 * in the array whose sum is 24.
 * <p>
 * Input: array = {1, 2, 3, 4, 5}, sum = 9
 * Output: 5, 3, 1
 * Explanation: There is a triplet (5, 3 and 1) present
 * in the array whose sum is 9.
 */
public class TripletsWithGivenSum {

    public static boolean findTriplet(int[] a, int sum) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    if (a[i] + a[j] + a[k] == sum) {
                        System.out.println("Triplet is: " + a[i] + "," + a[j] + "," + a[k]);
                        return true;
                    }
                }
            }
        }
        System.out.println("There is no Triplets with the give Sum!");
        return false;
    }

    public static boolean findTriplets(int[] a, int sum) {
        for (int i = 0; i < a.length - 2; i++) {
            Set<Integer> set = new HashSet<>();
            int curr_sum = sum - a[i];
            for (int j = i + 1; j < a.length; j++) {
                if (set.contains(curr_sum - a[j])) {
                    System.out.println("Triplet is: " + a[i] + "," + a[j] + "," + (curr_sum - a[j]));
                    return true;
                }
                set.add(a[j]);
            }
        }
        System.out.println("There is no Triplets with the give Sum!");
        return false;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 4, 45, 6, 10, 8};
        findTriplets(a, 22);
        findTriplet(a, 22);
    }
}

package arrays.orderStatistics;

/**
 * Minimum swaps required to bring all elements less than or equal to k together
 * Difficulty Level : Medium
 * Last Updated : 19 Jul, 2018
 * Given an array of n positive integers and a number k. Find the minimum number of swaps required to bring all the numbers less than or equal to k together.
 * <p>
 * Input:  arr[] = {2, 1, 5, 6, 3}, k = 3
 * Output: 1
 * <p>
 * Explanation:
 * To bring elements 2, 1, 3 together, swap
 * element '5' with '3' such that final array
 * will be-
 * arr[] = {2, 1, 3, 6, 5}
 * <p>
 * Input:  arr[] = {2, 7, 9, 5, 8, 7, 4}, k = 5
 * Output: 2
 */
public class MinSwapsRequiredToBringElementsTogather {

    public static int minSwapsToBringCloserElementsTogather(int[] a, int k) {
        int n = a.length;
        // Find count of elements which are less than equals to k
        int count = 0;
        for (int i = 0; i < n; ++i) {
            if (a[i] <= k) {
                ++count;
            }
        }
        // Find unwanted elements in current window of size 'count'
        int bad = 0;
        for (int i = 0; i < count; ++i) {
            if (a[i] > k) {
                ++bad;
            }
        }

        // Initialize answer with 'bad' value of current window
        int result = bad;
        for (int i = 0, j = count; j < n; ++i, ++j) {
            // Decrement count of previous window
            if (a[i] > k) {
                --bad;
            }
            // Increment count of current window
            if (a[j] > k) {
                ++bad;
            }
            // Update result if count of 'bad' is less in current window
            result = Math.min(result, bad);
        }
        return result;
    }

    public static void main(String[] args) {
        int a[] = {2, 1, 5, 6, 3};
        int k = 3;
        System.out.print(minSwapsToBringCloserElementsTogather(a, k) + "\n");
    }
}

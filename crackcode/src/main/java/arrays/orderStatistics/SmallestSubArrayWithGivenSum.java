package arrays.orderStatistics;

/**
 * Smallest subarray with sum greater than a given value
 * Given an array of integers and a number x, find the smallest subarray with sum greater than the given value.
 * Examples:
 * arr[] = {1, 4, 45, 6, 0, 19}
 * x  =  51
 * Output: 3
 * Minimum length subarray is {4, 45, 6}
 * <p>
 * arr[] = {1, 10, 5, 2, 7}
 * x  = 9
 * Output: 1
 * Minimum length subarray is {10}
 * <p>
 * arr[] = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250}
 * x = 280
 * Output: 4
 * Minimum length subarray is {100, 1, 0, 200}
 * <p>
 * arr[] = {1, 2, 4}
 * x = 8
 * Output : Not Possible
 * Whole array sum is smaller than 8.
 */
public class SmallestSubArrayWithGivenSum {

    public static int smallestSubArrayLengthProduceGivenSum(int[] a, int sum) {
        int min_len = a.length + 1;
        for (int start = 0; start < a.length; start++) {
            int curr_sum = a[start];
            if (curr_sum > sum) {
                return 1;
            }
            for (int end = start + 1; end < a.length; end++) {
                curr_sum += a[end];
                if (curr_sum > sum && (end - start + 1) < min_len) {
                    min_len = (end - start + 1);
                }
            }
        }
        return min_len;
    }

    public static void main(String[] args) {
        int a[] = {1, 4, 45, 6, 10, 19};
        int x = 51;
        System.out.println(smallestSubArrayLengthProduceGivenSum(a, x));
    }
}

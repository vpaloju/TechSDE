package arrays.arrangementOfArrays;

/**
 * Minimum swaps required to bring all elements less than or equal to k together
 * Last Updated: 19-07-2018
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
 * Recommended: Please solve it on “PRACTICE” first, before moving on to the solution.
 * A simple solution is to first count all elements less than or equals to k(say ‘good’). Now traverse for every sub-array and swap those elements whose value is greater than k. Time complexity of this approach is O(n2)
 * <p>
 * A simple approach is to use two pointer technique and sliding window.
 * <p>
 * Find count of all elements which are less than or equals to ‘k’. Let’s say the count is ‘cnt’
 * Using two pointer technique for window of length ‘cnt’, each time keep track of how many elements in this range are greater than ‘k’. Let’s say the total count is ‘bad’.
 * Repeat step 2, for every window of length ‘cnt’ and take minimum of count ‘bad’ among them. This will be the final answer.
 */
public class MinimumSwapsToArrangeClosestElementsToGather {

  public static int minimumSwaps(int[] a, int k) {
    int count = 0, n = a.length;
    // Find count of elements which are less than equals to k
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
    int ans = bad;
    for (int i = 0, j = count; j < n; ++i, ++j) {
      // Decrement count of previous window
      if (a[i] > k) {
        --bad;
      }
      // Increment count of current window
      if (a[j] > k) {
        ++bad;
      }
      // Update ans if count of 'bad' is less in current window
      ans = Math.min(ans, bad);
    }
    return ans;
  }

  public static void main(String[] args) {
    int[] a = new int[]{2, 1, 5, 6, 3};
    System.out.println(minimumSwaps(a, 3));
    a = new int[]{2, 7, 9, 5, 8, 7, 4};
    System.out.println(minimumSwaps(a, 5));
  }

}

package interviewquestions.salesForce;

/**
 * Partition a set into two subsets such that the difference of subset sums is minimum
 * Given a set of integers, the task is to divide it into two sets S1 and S2 such that the absolute difference between their sums is minimum.
 * If there is a set S with n elements, then if we assume Subset1 has m elements, Subset2 must have n-m elements and the value of abs(sum(Subset1) – sum(Subset2)) should be minimum.
 * Example:
 *
 * Input:  arr[] = {1, 6, 11, 5}
 * Output: 1
 * Explanation:
 * Subset1 = {1, 5, 6}, sum of Subset1 = 12
 * Subset2 = {11}, sum of Subset2 = 11
 */
public class PartitionSetsWithDP {

  public static int findMin(int[] a, int n) {
    int sum = 0;
    for (int i : a) {
      sum += i;
    }
    boolean dp[][] = new boolean[n + 1][sum + 1];
    //Initialize first column as true
    for (int i = 0; i < n; i++) {
      dp[i][0] = true;
    }
    //Initialize top row as false.
    for (int i = 0; i < n; i++) {
      dp[0][i] = false;
    }
    //Fill the partition table in bottom up manner
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= sum; j++) {
        dp[i][j] = dp[i - 1][j];
        if (a[i - 1] <= j) {
          dp[i][j] = dp[i - 1][j - a[i - 1]];
        }
      }
    }
    int diff = Integer.MAX_VALUE;
    for (int j = sum / 2; j >= 0; j--) {
      if (dp[n][j] == true) {
        diff = sum - 2 * j;
        break;
      }
    }
    return diff;
  }

  public static void main(String[] args) {
    int arr[] = {3, 1, 4, 2, 2, 1};
    int n = arr.length;
    System.out.println("The minimum difference between 2 sets is "
      + findMin(arr, n));
  }
}

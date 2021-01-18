package arrays.orderStatistics;

public class LargestSumContiguousSubArray {

  /** Kadane’s Algorithm:
   * Initialize:
   *     max_so_far = 0
   *     max_ending_here = 0
   *
   * Loop for each element of the array
   *   (a) max_ending_here = max_ending_here + a[i]
   *   (c) if(max_ending_here < 0){
   *            max_ending_here = 0
   *   (b) }else if(max_so_far < max_ending_here)
   *             max_so_far = max_ending_here
   * return max_so_far
   * @param a
   * @return
   */
  public static int largestSumContiguousSubArray(int[] a) {
    int max_so_far = 0, max_ending_here = 0;
    for (int i = 0; i < a.length; i++) {
      max_ending_here += a[i];
      if (max_ending_here < 0) {
        max_ending_here = 0;
      } else if (max_so_far < max_ending_here) {
        max_so_far = max_ending_here;
      }
    }
    return max_so_far;
  }

  public static void main(String[] args) {
    int[] a = new int[]{-2, -3, 4, -1, -2, 1, 5, -3};
    System.out.println(largestSumContiguousSubArray(a));
  }
}

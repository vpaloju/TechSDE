package arrays.orderStatistics;

/**
 * Program to find largest element in an array
 * Last Updated: 13-06-2020
 * Given an array, find the largest element in it.
 * <p>
 * Example:
 * <p>
 * Input : arr[] = {10, 20, 4}
 * Output : 20
 * <p>
 * Input : arr[] = {20, 10, 20, 4, 100}
 * Output : 100
 * Recommended: Please solve it on “PRACTICE ” first, before moving on to the solution.
 * The solution is to initialize max as first element, then traverse the given array from second element till end. For every traversed element, compare it with max, if it is greater than max, then update max.
 */
public class FindLargestElement {

  public static int largestElement(int[] a) {
    int n = a.length;
    int largestElement = a[0];
    for (int i = 1; i < n; i++) {
      if (largestElement < a[i]) {
        largestElement = a[i];
      }
    }
    return largestElement;
  }

  public static void main(String[] args) {
    int[] a = {20, 10, 20, 4, 100};
    System.out.println(largestElement(a));
  }
}

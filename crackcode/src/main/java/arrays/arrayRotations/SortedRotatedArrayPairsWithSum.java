package arrays.arrayRotations;

/**
 * Given a sorted and rotated array, find if there is a pair with a given sum
 * Input: arr[] = {11, 15, 6, 8, 9, 10}, x = 16
 * Output: true
 * There is a pair (6, 10) with sum 16
 * <p>
 * Input: arr[] = {11, 15, 26, 38, 9, 10}, x = 35
 * Output: true
 * There is a pair (26, 9) with sum 35
 * <p>
 * Input: arr[] = {11, 15, 26, 38, 9, 10}, x = 45
 * Output: false
 * There is no pair with sum 45.
 */
public class SortedRotatedArrayPairsWithSum {

  public static boolean pairInSortedRotated(int[] a, int sum) {
    int i, n = a.length;
    for (i = 0; i < n; i++) {
      if (a[i] > a[i + 1]) {
        break;
      }
    }
    int r = i;
    int l = (i + 1) % (n);
    while (l != r) {
      if (a[l] + a[r] == sum) {
        return true;
      } else if (a[l] + a[r] < sum) {
        l = (l + 1) % n;
      } else {
        r = (n + r - 1) % n;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int arr[] = {11, 15, 6, 8, 9, 10};
    int sum = 45;
    if (pairInSortedRotated(arr, sum)) {
      System.out.print("Array has two elements" + " with sum 16");
    } else {
      System.out.print("Array doesn't have two" + " elements with sum 16 ");
    }
  }
}

package arrays.arrayRotations;

/**
 * Find the Rotation Count in Rotated Sorted array
 * Solution to find out index of Min element or binary search.
 * Examples:
 * <p>
 * Input : arr[] = {15, 18, 2, 3, 6, 12}
 * Output: 2
 * Explanation : Initial array must be {2, 3,
 * 6, 12, 15, 18}. We get the given array after
 * rotating the initial array twice.
 * <p>
 * Input : arr[] = {7, 9, 11, 12, 5}
 * Output: 4
 * <p>
 * Input: arr[] = {7, 9, 11, 12, 15};
 * Output: 0
 */
public class RotaionCountsOfSortedRotatedArray {

  public static int countRotations(int[] a) {
    int min = a[0], minIndex = 0;
    for (int i = 0; i < a.length; i++) {
      if (min > a[i]) {
        min = a[i];
        minIndex = i;
      }
    }
    return minIndex;
  }

  public static int countRotations(int[] a, int low, int high) {
    // This condition is needed to handle the case when array is not rotated at all
    if (high < low) {
      return 0;
    }
    // If there is only one element left
    if (high == low) {
      return low;
    }
    int mid = (low + high) / 2;
    // Check if element (mid+1) is minimum element. Consider the cases like {3, 4, 5, 1, 2}
    if (mid < high && a[mid + 1] < a[mid]) {
      return (mid + 1);
    }
    // Check if mid itself is minimum element
    if (mid > low && a[mid] < a[mid - 1]) {
      return mid;
    }
    // Decide whether we need to go to left half or right half
    if (a[high] > a[mid]) {
      return countRotations(a, low, mid - 1);
    }
    return countRotations(a, mid + 1, high);
  }

  public static void main(String[] args) {
    int[] a = new int[]{7, 9, 11, 12, 15};
    System.out.println(countRotations(a));
    System.out.println(countRotations(a, 0, a.length - 1));
  }
}

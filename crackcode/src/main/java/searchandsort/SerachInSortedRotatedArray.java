package searchandsort;

/**
 * Search an element in a sorted and rotated array
 * An element in a sorted array can be found in O(log n) time via binary search. But suppose we rotate an ascending order sorted array at some pivot unknown to you beforehand. So for instance, 1 2 3 4 5 might become 3 4 5 1 2. Devise a way to find an element in the rotated array in O(log n) time.
 * Example:
 * Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
 * key = 3
 * Output : Found at index 8
 * <p>
 * Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
 * key = 30
 * Output : Not found
 * <p>
 * Input : arr[] = {30, 40, 50, 10, 20}
 * key = 10
 * Output : Found at index 3
 */
public class SerachInSortedRotatedArray {

  public static int search(int[] a, int low, int high, int key) {
    if (low > high) {
      return 1;
    }
    int mid = (low + high) / 2;
    if (key == a[mid]) {
      return mid;
    }
    if (a[low] <= a[mid]) {
      if (key >= a[low] && key <= a[mid]) {
        return search(a, low, mid - 1, key);
      }
      return search(a, mid + 1, high, key);
    }
    if (key >= a[mid] && key <= a[high]) {
      return search(a, mid + 1, high, key);
    }
    return search(a, low, mid - 1, key);
  }

  public static void main(String[] args) {
    int[] a = new int[]{4, 5, 6, 7, 8, 9, 1, 2, 3};
    System.out.println("Given Element found at: " + search(a, 0, a.length - 1, 6));
  }
}

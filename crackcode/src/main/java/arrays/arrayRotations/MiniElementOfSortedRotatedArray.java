package arrays.arrayRotations;

public class MiniElementOfSortedRotatedArray {

  public static int minElement(int[] a) {
    int n = a.length, minElement = a[0];
    for (int i = 0; i < n; i++) {
      if (minElement > a[i]) {
        minElement = a[i];
      }
    }
    return minElement;
  }

  /**
   * This is an optimal solution O(Logn)
   *
   * @param a
   * @param low
   * @param high
   * @return
   */
  public static int minElement(int[] a, int low, int high) {
    if (high < low) {
      return 0;
    }
    if (low == high) {
      return low;
    }
    int mid = (low + high) / 2;
    if (mid < high && a[mid + 1] < a[mid]) {
      return a[mid + 1];
    }
    if (mid > low && a[mid] < a[mid - 1]) {
      return a[mid];
    }
    if (a[high] > a[mid]) {
      return minElement(a, low, mid - 1);
    }
    return minElement(a, mid + 1, high);
  }

  public static void main(String[] args) {
    int[] a = new int[]{5, 6, 1, 2, 3, 4};
    System.out.println(minElement(a));
    System.out.println(minElement(a, 0, a.length - 1));
  }

}

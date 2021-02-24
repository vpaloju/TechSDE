package searchandsort;

public class FindFixedPoint {

  public static int findFixedPoint(int[] a) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] == i) {
        return i;
      }
    }
    return -1;
  }

  public static int findFixedPointBinarySearch(int[] a, int low, int high) {
    while (low <= high) {
      int mid = (low + high) / 2;
      if (mid == a[mid]) {
        return mid;
      } else if (a[mid] > mid) {
        return findFixedPointBinarySearch(a, low, mid - 1);
      } else {
        return findFixedPointBinarySearch(a, mid + 1, high);
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] a = {-10, -5, 0, 3, 7};
    System.out.println(findFixedPoint(a));
    System.out.println(findFixedPointBinarySearch(a, 0, a.length - 1));
  }
}

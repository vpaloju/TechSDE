package searchandsort;

/**
 * Find first and last positions of an element in a sorted array
 * Difficulty Level : Easy
 * Last Updated : 28 Dec, 2020
 * Given a sorted array with possibly duplicate elements, the task is to find indexes of first and last occurrences of an element x in the given array.
 * Examples:
 * <p>
 * Input : arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}
 * x = 5
 * Output : First Occurrence = 2
 * Last Occurrence = 5
 * <p>
 * Input : arr[] = {1, 3, 5, 5, 5, 5, 7, 123, 125 }
 * x = 7
 * Output : First Occurrence = 6
 * Last Occurrence = 6
 */
public class FirstAndLastPosOfElementInSortedArray {

  public static void firstAndLastPosition(int[] a, int key) {
    int first = -1, last = -1;
    for (int i = 0; i < a.length; i++) {
      if (key != a[i]) {
        continue;
      }
      if (first == -1) {
        first = i;
      }
      last = i;
    }
    if (first != -1) {
      System.out.println("First Occurrence = " + first);
      System.out.println("Last Occurrence = " + last);
    } else {
      System.out.println("Not Found!");
    }
  }


  public static int firstPosOfElement(int[] a, int x) {
    int low = 0, high = a.length - 1, result = -1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (x < a[mid]) {
        high = mid - 1;
      } else if (x > a[mid]) {
        low = mid + 1;
      } else {
        result = mid;
        high = mid - 1;
      }
    }
    return result;
  }

  public static int lastPosOfElement(int[] a, int x) {
    int low = 0, high = a.length - 1, result = -1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (x < a[mid]) {
        high = mid - 1;
      } else if (x > a[mid]) {
        low = mid + 1;
      } else {
        result = mid;
        low = mid + 1;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int arr[] = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
    int x = 8;
    firstAndLastPosition(arr, x);
    System.out.println("First Occurrence = " + firstPosOfElement(arr, x));
    System.out.println("Last Occurrence = " + lastPosOfElement(arr, x));
  }
}

package arrays.orderStatistics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Find whether an array is subset of another array | Added Method 5
 * Given two arrays: arr1[0..m-1] and arr2[0..n-1]. Find whether arr2[] is a subset of arr1[] or not. Both the arrays are not in sorted order. It may be assumed that elements in both array are distinct.
 */
public class ArrayIsSubSetOfOtherArray {

  public static boolean isSubset(int[] a, int[] b) {
    int m = a.length;
    int n = b.length;
    Set<Integer> set = new HashSet<Integer>();
    for (int i = 0; i < m; i++) {
      if (!set.contains(a[i])) {
        set.add(a[i]);
      }
    }
    for (int i = 0; i < n; i++) {
      if (!set.contains(b[i])) {
        return false;
      }
    }
    return true;
  }

  public static boolean isSubSet(int[] a, int[] b, int m, int n) {
    if (m < n) {
      return false;
    }
    int i = 0, j = 0;
    Arrays.sort(a);
    Arrays.sort(b);
    while (i < n && j < m) {
      if (a[j] < b[i]) {
        j++;
      } else if (a[j] == b[i]) {
        j++;
        i++;
      } else if (a[j] > b[i]) {
        return false;
      }
    }
    if (i < n) {
      return false;
    } else {
      return true;
    }
  }

  public static void main(String[] args) {
    int arr1[] = {11, 1, 13, 21, 3, 7};
    int arr2[] = {11, 3, 7, 1};

    if (isSubset(arr1, arr2))
      System.out.println("arr2 is a subset of arr1");
    else
      System.out.println(
        "arr2 is not a subset of arr1");
    int m = arr1.length;
    int n = arr2.length;

    if (isSubSet(arr1, arr2, m, n))
      System.out.println("arr2 is a subset of arr1");
    else
      System.out.println("arr2 is not a subset of arr1");
  }
}

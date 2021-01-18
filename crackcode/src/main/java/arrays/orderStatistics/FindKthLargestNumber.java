package arrays.orderStatistics;

import java.util.Arrays;

/**
 * K’th Smallest/Largest Element in Unsorted Array | Set 1
 * Last Updated: 13-04-2020
 * Given an array and a number k where k is smaller than size of array, we need to find the k’th smallest element in the given array. It is given that ll array elements are distinct.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = {7, 10, 4, 3, 20, 15}
 * k = 3
 * Output: 7
 * <p>
 * Input: arr[] = {7, 10, 4, 3, 20, 15}
 * k = 4
 * Output: 10
 * <p>
 * Method 1 (Simple Solution)
 * A simple solution is to sort the given array using a O(N log N) sorting algorithm like Merge Sort, Heap Sort, etc and return the element at index k-1 in the sorted array.
 * <p>
 * Time Complexity of this solution is O(N Log N)
 */
public class FindKthLargestNumber {

  public static int findKThLargest(int[] a, int k) {
    if (k < 0 || k > a.length) {
      return -1;
    }
    return findKThLargest(a, 0, a.length - 1, k);
  }

  public static int findKThLargest(int[] a, int start, int end, int k) {
    int pivot = start;
    int left = start;
    int right = end;
    while (left < right) {
      while (left <= right && a[left] <= a[pivot])
        left++;
      while (left <= right && a[right] >= a[pivot])
        --right;
      if (left < right) {
        swap(a, left, right);
      }
    }
    swap(a, pivot, right);
    if (k == right + 1) {
      return a[right];
    } else if (k > right + 1) {
      return findKThLargest(a, right + 1, end, k);
    } else {
      return findKThLargest(a, start, right - 1, k);
    }
  }

  public static void swap(int[] num, int a, int b) {
    int temp = num[a];
    num[a] = num[b];
    num[b] = temp;
  }

  public static int kthSmallest(int[] a, int k) {
    Arrays.sort(a);
    return a[k - 1];
  }

  public static int kthLargest(int[] a, int k) {
    Arrays.sort(a);
    return a[a.length - k];
  }

  public static void main(String[] args) {
    int[] a = {12, 3, 5, 7, 19};
    /*System.out.println(kthLargest(a, 2));
    System.out.println(kthSmallest(a, 2));*/
    System.out.println(findKThLargest(a, 0, a.length - 1, 2));
  }
}

package arrays.orderStatistics;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class FindKthSmallestElement {

  public static int findKthSmallestElement(int[] a, int start, int end, int k) {
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
      return findKthSmallestElement(a, right + 1, end, k);
    } else {
      return findKthSmallestElement(a, start, right - 1, k);
    }
  }

  public static void swap(int[] num, int a, int b) {
    int temp = num[a];
    num[a] = num[b];
    num[b] = temp;
  }

  public static int findKthSmallestElement(int[] a, int k) {
    Arrays.sort(a);
    return a[k - 1];
  }

  public static int findKthSmallestElement(List<Integer> a, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.addAll(a);
    int i = 0;
    while (++i < k) {
      pq.poll();
    }
    return pq.peek();
  }

  public static void main(String[] args) {
    int[] a = {12, 3, 5, 7, 19};
    System.out.println(findKthSmallestElement(a, 4));
    System.out.println(findKthSmallestElement(Arrays.asList(12, 3, 5, 7, 19), 4));
  }

}

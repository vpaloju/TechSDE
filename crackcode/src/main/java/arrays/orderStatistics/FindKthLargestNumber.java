package arrays.orderStatistics;

import java.util.*;

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

  // Function to find the K'th largest element in the array using max-heap
  public static int findKThLargest(List<Integer> ints, int k) {
    // create a max-heap using PriorityQueue class from all elements in the list
    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
    // or pass Comparator.reverseOrder()
    //PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    pq.addAll(ints);

    // pop from max-heap exactly (k-1) times
    while (--k > 0) {
      pq.poll();
    }
    // return the root of max-heap
    return pq.peek();
  }


  /**
   * Using Arrays.sort() method.
   *
   * @param a
   * @param k
   * @return
   */
  public static int kthLargest(int[] a, int k) {
    Arrays.sort(a);
    return a[a.length - k];
  }


  public static void main(String[] args) {
    List<Integer> a = Arrays.asList(12, 3, 5, 7, 19);
    System.out.println(findKThLargest(a, 1));
    System.out.println(kthLargest(new int[]{12, 3, 5, 7, 19}, 1));
  }
}

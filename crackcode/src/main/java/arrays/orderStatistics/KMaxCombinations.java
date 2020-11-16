package arrays.orderStatistics;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * K maximum sum combinations from two arrays
 * Last Updated: 15-10-2020
 * Given two equally sized arrays (A, B) and N (size of both arrays).
 * A sum combination is made by adding one element from array A and another element of array B. Display the maximum K valid sum combinations from all the possible sum combinations.
 * Examples:
 * <p>
 * Input :  A[] : {3, 2}
 * B[] : {1, 4}
 * K : 2 [Number of maximum sum
 * combinations to be printed]
 * Output : 7    // (A : 3) + (B : 4)
 * 6    // (A : 2) + (B : 4)
 * <p>
 * Input :  A[] : {4, 2, 5, 1}
 * B[] : {8, 0, 3, 5}
 * K : 3
 * Output : 13   // (A : 5) + (B : 8)
 * 12   // (A : 4) + (B :  8)
 * 10   // (A : 2) + (B : 8)
 * Approach 1 (Naive Algorithm) :
 * We can use Brute force through all the possible combinations that can be made by taking one element from array A and another from array B and inserting them to a max heap. In a max heap maximum element is at the root node so whenever we pop from max heap we get the maximum element present in the heap. After inserting all the sum combinations we take out K elements from max heap and display it.
 * Below is the implementation of the above approach.
 */
public class KMaxCombinations {

  public static void kMaxCombinations(int[] a, int[] b, int k) {
    int n = a.length;
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        maxHeap.add(a[i] + b[j]);
      }
    }
    int count = 0;
    while (count < k) {
      System.out.println(maxHeap.peek());
      maxHeap.remove();
      count++;
    }
  }

  public static void main(String[] args) {
    int[] a = {4, 2, 5, 1};
    int[] b = {8, 0, 5, 3};
    int k = 3;
    kMaxCombinations(a, b, k);
  }
}

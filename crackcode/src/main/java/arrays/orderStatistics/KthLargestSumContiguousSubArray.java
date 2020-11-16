package arrays.orderStatistics;

import java.util.PriorityQueue;

/**
 * Given an array of integers. Write a program to find the K-th largest sum of contiguous subarray within the array of numbers which has negative and positive numbers.
 * <p>
 * Examples:
 * <p>
 * <p>
 * Input: a[] = {20, -5, -1}
 * k = 3
 * Output: 14
 * Explanation: All sum of contiguous
 * subarrays are (20, 15, 14, -5, -6, -1)
 * so the 3rd largest sum is 14.
 * <p>
 * Input: a[] = {10, -10, 20, -40}
 * k = 6
 * Output: -10
 * Explanation: The 6th largest sum among
 * sum of all contiguous subarrays is -10.
 * A brute force approach approach is to store all the contiguous sums in another array and sort it, and print the k-th largest. But in case of number of elements being large, the array in which we store the contiguous sums will run out of memory as the number of contiguous subarrays will be large (quadratic order)
 * <p>
 * An efficient approach is store the pre-sum of the array in a sum[] array. We can find sum of contiguous subarray from index i to j as sum[j]-sum[i-1]
 * <p>
 * Now for storing the Kth largest sum, use a min heap (priority queue) in which we push the contiguous sums till we get K elements, once we have our K elements, check if the element is greater than the Kth element it is inserted to the min heap with popping out the top element in the min-heap, else not inserted . At the end the top element in the min-heap will be your answer.
 * <p>
 * Below is the implementation of above approach.
 */
public class KthLargestSumContiguousSubArray {

  public static int kthLargestSum(int[] a, int k) {
    int n = a.length;
    // array to store predix sums
    int sum[] = new int[n + 1];
    sum[0] = 0;
    sum[1] = a[0];
    for (int i = 2; i <= n; i++) {
      sum[i] = sum[i - 1] + a[i - 1];
    }
    // priority_queue of min heap
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
    // loop to calculate the contigous subarray sum position-wise
    for (int i = 1; i <= n; i++) {
      // loop to traverse all positions that form contiguous subarray
      for (int j = i; j <= n; j++) {
        // calculates the contiguous subarray sum from j to i index
        int x = sum[j] - sum[i - 1];
        // if queue has less then k elements, then simply push it
        if (priorityQueue.size() < k) {
          priorityQueue.add(x);
        } else {
          // it the min heap has equal to k elements then just check if the largest kth element is smaller than x then insert else its of no use
          if (priorityQueue.peek() < x) {
            priorityQueue.poll();
            priorityQueue.add(x);
          }
        }
      }
    }
    // the top element will be then kth largest element
    return priorityQueue.poll();
  }

  public static void main(String[] args) {
    int[] a = {20, -5, -1};
    int k = 6;
    System.out.println(kthLargestSum(a, k));
  }
}

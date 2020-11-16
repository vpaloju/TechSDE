package arrays.orderStatistics;

import java.util.PriorityQueue;

/**
 * Minimum product of k integers in an array of positive Integers
 * Last Updated: 14-06-2019
 * Given an array of n positive integers. We are required to write a program to print the minimum product of k integers of the given array.
 * <p>
 * Examples:
 * <p>
 * Input : 198 76 544 123 154 675
 * k = 2
 * Output : 9348
 * We get minimum product after multiplying
 * 76 and 123.
 * <p>
 * Input : 11 8 5 7 5 100
 * k = 4
 * Output : 1400
 * The idea is simple, we find the smallest k elements and print multiplication of them.
 * In below implementation, we have used simple Heap based approach where we insert array elements into a min heap and then find product of top k elements.
 */
public class MinimumProdOfKElements {

  public static int minProduct(int[] a, int k) {
    int n = a.length;
    PriorityQueue<Integer> pqueue = new PriorityQueue<>();
    for (int i : a) {
      pqueue.add(i);
    }
    int count = 0, minProduct = 1;
    while (pqueue.isEmpty() == false && count < k) {
      minProduct *= pqueue.element();
      pqueue.remove();
      count++;
    }
    return minProduct;
  }

  public static void main(String[] args) {
    int[] a = {198, 76, 544, 123, 154, 675};
    System.out.println(minProduct(a, 2));
  }
}

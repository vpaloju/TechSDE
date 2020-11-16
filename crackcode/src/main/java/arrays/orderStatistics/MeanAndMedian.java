package arrays.orderStatistics;

import java.util.Arrays;

/**
 * Program for Mean and median of an unsorted array
 * Last Updated: 10-10-2019
 * Given n size unsorted array, find its mean and median.
 * <p>
 * Mean of an array = (sum of all elements) / (number of elements)
 * <p>
 * Median of a sorted array of size n is defined as the middle element when n is odd and average of middle two elements when n is even.
 * <p>
 * Since the array is not sorted here, we sort the array first, then apply above formula.
 * <p>
 * Examples:
 * <p>
 * <p>
 * <p>
 * <p>
 * Input  : a[] = {1, 3, 4, 2, 6, 5, 8, 7}
 * Output : Mean = 4.5
 * Median = 4.5
 * Sum of the elements is 1 + 3 + 4 + 2 + 6 +
 * 5 + 8 + 7 = 36
 * Mean = 36/8 = 4.5
 * Since number of elements are even, median
 * is average of 4th and 5th largest elements.
 * which means (4 + 5)/2 = 4.5
 * <p>
 * Input  : a[] = {4, 4, 4, 4, 4}
 * Output : Mean = 4
 * Median = 4
 */
public class MeanAndMedian {

  public static double mean(int[] a) {
    int sum = 0, n = a.length;
    for (int i = 0; i < n; i++) {
      sum += a[i];
    }
    return (double) sum / n;
  }

  public static double medianOfUnsortedArray(int[] a) {
    int n = a.length;
    Arrays.sort(a);
    return (double) n % 2 != 0 ? a[n / 2] : ((a[(n - 1) / 2] + a[(n / 2)])) / 2.0;
  }

  public static void main(String[] args) {
    int[] a = {1, 3, 4, 2, 6, 5, 8, 7};
    System.out.println("Mean is: " + mean(a));
    System.out.println("Median is: " + medianOfUnsortedArray(a));
  }
}

package interviewquestions.salesForce;

import java.util.Arrays;

public class MeanAndMedianOfArray {

  public static double findMedian(int[] a, int n) {
    Arrays.sort(a);
    return n % 2 != 0 ? (double) a[n / 2] : (double) (a[(n - 1) / 2] + a[n / 2]) / 2.0;
  }

  public static double findMean(int[] a, int n) {
    int sum = 0;
    for (int i : a) {
      sum += i;
    }
    return (double) sum / (double) n;
  }

  public static void main(String[] args) {
    int a[] = {1, 3, 4, 2, 7, 5, 8, 6};
    int n = a.length;
    System.out.println("Median: " + findMedian(a, n));
    System.out.println("Mean: " + findMean(a, n));
  }
}

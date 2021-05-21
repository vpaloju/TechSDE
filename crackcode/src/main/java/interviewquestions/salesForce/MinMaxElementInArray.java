package interviewquestions.salesForce;

public class MinMaxElementInArray {

  static class MinMaxPair {
    static int min;
    static int max;
  }

  static MinMaxPair getMinMax(int[] a, int n) {
    MinMaxPair minMax = new MinMaxPair();
    int i;
    if (n == 1) {
      minMax.min = a[0];
      minMax.max = a[0];
      return minMax;
    }
    if (a[0] > a[1]) {
      minMax.max = a[0];
      minMax.min = a[1];
    } else {
      minMax.max = a[1];
      minMax.min = a[0];
    }
    for (i = 2; i < a.length; i++) {
      if (a[i] > minMax.max) {
        minMax.max = a[i];
      } else if (a[i] < minMax.min) {
        minMax.min = a[i];
      }
    }
    return minMax;
  }

  public static void minMax(int[] a) {
    int min = a[0], max = a[0];
    for (int i = 1; i < a.length; i++) {
      if (a[i] < min) {
        min = a[i];
      }
      if (a[i] > max) {
        max = a[i];
      }
    }
    System.out.println("Minimum Value is: " + min);
    System.out.println("Maximum Value is: " + max);
  }

  public static void main(String[] args) {
    minMax(new int[]{1, 2, 5, 6, 7, 3, 4, 9, 10, 8});
    int arr[] = {1000, 11, 445, 1, 330, 3000};
    int arr_size = 6;
    MinMaxPair minmax = getMinMax(arr, arr_size);
    System.out.printf("\nMinimum element is %d", minmax.min);
    System.out.printf("\nMaximum element is %d", minmax.max);
  }
}

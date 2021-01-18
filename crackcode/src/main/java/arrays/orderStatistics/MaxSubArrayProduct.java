package arrays.orderStatistics;

public class MaxSubArrayProduct {

  public static void main(String[] args) {
    int[] a = new int[]{1, -2, -3, 0, 7, -8, -2};
    System.out.println("Maximum Sub array product is "
      + maxProduct(a));
  }

  public static int maxProduct(int[] a) {
    int result = a[0];
    for (int i = 0; i < a.length; i++) {
      int mul = a[i];
      for (int j = i + 1; j < a.length; j++) {
        result = Math.max(result, mul);
        mul *= a[j];
      }
      result = Math.max(result, mul);
    }
    return result;
  }
}

package arrays.arrayRotations;

/**
 * Maximum sum of i*arr[i] among all rotations of a given array
 * Find maximum value of Sum( i*arr[i]) with only rotations on given array allowed
 * Given an array, only rotation operation is allowed on array. We can rotate the array as many times as we want. Return the maximum possbile of summation of i*arr[i].
 * Input: arr[] = {1, 20, 2, 10}
 * Output: 72
 * We can 72 by rotating array twice.
 * {2, 10, 1, 20}
 * 20*3 + 1*2 + 10*1 + 2*0 = 72
 * <p>
 * Input: arr[] = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
 * Output: 330
 * We can 330 by rotating array 9 times.
 * {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
 * 0*1 + 1*2 + 2*3 ... 9*10 = 330
 * **************************************************************
 * <p>
 * Let us calculate initial value of i*arr[i] with no rotation
 * R0 = 0*arr[0] + 1*arr[1] +...+ (n-1)*arr[n-1]
 * <p>
 * After 1 rotation arr[n-1], becomes first element of array,
 * arr[0] becomes second element, arr[1] becomes third element
 * and so on.
 * R1 = 0*arr[n-1] + 1*arr[0] +...+ (n-1)*arr[n-2]
 * <p>
 * R1 - R0 = arr[0] + arr[1] + ... + arr[n-2] - (n-1)*arr[n-1]
 * <p>
 * After 2 rotations arr[n-2], becomes first element of array,
 * arr[n-1] becomes second element, arr[0] becomes third element
 * and so on.
 * R2 = 0*arr[n-2] + 1*arr[n-1] +...+ (n-1)*arr[n-3]
 * <p>
 * R2 - R1 = arr[0] + arr[1] + ... + arr[n-3] - (n-1)*arr[n-2] + arr[n-1]
 * <p>
 * If we take a closer look at above values, we can observe
 * below pattern
 * <p>
 * Rj - Rj-1 = arrSum - n * arr[n-j]
 * <p>
 * Where arrSum is sum of all array elements, i.e.,
 * <p>
 * arrSum = ∑ arr[i]
 * 0<=i<=n-1
 */
public class MaximumValueSum {

  public static int maxSum(int[] a) {
    int arrSum = 0, currentValue = 0, n = a.length;
    for (int i = 0; i < n; i++) {
      arrSum += a[i];
      currentValue += i * a[i];
    }
    int maxValue = currentValue;
    for (int j = 1; j < n; j++) {
      currentValue += arrSum - n * a[n - j];
      if (currentValue > maxValue) {
        maxValue = currentValue;
      }
    }
    return maxValue;
  }

  public static void main(String[] args) {
    int[] a = new int[]{10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    System.out.println(maxSum(a));
  }
}

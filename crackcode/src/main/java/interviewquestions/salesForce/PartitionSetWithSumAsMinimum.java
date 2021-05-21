package interviewquestions.salesForce;

public class PartitionSetWithSumAsMinimum {

  public static int findMinRec(int[] a, int i, int sumCalcualted, int sumTotal) {
    // If we have reached last element. Sum of one subset is sumCalculated, sum of other subset is sumTotal- sumCalculated.  Return absolute difference of two sums.
    if (i == 0) {
      return Math.abs((sumTotal - sumCalcualted) - sumCalcualted);
    }
    //For every item arr[i], we have two choices
    // (1) We do not include it first set
    // (2) We include it in first set
    // We return minimum of two choices
    return Math.min(findMinRec(a, i - 1, sumCalcualted + a[i - 1], sumTotal), findMinRec(a, i - 1, sumCalcualted, sumTotal));
  }

  public static int findMin(int[] a, int n) {
    int sumTotal = 0;
    for (int i : a) {
      sumTotal += i;
    }
    return findMinRec(a, n, 0, sumTotal);
  }

  public static void main(String[] args) {
    int[] a = new int[]{3, 1, 4, 2, 2, 1};
    int n = a.length;
    System.out.print("The minimum difference" +
      " between two sets is " +
      findMin(a, n));
  }
}

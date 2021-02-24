package interviewquestions.salesForce;

import java.util.Arrays;

public class FindPairsInArrayWithGivenSurm {

  public static boolean arrayHasPairs(int[] a, int sum) {
    int l = 0, r = a.length - 1;
    Arrays.sort(a);
    while (l < r) {
      if (a[l] + a[r] == sum) {
        System.out.println("Pairs Are: " + a[l] + " & " + a[r]);
        return true;
      } else if (a[l] + a[r] > sum) {
        r--;
      } else {
        l++;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int A[] = {1, 4, 45, 6, 10, -8};
    int n = 16;
    if (arrayHasPairs(A, n)) {
      System.out.println("Array has two "
        + "elements with given sum");
    } else {
      System.out.println("Array doesn't have "
        + "two elements with given sum");
    }
  }
}

package interviewquestions.serviceNow;

import java.util.Arrays;

public class MergeArrays {

  public static void sortedMerge(int[] a, int[] b, int[] res) {
    int m = a.length, n = b.length;
    int k = 0;
    for (int i = 0; i < m; i++) {
      res[k++] = a[i];
    }
    for (int i = 0; i < n; i++) {
      res[k++] = b[i];
    }
    Arrays.sort(res);
  }

  public static void main(String[] args) {
    int a[] = {10, 5, 15};
    int b[] = {20, 3, 2, 12};
    int[] res = new int[a.length + b.length];
    sortedMerge(a, b, res);
    System.out.print(Arrays.toString(res));
  }

}

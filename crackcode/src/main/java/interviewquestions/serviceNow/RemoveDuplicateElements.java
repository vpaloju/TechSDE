package interviewquestions.serviceNow;

public class RemoveDuplicateElements {

  public static int removeDuplicates(int[] a) {
    int n = a.length - 1;
    if (n == 0 || n == 1) {
      return n;
    }
    int j = 0;
    for (int i = 0; i < n; i++) {
      if (a[i] != a[i + 1]) {
        a[j++] = a[i];
      }
    }
    a[j++] = a[n - 1];
    return j;
  }

  public static void main(String[] args) {
    int a[] = new int[]{1, 2, 2, 3, 4, 4, 4, 5, 5};
    int n = removeDuplicates(a);
    for (int i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }
  }
}

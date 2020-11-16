package arrays.arrayRotations;

public class MultipleRightRotationsOfArray {

  public static void multipleRightRotations(int[] a, int k) {
    int n = a.length;
    for (int i = n - k; i <= (n-k)+(n-1); i++) {
      System.out.print(a[i % n] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6,7,8,9,10};
    int n = arr.length;

    int k = 2;
    multipleRightRotations(arr, k);
    System.out.println();

    k = 3;
    multipleRightRotations(arr, k);
    System.out.println();

    k = 4;
    multipleRightRotations(arr, k);
    System.out.println();

    k = 5;
    multipleRightRotations(arr, k);
    System.out.println();
  }
}

package arrays.arrayRotations;

/**
 * Quickly find multiple left rotations of an array
 *
 * Input : arr[] = {1, 3, 5, 7, 9}
 *         k1 = 1 a[1%4] - a[1], a[2%4] - a[2], a[3%4] - a[3], a[4%4] - a[0]
 *         k2 = 3 a[3%4] - a[3], a[4%4] - a[0], a[5%4] - a[1], a[6%4] - a[2]
 *         k3 = 4
 *         k4 = 6
 * Output : 3 5 7 9 1
 *          7 9 1 3 5
 *          9 1 3 5 7
 *          3 5 7 9 1
 *
 * Input : arr[] = {1, 3, 5, 7, 9}
 *         k1 = 14
 * Output : 9 1 3 5 7
 */
public class MultipleLeftRotationsOfArray {

  public static void multipleLefttRotations(int[] a, int n, int k) {
    //Print array after 'k' left rotations
    for (int i = k; i < k + n; i++) {
      System.out.print(a[i % n]+ " ");
    }
  }

  public static void multipleLefttRotations(int[] a, int k){
    int n = a.length;
    int mod = n%k;
    for(int i=0;i<n;i++){
      System.out.print(a[(i+mod)%n]+" ");
    }
  }

  public static void main(String[] args) {
    int arr[] = {1, 3, 5, 7, 9};
    int n = arr.length;

    int k = 2;
    multipleLefttRotations(arr, n, k);
    System.out.println();

    k = 3;
    multipleLefttRotations(arr, n, k);
    System.out.println();

    k = 4;
    multipleLefttRotations(arr, n, k);
    System.out.println();
  }
}

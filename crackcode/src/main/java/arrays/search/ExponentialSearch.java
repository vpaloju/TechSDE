package arrays.search;

import java.util.Arrays;

public class ExponentialSearch {

    public static int exponentialSearch(int[] a, int x) {
        int n = a.length;
        if (x == a[0]) {
            return 0;
        }
        int i = 1;
        // Find range for binary search by repeated doubling
        while (i < n && a[i] <= x) {
            i = i * 2;
        }
        return Arrays.binarySearch(a, i / 2, Math.min(i, n), x);
    }

    public static void main(String[] args) {
        System.out.println(exponentialSearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5));
    }
}

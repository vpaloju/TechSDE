package interviewquestions.amazon;

import arrays.sorting.HeapSort;

import java.util.Arrays;

public class MaxProductSubArray {

    /**
     * A simple solution is to check for every triplet using three nested loops. Below is its implementation –
     *
     * @param a
     * @return
     */
    public int maxProductTriplets(int[] a) {
        if (a.length < 3) {
            return -1;
        }
        int max_product = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    max_product = Math.max(max_product, a[i] * a[j] * a[k]);
                }
            }
        }
        return max_product;
    }

    /**
     * O(nlogn) Time, O(1) Space
     * 1.	Sort the array using some efficient in-place sorting algorithm in ascending order.
     * 2.	Return the maximum of product of last three elements of the array and product of first two elements and last element.
     */

    public static int maxProduct(int[] a) {
        if (a.length < 3) {
            return -1;
        }
        HeapSort.heapSort(a);
        return ((a[0] * a[1] * a[a.length - 1]) > (a[a.length - 3] * a[a.length - 2] * a[a.length - 1])) ? a[0] * a[1] * a[a.length - 1] : a[a.length - 3] * a[a.length - 2] * a[a.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{7, 1, 3, 2, 4, 5, 6, -10, -20, -1, -40}));
    }
}

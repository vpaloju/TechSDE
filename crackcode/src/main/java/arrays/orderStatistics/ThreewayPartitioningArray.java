package arrays.orderStatistics;

/**
 * Three way partitioning of an array around a given range
 * Difficulty Level : Medium
 * Last Updated : 01 Aug, 2019
 * Given an array and a range [lowVal, highVal], partition the array around the range such that array is divided in three parts.
 * 1) All elements smaller than lowVal come first.
 * 2) All elements in range lowVal to highVVal come next.
 * 3) All elements greater than highVVal appear in the end.
 * The individual elements of three sets can appear in any order.
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32}
 * lowVal = 14, highVal = 20
 * Output: arr[] = {1, 5, 4, 2, 1, 3, 14, 20, 20, 98, 87, 32, 54}
 * <p>
 * Input: arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32}
 * lowVal = 20, highVal = 20
 * Output: arr[] = {1, 14, 5, 4, 2, 1, 3, 20, 20, 98, 87, 32, 54}
 */
public class ThreewayPartitioningArray {

    public static void threeWayPartition(int[] a, int loweValue, int upperValue) {
        int n = a.length;
        int start = 0, end = n - 1;
        for (int i = 0; i <= end; ) {
            if (a[i] < loweValue) {
                int temp = a[start];
                a[start] = a[i];
                a[i] = temp;
                start++;
                i++;
            } else if (a[i] > upperValue) {
                int temp = a[end];
                a[end] = a[i];
                a[i] = temp;
                end--;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
        threeWayPartition(arr, 10, 20);
        System.out.println("Modified array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}

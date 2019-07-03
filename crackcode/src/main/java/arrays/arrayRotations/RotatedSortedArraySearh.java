package arrays.arrayRotations;

import arrays.search.BinarySearch;

public class RotatedSortedArraySearh {

    /**
     * @param array
     * @param low
     * @param high
     * @return
     */
    public static int findPivot(int[] array, int low, int high) {

        if (high < low) {
            return -1;
        }
        if (high == low) {
            return low;
        }

        int mid = (low + high) / 2;
        if (mid > low && array[mid] < array[mid - 1]) {
            return mid - 1;
        }

        if (array[low] >= array[mid]) {
            return findPivot(array, low, mid - 1);
        }

        return findPivot(array, mid + 1, high);
    }

    public static int pivotedBinarySearch(int array[], int n, int key) {
        int pivot = findPivot(array, 0, n - 1);

        // If we didn't find a pivot,
        // then arrayay is not rotated at all
        if (pivot == -1)
            return BinarySearch.binarySearch(array, 0, n - 1, key);

        // If we found a pivot, then first compare with pivot
        // and then LinearSearch in two subarrays around pivot
        if (array[pivot] == key)
            return pivot;

        if (array[0] <= key)
            return BinarySearch.binarySearch(array, 0, pivot - 1, key);

        return BinarySearch.binarySearch(array, pivot + 1, n - 1, key);
    }
}

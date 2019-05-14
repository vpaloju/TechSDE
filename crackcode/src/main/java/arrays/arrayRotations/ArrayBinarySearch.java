package arrays.arrayRotations;

public class ArrayBinarySearch {

    /**
     * O(log n) time
     *
     * @param array
     * @param low
     * @param high
     * @param elementToBeSearch
     * @return
     */
    public static int binarySearch(int[] array, int low, int high, int elementToBeSearch) {
        if (high < low) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (elementToBeSearch == array[mid]) {
            return mid;
        }
        if (elementToBeSearch > array[mid]) {
            return binarySearch(array, mid + 1, high, elementToBeSearch);
        }
        return binarySearch(array, low, mid - 1, elementToBeSearch);
    }
}

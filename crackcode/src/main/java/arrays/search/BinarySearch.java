package arrays.search;

public class BinarySearch {

    public static int binarySearch(int[] array, int elementToBeSearch) {
        int left = 0, right = array.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (elementToBeSearch == array[mid]) {
                return mid;
            }
            if (elementToBeSearch > array[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int l, int r, int x) {
        if (l == r) {
            if (x == array[l]) {
                return l;
            } else {
                return -1;
            }
        }
        if (r < l) {
            return -1;
        }
        int mid = (l + r) / 2;
        if (x == array[mid]) {
            return mid;
        }
        if (x < array[mid]) {
            return binarySearch(array, l, mid - 1, x);
        } else {
            return binarySearch(array, mid + 1, r, x);
        }
    }

    public static boolean binarySearchRoatedArray(int[] array, int element,
                                                  int start, int end) {
        if (start >= end) {
            if (array[end] == element)
                return true;
            else
                return false;
        }

        int mid = (start + end) / 2;
        if (array[start] < array[end]) {
            return search(array, element, start, end);
        }
        return binarySearchRoatedArray(array, element, start, mid)
                || binarySearchRoatedArray(array, element, mid + 1, end);
    }

    public static boolean search(int[] array, int element, int start, int end) {
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (array[mid] == element)
                return true;
            if (array[mid] < element) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(a, 10));
        System.out.println(binarySearch(a, 0, a.length - 1, 100));
    }
}

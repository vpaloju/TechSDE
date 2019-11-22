package arrays;

public class FindKthLargestNumber {

    public static int findKThLargest(int[] a, int k) {
        if (k < 0 || k > a.length) {
            return -1;
        }
        return findKThLargest(a, 0, a.length - 1, k);
    }

    public static int findKThLargest(int[] a, int start, int end, int k) {
        int pivot = start;
        int left = start;
        int right = end;
        while (left < right) {
            while (left <= right && a[left] <= a[pivot])
                left++;
            while (left <= right && a[right] >= a[pivot])
                --right;
            if (left < right) {
                swap(a, left, right);
            }
        }
        swap(a, pivot, right);
        if (k == right + 1) {
            return a[right];
        } else if (k > right + 1) {
            return findKThLargest(a, right + 1, end, k);
        } else {
            return findKThLargest(a, start, right - 1, k);
        }
    }

    public static void swap(int[] num, int a, int b) {
        int temp = num[a];
        num[a] = num[b];
        num[b] = temp;
    }
}

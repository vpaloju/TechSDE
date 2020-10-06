package arrays.search;

public class InterpolationSearch {

    public static int interpolationSearch(int[] a, int x) {
        int low = 0, high = a.length-1;
        while (low <= high && x >= a[low] && x <= a[high]) {
            if (low == high) {
                if (x == a[low]) {
                    return low;
                }
                return -1;
            }
            int pos = low + ((high - low)) / (a[high] - a[low]) * (x - a[low]);
            if (x == a[pos]) {
                return pos;
            }
            if (x > a[pos]) {
                low = pos + 1;
            } else {
                high = pos - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(interpolationSearch(a, 5));
    }
}

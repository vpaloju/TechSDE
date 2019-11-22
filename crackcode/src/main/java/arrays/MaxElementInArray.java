package arrays;

public class MaxElementInArray {

    public static int maxElement(int[] a) {
        if (a.length == 0) {
            return a[0];
        }
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}

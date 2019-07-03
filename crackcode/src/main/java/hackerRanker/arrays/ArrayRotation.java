package hackerRanker.arrays;

/**
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */
public class ArrayRotation {

    static int[] rotLeft(int[] a, int d) {
        int length = a.length;
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = a[i];
        }
        for (int i = 0; i < length - d; i++) {
            a[i] = a[i + d];
        }
        for (int i = 0; i < temp.length; i++) {
            a[i + (length - d)] = temp[i];
        }
        return a;
    }
}

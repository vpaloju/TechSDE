package hackerRanker.arrays;

/**
 * https://www.hackerrank.com/challenges/crush/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */

public class ArrayManipulation {

    static long arrayManipulation(int n, int[][] queries) {
        long[] updatedArray = new long[n];
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0] - 1;
            int b = queries[i][1] - 1;
            int k = queries[i][2];
            updatedArray[a] += k;
            if (b + 1 < n) {
                updatedArray[b + 1] -= k;
            }
        }
        long sum = 0, max = 0;
        for (int i = 0; i < n; i++) {
            sum += updatedArray[i];
            max = Math.max(max, sum);
        }
        return max;
    }

}

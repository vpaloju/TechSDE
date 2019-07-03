package hackerRanker.arrays;

/**
 * https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */
public class HourglassSum {

    static int hourglassSum(int[][] arr) {
        int sum = -1000;
        for (int i = 0; i < 4; i++) {
            for (int x = 0; x < 4; x++) {

                int top = arr[i][x] + arr[i][x + 1] + arr[i][x + 2];
                int middle = arr[i + 1][x + 1];
                int bottom = arr[i + 2][x] + arr[i + 2][x + 1] + arr[i + 2][x + 2];
                if (top + middle + bottom > sum) {
                    sum = top + middle + bottom;
                }
            }
        }
        return sum;
    }
}

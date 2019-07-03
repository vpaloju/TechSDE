package hackerRanker.arrays;

/**
 * https://www.hackerrank.com/challenges/minimum-swaps-2/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */
public class MinimumSwaps {

    static int minimumSwap(int[] arr) {
        int minSwap = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 != arr[i]) {
                int t = i;
                while (arr[t] != i + 1) {
                    t++;
                }
                int temp = arr[t];
                arr[t] = arr[i];
                arr[i] = temp;
                minSwap++;
            }
        }
        return minSwap;
    }

    public static void main(String[] args) {
        System.out.println(minimumSwap(new int[]{4, 3, 2, 1}));
    }
}

package hackerRanker.arrays;

/**
 * https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */

public class MinimumBribes {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int bribe = 0;
        boolean chaotic = false;
        for (int i = 0; i < q.length; i++) {
            if (q[i] - (i + 1) > 2) {
                chaotic = true;
                break;
            }
            for (int j = Math.max(0, q[i] - 2); j < i; j++)
                if (q[j] > q[i])
                    bribe++;
        }
        if (chaotic)
            System.out.println("Too chaotic");
        else
            System.out.println(bribe);
    }
}

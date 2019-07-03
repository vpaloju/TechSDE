package hackerRanker.warmupChallenges;

/**
 * https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class CountingValleys {

    static int countingValleys(int n, String s) {
        int numberOfSteps = 0, valleys = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'U') {
                numberOfSteps++;
                if (numberOfSteps == 0 && i != 0) {
                    valleys++;
                }
            } else {
                numberOfSteps--;
            }
        }
        return valleys;
    }
}

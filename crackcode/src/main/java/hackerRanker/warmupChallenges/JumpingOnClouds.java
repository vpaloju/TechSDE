package hackerRanker.warmupChallenges;

/**
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class JumpingOnClouds {

    static int jumpingOnClouds(int[] c) {
        int length = c.length, i = 0, jumps = 0;
        while (i < length - 3) {
            i += (c[i + 2]) == 0 ? 2 : 1;
            jumps++;
        }
        jumps++;
        return jumps;
    }

}

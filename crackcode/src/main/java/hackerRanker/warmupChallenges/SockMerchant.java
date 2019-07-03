package hackerRanker.warmupChallenges;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            if (map.get(ar[i]) == null) {
                map.put(ar[i], 1);
            } else {
                map.remove(ar[i]);
                count++;
            }
        }
        return count;
    }
}


package hackerRanker.warmupChallenges;

/**
 * https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class RepeatedString {

    static long repeatedString(String s, long n) {
        int count = 0, reminderCount = 0;
        int subStringLength = s.length();
        long charCount = n / subStringLength;
        long reminder = n % subStringLength;
        for (int i = 0; i < subStringLength; i++) {
            if (s.charAt(i) == 'a') {
                count++;
                if (i < reminder) {
                    reminderCount++;
                }

            }
        }
        return (charCount * count) + reminderCount;
    }

}

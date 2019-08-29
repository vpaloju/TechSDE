package hackerRanker.dictionariesAndHashmaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * https://www.hackerrank.com/challenges/two-strings/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
 */
public class TwoStrings {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        Set<Character> s1CharSet = new HashSet<Character>();
        Set<Character> s2CharSet = new HashSet<Character>();
        for (int i = 0; i <= s1.length(); i++) {
            s1CharSet.add(s1.charAt(i));
        }
        for (int i = 0; i <= s2.length(); i++) {
            s1CharSet.add(s2.charAt(i));
        }
        s1CharSet.retainAll(s2CharSet);
        if (!s1CharSet.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }

}

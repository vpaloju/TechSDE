package interviewquestions.salesForce;

public class MinimumDistanceBetweenWords {

    public static int minimumDistance(String str, String word1, String word2) {
        if (word1.equals(word2)) {
            return 0;
        }
        String[] words = str.split(" ");
        int n = words.length;
        //Conside length of words is min distance
        int minDistance = n + 1;
        int prev = 0, i = 0;
        for (i = 0; i < n; i++) {
            if (words[i].equals(word1) || words[i].equals(word2)) {
                prev = i;
                break;
            }
        }

        while (i < n) {
            if (words[i].equals(word1) || words[i].equals(word2)) {

                // If the current element matches with
                // any of the two then check if current
                // element and prev element are different
                // Also check if this value is smaller than
                // minimum distance so far
                if ((!words[prev].equals(words[i])) && (i - prev) < minDistance) {
                    minDistance = i - prev - 1;
                    prev = i;
                } else {
                    prev = i;
                }

            }
            i += 1;

        }
        return minDistance;
    }

    public static void main(String[] args) {
        String s = "geeks for geeks contribute practice";
        String w1 = "geeks";
        String w2 = "practice";
        System.out.println(minimumDistance(s, w1, w2));
    }
}

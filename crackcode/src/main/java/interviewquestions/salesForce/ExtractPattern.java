package interviewquestions.salesForce;

import java.util.HashMap;
import java.util.Map;

public class ExtractPattern {

    public static String enCodeString(String str) {
        Map<Character, Integer> map = new HashMap<>();
        String result = "";
        int i = 0;
        char ch;
        for (int j = 0; j < str.length(); j++) {
            ch = str.charAt(j);
            if (!map.containsKey(ch)) {
                map.put(ch, i++);
            }
            result += map.get(ch);
        }
        return result;
    }

    public static void findMatchedWords(String[] dict, String pattern) {
        int len = pattern.length();
        String hash = enCodeString(pattern);
        for (String word : dict) {
            if (word.length() == len && enCodeString(word).equals(hash)) {
                System.out.print(word + " ");
            }
        }
    }

    public static void main(String[] args) {
        String[] dict = {"abb", "abc", "xyz", "xyy"};
        String pattern = "foo";

        findMatchedWords(dict, pattern);
    }
}

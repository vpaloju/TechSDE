package interviewquestions.strings;

import java.util.LinkedHashSet;

public class RemoveDuplicatesInString {

    public static String removeDuplicatesInString(String str) {
        String a = str.toLowerCase();
        LinkedHashSet<Character> set = new LinkedHashSet<Character>();
        String res = "";
        for (int i = 0; i < a.length(); i++) {
            if (!set.contains(a.charAt(i))) {
                set.add(a.charAt(i));
                res += a.charAt(i);
            }
        }
        return res;
    }

    public static String removeDuplicates(String str) {
        byte[] bytes = new byte[256];
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            bytes[str.charAt(i)]++;
            if (bytes[str.charAt(i)] > 0 && bytes[str.charAt(i)] <= 1) {
                res += str.charAt(i);
            }
        }
        return res;
    }

    public static String removeDups(String s) {
        if (s.length() <= 1) return s;
        if (s.substring(0, s.length() - 1).contains(s.substring(s.length() - 1, s.length())))
            return removeDups(s.substring(0, s.length() - 1));
        else return removeDups(s.substring(0, s.length() - 1)) + s.substring(s.length() - 1, s.length());
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicatesInString("Google"));
    }
}

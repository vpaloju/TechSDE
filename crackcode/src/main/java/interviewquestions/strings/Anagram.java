package interviewquestions.strings;

import java.util.Arrays;

/**
 * An anagram of a string is another string that contains same characters, only the order of characters can be different. For example, “abcd” and “dabc” are anagram of each other.
 */
public class Anagram {

    public static boolean anagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] str1CharArray = str1.toCharArray();
        char[] str2CharArray = str2.toCharArray();
        Arrays.sort(str1CharArray);
        Arrays.sort(str2CharArray);
        for (int i = 0; i < str1CharArray.length; i++) {
            if (str1CharArray[i] != str2CharArray[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean areAnagram(char str1[], char str2[]) {
        // Create 2 count arrays and initialize all values as 0
        int count1[] = new int[str1.length];
        Arrays.fill(count1, 0);
        int count2[] = new int[str2.length];
        Arrays.fill(count2, 0);
        int i;
        if (str1.length != str2.length) {
            return false;
        }

        // For each character in input strings, increment count in the corresponding count array
        for (i = 0; i < str1.length; i++) {
            count1[str1[i]]++;
            count2[str2[i]]++;
        }

        // Compare count arrays
        for (i = 0; i < str1.length; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() == 0 || str2.length() == 0 || str1.length() != str2.length()) {
            return false;
        }
        byte[] map = new byte[256];
        for (char c : str1.toCharArray()) {
            map[c]++;
        }
        for (char c : str2.toCharArray()) {
            map[c]--;
            if (map[c] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(anagram("TRIANGLE", "INTEGRAL"));
        System.out.println(isAnagram("ATRIANGLE", "XINTEGRAL"));
    }
}

package dailyCodingProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, determine whether any permutation of it is a palindrome.
 * <p>
 * For example, "carrace" should return true, since it can be rearranged to form "racecar", which is a palindrome. daily should return false, since there's no rearrangement that can form a palindrome.
 * A set of characters can form a palindrome if at most one character occurs odd number of times and all characters occur even number of times.
 * <p>
 * A simple solution is to run two loops, the outer loop picks all characters one by one, the inner loop counts number of occurrences of the picked character. We keep track of odd counts. Time complexity of this solution is O(n2).
 * <p>
 * We can do it in O(n) time using a count array. Following are detailed steps.
 * 1) Create a count array of alphabet size which is typically 256. Initialize all values of count array as 0.
 * 2) Traverse the given string and increment count of every character.
 * 3) Traverse the count array and if the count array has more than one odd values, return false. Otherwise return true.
 */
public class IsStringCanFormPalindrome {
    static int NO_OF_CHARS = 256;

    public static boolean canFormPalindrome(String str) {
        if (str.length() <= 1) {
            return false;
        }
        int[] count = new int[NO_OF_CHARS];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        int odd = 0;
        for (int i = 0; i < NO_OF_CHARS; i++) {
            if ((count[i] & 1) == 1) {
                odd++;
            }
            if (odd > 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isFormPalindrome(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            } else {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
        }
        int odd = 0;
        for (Map.Entry entry : map.entrySet()) {
            if (((Integer) entry.getValue()).intValue() % 2 != 0) {
                odd++;
            }
            if (odd > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        if (canFormPalindrome("geeksforgeeks"))
            System.out.println("Yes");
        else
            System.out.println("No");

        if (canFormPalindrome("geeksogeeks"))
            System.out.println("Yes");
        else
            System.out.println("No");

        if (isFormPalindrome("geeksforgeeks"))
            System.out.println("Yes");
        else
            System.out.println("No");

        if (isFormPalindrome("geeksogeeks"))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

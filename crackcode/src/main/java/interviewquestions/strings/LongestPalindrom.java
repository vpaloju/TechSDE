package interviewquestions.strings;

public class LongestPalindrom {
    public static String longestPalindrom(String str) {
        char[] a = str.toCharArray();
        int longestStart = 0;
        int longestEnd = 0;
        for (int start = 0; start < a.length; start++) {
            for (int end = start + 1; end < a.length; end++) {
                if (isPalindrom(a, start, end - 1)) {
                    if (end - start > longestEnd - longestStart) {
                        longestEnd = end;
                        longestStart = start;
                    }
                }
            }
        }
        return str.substring(longestStart, longestEnd);
    }

    public static boolean isPalindrom(char[] str, int start, int end) {
        for (int i = start; i <= (start + end) / 2; i++) {
            if (str[i] == str[start + end - i])
                continue;
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrom("forgeeksskeegfor"));
    }

}

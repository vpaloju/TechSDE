package interviewquestions.strings;

import java.util.Arrays;

public class CountLowerUpperAndNumericChar {

    public static int[] count(String str) {
        int lowerCase = 0, upperCase = 0, numeric = 0, specialChars = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                lowerCase++;
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                upperCase++;
            } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                numeric++;
            } else {
                specialChars++;
            }
        }
        return new int[]{lowerCase, upperCase, numeric,specialChars};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(count("#GeeKs01fOr@gEEks07")));
    }
}

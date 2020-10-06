package interviewquestions.apple;

public class ReverseOvels {

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.

 Today is Thursday and tomorrow is Friday.
 o a i u a a o o o i i a

 Tadiy is Tho

 */

    public static void main(String[] args) {
        System.out.println(reverseOvels("Today is Thursday and tomorrow is Friday"));
    }

    public static String reverseOvels(String input) {
        String ovelsString = findeOvels(input.toLowerCase());
        int ovelsStringLength = ovelsString.length() - 1;
        for (int i = 0; i < input.length() - 1; i++) {
            if (isOvel(input.charAt(i))) {
                String res = input.replace(input.charAt(i), ovelsString.charAt(ovelsStringLength));
                ovelsStringLength--;
            }

        }
        return input;
    }

    public static String findeOvels(String input) {
        String res = "";
        for (int i = 0; i < input.length() - 1; i++) {
            char ch = input.charAt(i);
            if (isOvel(ch)) {
                res += ch;
            }
        }
        return res;
    }

    public static boolean isOvel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        } else {
            return false;
        }
    }
}

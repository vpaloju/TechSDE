package interviewquestions.strings;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExtractLowerCaseAndReverse {

    public static String extractLowerAndReverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
                sb.insert(0, str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(extractLowerAndReverse("Hello"));
        List l = new ArrayList<>();
    }
}

package interviewquestions.strings;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static char firstNonRepeatChar(String str) {
        String input = str.toLowerCase();
        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < input.length(); i++) {
            map.put(input.charAt(i), map.containsKey(input.charAt(i)) ? map.get(input.charAt(i)) + 1 : 1);
        }
        // since HashMap doesn't maintain order, going through string again. Otherwise use LinkedHashMap.
        for (int i=0;i<input.length();i++) {
            if(map.get(input.charAt(i))==1){
                return input.charAt(i);
            }
        }
        throw new RuntimeException("didn't find any non repeated Character");
    }

    public static char firstNonRepeatingChar(String str) {
        String input = str.toLowerCase();
        byte[] count = new byte[256];
        for (int i = 0; i < input.length(); i++) {
            count[input.charAt(i)]++;
        }
        for (int i = 0; i < input.length(); i++) {
            if (count[input.charAt(i)] == 1) {
                return input.charAt(i);
            }
        }
        throw new RuntimeException("didn't find any non repeated Character");
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatChar("Is it your first company"));
        System.out.println(firstNonRepeatingChar("Is it your first company"));
    }
}

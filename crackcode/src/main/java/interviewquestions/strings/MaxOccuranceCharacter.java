package interviewquestions.strings;

public class MaxOccuranceCharacter {
    static final int ASCII_SIZE = 256;

    public static char maxOccuranceChar(String str) {
        int[] count = new int[ASCII_SIZE];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        int max = -1;
        char result = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Max occurring character is " + maxOccuranceChar("sample string"));
        System.out.println("Max occurring character is " + maxOccuranceChar("welcome to oracle"));
    }
}

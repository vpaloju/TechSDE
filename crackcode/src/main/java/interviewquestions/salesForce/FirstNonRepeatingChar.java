package interviewquestions.salesForce;

public class FirstNonRepeatingChar {

    public static char firstNonRepeatingChar(String str) {
        int[] count = new int[256];
        char firstNonRepeatingChar = ' ';
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                firstNonRepeatingChar = str.charAt(i);
                break;
            }
        }
        return firstNonRepeatingChar;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("Salesforce is the best company to work for"));
    }
}

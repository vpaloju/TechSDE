package interviewquestions.strings;

public class RemoveAllOccurancesOfChar {

    public static String removeAllOccurances(String str, char c) {
        int j = 0, count = 0;
        char[] a = str.toCharArray();
        for (int i = j = 0; i < a.length; i++) {
            if (a[i] != c) {
                a[j++] = a[i];
            } else {
                count++;
            }
        }
        while (count > 0) {
            a[j++] = '\0';
            count--;
        }
        return new String(a);
    }

    public static void main(String[] args) {
        System.out.println(removeAllOccurances("geeksforgeeks", 'g'));
    }
}

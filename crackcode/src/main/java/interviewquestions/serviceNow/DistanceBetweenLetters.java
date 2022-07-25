package interviewquestions.serviceNow;

public class DistanceBetweenLetters {

    public static int getDistanceBetweenLetters(char first, char second) {
        if (!Character.isLetter(first)) {
            throw new IllegalArgumentException(first + " is not part of the alphabet");
        }
        if (!Character.isLetter(second)) {
            throw new IllegalArgumentException(first + " is not part of the alphabet");
        }
        return Character.toLowerCase(second) - Character.toLowerCase(first);
    }

    public static int getDistanceBetweenChars(String str, char first, char second) {
        int firstCharIndex = 0, secondCharIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == first && firstCharIndex<=0) {
                firstCharIndex = i;
            }
            if (str.charAt(i) == second) {
                secondCharIndex = i;
            }
        }
        return Math.abs(firstCharIndex - secondCharIndex);
    }

    public static void main(String[] args) {
        System.out.println(getDistanceBetweenLetters('A', 'Z'));
        System.out.println(getDistanceBetweenChars("Welcome", 'e', 'e'));
    }
}

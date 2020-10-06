package interviewquestions.strings;

public class VowelsAndConsonantsCount {

    public static void findNumberOfVowelAndConsonants(String str) {
        String input = str.toLowerCase().trim();
        int vowelsCount = 0, consonantsCount = 0;
        String vowels = "aeiou";
        char[] inputCharArray = input.toCharArray();
        for (char ch : inputCharArray) {
            if (vowels.indexOf(ch) != -1) {
                vowelsCount++;
            } else if (ch != ' ') {
                consonantsCount++;
            }
        }
        System.out.println("There are " + vowelsCount + " vowels in " + str);
        System.out.println("There are " + consonantsCount + " consonants in " + str);
    }

    public static void finNumberOfVowelsAndConsonantsWithASCII(String str) {
        int vowelsCount = 0, consonantsCount = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < str.length(); i++) {
            int asciiValue = str.charAt(i);
            if ((asciiValue >= 65 && asciiValue <= 90) || (asciiValue >= 97 && asciiValue <= 122)) {
                if (vowels.contains(Character.toString(str.charAt(i)))) {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }
        System.out.println("There are " + vowelsCount + " vowels in " + str);
        System.out.println("There are " + consonantsCount + " consonants in " + str);
    }

    public static void main(String[] args) {
        findNumberOfVowelAndConsonants("I am Happy");
        finNumberOfVowelsAndConsonantsWithASCII("I am Happy");
    }
}

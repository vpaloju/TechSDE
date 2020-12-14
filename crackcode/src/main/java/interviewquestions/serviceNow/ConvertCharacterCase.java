package interviewquestions.serviceNow;

public class ConvertCharacterCase {

  public static String convertUpperToLower(String str) {
    char[] charArray = str.toCharArray();
    for (int i = 0; i < charArray.length; i++) {
      if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
        charArray[i] = (char) ((int) charArray[i] + 32);
      }
    }
    return new String(charArray);
  }

  public static String convertLowerToUpper(String str) {
    char[] charArray = str.toCharArray();
    for (int i = 0; i < charArray.length; i++) {
      if (charArray[i] >= 'a' && charArray[i] <= 'z') {
        charArray[i] = (char) ((int) charArray[i] - 32);
      }
    }
    return new String(charArray);
  }

  public static void main(String[] args) {
    String str = "HELLO WORLD";
    String str1 = "welcome to java";
    System.out.println(convertUpperToLower(str));
    System.out.println(convertLowerToUpper(str1));
  }
}

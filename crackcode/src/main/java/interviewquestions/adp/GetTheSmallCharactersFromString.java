package interviewquestions.adp;

public class GetTheSmallCharactersFromString {

  public static String getSmallChars(String str) {
    int n = str.length() - 1, count = 0;
    char[] result = new char[n];
    char[] charArray = str.toCharArray();
    for (int i = 0; i < charArray.length; i++) {
      if (charArray[i] >= 97 && charArray[i] <= 122) {
        result[n - i] = charArray[i];
      }
    }
    return new String(result).replaceAll("\0", "");
  }

  public static void main(String[] args) {
    System.out.println(getSmallChars("Welcome To The World Of Java"));
  }

}

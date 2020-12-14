package interviewquestions.serviceNow;

public class SecondMaxOccuranceCharacter {
  public static char secondMaxOccuranceChar(String str) {
    int ASCII_SIZE = 256;
    int[] map = new int[ASCII_SIZE];
    char[] charArray = str.toCharArray();
    int max = 0, secondMax = 0;
    char maxChar = '\n', secondMaxChar = '\n';
    for (int i = 0; i < charArray.length; i++) {
      map[charArray[i]]++;
    }
    for (int i = 0; i < ASCII_SIZE; i++) {
      if (map[i] > max) {
        secondMaxChar = maxChar;
        max = map[i];
        maxChar = (char) i;
      } else if (map[i] > secondMax) {
        secondMax = map[i];
        secondMaxChar = (char) i;
      }
    }
    return secondMaxChar;
  }

  public static void main(String[] args) {
    System.out.println(secondMaxOccuranceChar("servicenowproductdevelopment"));
  }

}

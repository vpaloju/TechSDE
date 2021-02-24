package interviewquestions.salesForce;

public class FirstNonRepeatingCharacter {

  public static char firstNonRepeatingChar(String str) {
    int[] map = new int[256];
    char[] charArray = str.toLowerCase().toCharArray();
    for (int i = 0; i < charArray.length; i++) {
      map[charArray[i]]++;
    }
    for (int i = 0; i < charArray.length; i++) {
      if (map[charArray[i]] == 1) {
        return charArray[i];
      }
    }
    return '\n';
  }

  public static void main(String[] args) {
    System.out.println(firstNonRepeatingChar("Salesforce is the best company to work for"));
  }
}

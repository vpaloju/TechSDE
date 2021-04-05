package interviewquestions.serviceNow;

import java.util.HashMap;
import java.util.Map;

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

  public static char secondMaxOccurance(String str) {
    Map<Character, Integer> map = new HashMap<>();
    int max = 0;
    int secondMax = 0;
    char secondMaxChar = '\n';
    for (int i = 0; i < str.length(); i++) {
      if (!map.containsKey(str.charAt(i))) {
        map.put(str.charAt(i), 1);
      } else {
        map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
      }
    }

    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      if (entry.getValue() > max) {
        secondMax = max;
        max = entry.getValue();
      } else if (entry.getValue() > secondMax) {
        secondMax = entry.getValue();
        secondMaxChar = entry.getKey();
      }
    }

    return secondMaxChar;
  }

  public static void main(String[] args) {
    System.out.println(secondMaxOccuranceChar("servicenowproductdevelopment"));
    System.out.println(secondMaxOccurance("servicenowproductdevelopment"));
  }

}

package interviewquestions.strings;

public class PermutationsOfString {

  public static void permute(String str, int start, int end) {
    if (start == end) {
      System.out.println(str);
    } else {
      for (int i = start; i <= end; i++) {
        str = swap(str, start, i);
        permute(str, start + 1, end);
        str = swap(str, start, i);
      }
    }
  }

  public static String swap(String str, int i, int j) {
    char[] charArray = str.toCharArray();
    char temp = charArray[i];
    charArray[i] = charArray[j];
    charArray[j] = temp;
    return String.valueOf(charArray);
  }

  public static void permutations(String input, String result) {
    if (input.length() == 0) {
      System.out.println(result + "");
      return;
    }
    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);
      String subString = input.substring(0, i) + input.substring(i + 1);
      permutations(subString, result + ch);
    }
  }

  public static void main(String[] args) {
    permute("abc", 0, 2);
    permutations("abc", "");
  }
}



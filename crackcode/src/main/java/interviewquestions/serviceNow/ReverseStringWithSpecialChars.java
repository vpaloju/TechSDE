package interviewquestions.serviceNow;

/**
 * String consists of $ and @ you need to reverse the string only characters but not special characters ($/@)
 * The following input when ever $/@ presents Just move on without reverse.
 * Input: “S$RVIC$N@W” Output : “W$NCIV$R@S”
 */
public class ReverseStringWithSpecialChars {

  public static String reverseString(String str) {
    char[] charArray = str.toCharArray();
    for (int start = 0, end = str.length() - 1; start < end; start++, end--) {
      if (!(((charArray[start] == '$') || (charArray[start] == '@')) && ((charArray[end] == '$') || (charArray[end] == '@')))) {
        charArray[start] ^= charArray[end];
        charArray[end] ^= charArray[start];
        charArray[start] ^= charArray[end];
      }
      if (((charArray[start] == '$') || (charArray[start] == '@'))) {
        start++;
      }
      if (((charArray[end] == '$') || (charArray[end] == '@'))) {
        end--;
      }
    }
    return new String(charArray);
  }

  public static void main(String[] args) {
    System.out.println(reverseString("S$RVIC$N@W"));
  }
}

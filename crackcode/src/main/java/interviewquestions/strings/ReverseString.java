package interviewquestions.strings;

import java.util.Stack;

public class ReverseString {

  public static String reverseString(String str) {
    char[] charArray = str.toCharArray();
    int start = 0, end = charArray.length - 1;
    while (start < end) {
      charArray[start] ^= charArray[end];
      charArray[end] ^= charArray[start];
      charArray[start] ^= charArray[end];
      start++;
      end--;
    }
    return new String(charArray);
  }

  public static String reverseUsingStack(String str) {
    Stack<Character> stack = new Stack<>();
    char[] charArray = str.toCharArray();
    for (int i = 0; i < charArray.length; i++) {
      stack.push(charArray[i]);
    }
    for (int i = 0; i < charArray.length; i++) {
      charArray[i] = stack.peek();
      stack.pop();
    }
    return new String(charArray);
  }

  public static void main(String[] args) {
    System.out.println(reverseUsingStack("abcdefg"));
    System.out.println(reverseString("abcdefg"));
  }
}

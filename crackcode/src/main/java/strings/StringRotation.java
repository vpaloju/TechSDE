package strings;

public class StringRotation {

  public static String leftRotate(String str, int numberOfCharsToRotate) {
    int n = str.length();
    String res = reverse(str, 0, numberOfCharsToRotate - 1);
    res = reverse(res, numberOfCharsToRotate, n - 1);
    return reverse(res, 0, n - 1);
  }

  public static String rightRotate(String str, int numberOfCharsToRotate) {
    int n = str.length();
    return leftRotate(str, n - numberOfCharsToRotate);
  }

  public static String reverse(String str, int start, int end) {
    char[] charArray = str.toCharArray();
    while (start < end) {
      char temp = charArray[start];
      charArray[start] = charArray[end];
      charArray[end] = temp;
      start++;
      end--;
    }
    return new String(charArray);
  }

  public static void main(String[] args) {
    String str = "GeeksforGeeks";
    System.out.println("Left Rotation is: " + leftRotate(str, 2));
    System.out.println("Right Rotation is: " + rightRotate(str, 2));
  }
}

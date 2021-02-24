package interviewquestions.salesForce;

/**
 * Given a string of size n, write functions to perform the following operations on a string-
 * <p>
 * Left (Or anticlockwise) rotate the given string by d elements (where d <= n)
 * Right (Or clockwise) rotate the given string by d elements (where d <= n).
 * Examples:
 * <p>
 * Input : s = "GeeksforGeeks"
 * d = 2
 * Output : Left Rotation  : "eksforGeeksGe"
 * Right Rotation : "ksGeeksforGee"
 * <p>
 * <p>
 * Input : s = "qwertyu"
 * d = 2
 * Output : Left rotation : "ertyuqw"
 * Right rotation : "yuqwert"
 */
public class StringRotations {

  public static String leftRotate(String str, int d) {
    String result = str.substring(d) + str.substring(0, d);
    return result;
  }

  public static String rightRotate(String str, int d) {
    String result = leftRotate(str, str.length() - d);
    return result;
  }

  public static void main(String[] args) {
    String str1 = "GeeksforGeeks";
    System.out.println(leftRotate(str1, 2));//eksforGeeksGe
    String str2 = "GeeksforGeeks";
    System.out.println(rightRotate(str2, 2));//ksGeeksforGee
  }
}

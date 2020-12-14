package interviewquestions.serviceNow;

public class InsertCharBetweenSmallerAndUpper {

  public static String updateStringByAdding_(String str) {
    StringBuffer sb = new StringBuffer();
    sb.append(str.charAt(0));
    for (int i = 1; i < str.length(); i++) {
      if (Character.isUpperCase(str.charAt(i))) {
        sb.append("_");
        sb.append(str.charAt(i));
      } else {
        sb.append(str.charAt(i));
      }
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    System.out.print(updateStringByAdding_("WelcomeT To The World Of Java"));
  }
}

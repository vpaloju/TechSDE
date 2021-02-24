package interviewquestions.salesForce;

public class ReplaceSpacesWithString {

  public static String replaceSpaces(String str, String x) {
    return str.replace(" ", x);
  }

  public static void main(String[] args) {
    System.out.println(replaceSpaces("i am chandu", "ABC"));
  }
}

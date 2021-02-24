package interviewquestions.salesForce;

public class CountContinuousChars {

  public static String countContinuousChars(String str) {
    int[] map = new int[256];
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      map[str.charAt(i)]++;
    }
    for (int i = 0; i < str.length(); ) {
      sb.append(str.charAt(i));
      sb.append(map[str.charAt(i)]);
      i += map[str.charAt(i)];
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    System.out.println(countContinuousChars("aaabbdcccccf"));
  }
}

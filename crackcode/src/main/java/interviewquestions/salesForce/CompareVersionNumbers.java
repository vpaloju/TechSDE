package interviewquestions.salesForce;

/**
 * Compare two Version numbers
 * A version number is a string that is used to identify unique states of a software product. A version number looks like a.b.c.d where a, b, etc are number, so the version number is a string in which numbers are separated by dots. These numbers generally represent hierarchy from major to minor (a is major and d is minor).
 * In this problem we are given two version numbers, we need to compare them and conclude which one is the latest version number (that is which version number is smaller).
 * Example:
 * Input:
 * V1 = “1.0.31”
 * V2 = “1.0.27”
 * Output:  v2 is latest
 * Because V2 < V1
 * <p>
 * Input:
 * V1 = “1.0.10”
 * V2 = “1.0.27”
 * Output:  v1 is latest
 * Because V1 < V2
 */
public class CompareVersionNumbers {

  public static int versionCompare(String v1, String v2) {
    //vnum stores each numeric part of version.
    int vnum1 = 0, vnum2 = 0;
    for (int i = 0, j = 0; (i < v1.length() || j < v2.length()); ) {
      while (i < v1.length() && v1.charAt(i) != '.') {
        vnum1 = vnum1 * 10 + (v1.charAt(i) - '0');
        i++;
      }
      while (j < v2.length() && v2.charAt(i) != '.') {
        vnum2 = vnum2 * 10 + (v2.charAt(j) - '0');
        j++;
      }
      if (vnum1 > vnum2) {
        return 1;
      }
      if (vnum2 > vnum1) {
        return -1;
      }
      //If equal reset variables and go for next numeric value.
      vnum1 = vnum2 = 0;
      i++;
      j++;
    }
    return 0;
  }

  public static int compareversions(String version1, String version2) {
    int compareResult = 0;
    String[] version1Numbers = version1.split("\\.");
    String[] version2Numbers = version2.split("\\.");
    int maxVersionLength = Math.max(version1Numbers.length, version2Numbers.length);
    for (int i = 0; i < maxVersionLength; i++) {
      Integer v1 = i < version1Numbers.length ? Integer.parseInt(version1Numbers[i]) : 0;
      Integer v2 = i < version2Numbers.length ? Integer.parseInt(version2Numbers[i]) : 0;
      int compare = v1.compareTo(v2);
      if (compare != 0) {
        compareResult = compare;
        break;
      }
    }
    return compareResult;
  }

  public static void main(String[] args) {
    String version1 = "1.0.31";
    String version2 = "1.0.27";

    if (versionCompare(version1, version2) < 0)
      System.out.println(version1 + " is Latest");
    else if (versionCompare(version1, version2) > 0)
      System.out.println(version2 + " is Latest");
    else
      System.out.println("Both version are equal");

    if (compareversions(version1, version2) < 0)
      System.out.println(version1 + " is Latest");
    else if (compareversions(version1, version2) > 0)
      System.out.println(version2 + " is Latest");
    else
      System.out.println("Both version are equal");
  }
}

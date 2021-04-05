package interviewquestions.serviceNow;

public class IntersectionOfArrays {

  public static void interSectionOfArrays(int[] a, int[] b) {

  }


  public static void main(String[] args) {
    int[] a = new int[]{1, 2, 2, 1};
    int[] b = new int[]{2, 2};
    interSectionOfArrays(a, b);
    String s = "ey9hdGcvdXNlcnByb2ZpbGluZy9TaG9wcGVyQ29udGV4dExvYWRhYmxlU2VydmljZT17aXNFeHRlcm5hbENvbnRleHQ9ZmFsc2V9fQ==.8dKvHqX31tibw5Rgji52Z5V0njkIaoa0IBm1lRbTLWM=";
    s= s.substring(s.indexOf("=") + 1, s.length());
    System.out.println(s);
  }
}

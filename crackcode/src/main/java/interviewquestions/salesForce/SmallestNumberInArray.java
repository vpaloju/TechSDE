package interviewquestions.salesForce;

public class SmallestNumberInArray {

  public static int smallestNumber(int[] a) {
    int result = a[0];
    for (int x : a) {
      if (x < result) {
        result = x;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(smallestNumber(new int[]{1, 10, -5, 10, -199}));
  }
}

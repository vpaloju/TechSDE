package interviewquestions.serviceNow;

/**
 * Given a sorted Rotated array need to find out how many rotations done in that array.
 */
public class FindRotationsInArray {

  public static int findRotations(int[] a) {
    /*int start = 0, end = a.length - 1, count = 0;
    while (start < end) {
      if (a[start] > a[end]) {
        count++;
      }
      start++;
      end--;
    }
    return count;*/
    int count = 0;
    for (int start = 0, end = a.length - 1; start < end; start++, end--) {
      if (a[start] > a[end]) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int[] a = new int[]{4, 5, 6, 1, 2, 3};
    System.out.println(findRotations(a));
  }

}

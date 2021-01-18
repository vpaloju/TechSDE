package interviewquestions.salesForce;

public class MinMaxElementInArray {

  public static void minMax(int[] a) {
    int min = a[0], max = a[0];
    for (int i = 1; i < a.length; i++) {
      if (a[i] < min) {
        min = a[i];
      }
      if (a[i] > max) {
        max = a[i];
      }
    }
    System.out.println("Minimum Value is: " + min);
    System.out.println("Maximum Value is: " + max);
  }

  public static void main(String[] args) {
    minMax(new int[]{1, 2, 5, 6, 7, 3, 4, 9, 10, 8});
  }
}

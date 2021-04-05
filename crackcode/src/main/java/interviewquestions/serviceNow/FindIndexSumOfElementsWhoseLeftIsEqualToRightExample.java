package interviewquestions.serviceNow;

public class FindIndexSumOfElementsWhoseLeftIsEqualToRightExample {

  public static int findIndex(int[] a) {
    int leftSum = 0, rightSum = 0, start = 0, end = a.length - 1;
    for (; start <= end; ) {
      if (leftSum > rightSum) {
        rightSum += a[end--];
      } else {
        leftSum += a[start++];
      }
    }
    if (leftSum == rightSum) {
      return end;
    } else {
      return -1;
    }
  }

  public static void main(String[] args) {
    int[] a = new int[]{2, 4, 4, 2, 6, 1, 1};
    int index = findIndex(a);
    System.out.println(index != -1 ? "sum of elements on left(i.e. from index 0 to " + index + ") = sum of elements on right(i.e. from index " + (index + 1) + " to " + (a.length - 1) + ")" : "No index found where  sum of elements on left = sum of elements on right");
  }
}

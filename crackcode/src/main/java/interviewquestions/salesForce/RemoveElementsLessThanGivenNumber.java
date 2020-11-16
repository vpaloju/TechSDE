package interviewquestions.salesForce;

/**
 * Remove all the elements which are less than the give number and return the array in sorted form.
 * Input : 1, 2, 3, 4, 5, 9, 10, 8, 7
 * OutPut: 5, 7, 8, 9, 10
 */
public class RemoveElementsLessThanGivenNumber {

  public static void removeElements(int[] a, int x) {
    int[] result = new int[a.length];
    int j = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] > x) {
        insertIntoSortedArray(result, j++, a[i]);
      }
    }
    for (int i = 0; i < j; i++) {
      System.out.print(result[i] + " ");
    }
  }

  public static int[] insertIntoSortedArray(int[] a, int length, int key) {
    int i;
    for (i = length - 1; (i >= 0 && a[i] > key); i--) {
      a[i + 1] = a[i];
    }
    a[i + 1] = key;
    return a;
  }

  public static void main(String[] args) {
    removeElements(new int[]{100, 2, 3, 4, 5, 9, 10, 8, 7}, 4);
  }
}

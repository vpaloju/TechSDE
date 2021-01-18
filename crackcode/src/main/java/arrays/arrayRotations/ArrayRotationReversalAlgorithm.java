package arrays.arrayRotations;

public class ArrayRotationReversalAlgorithm {

  /**
   * @param array
   * @param elementsToBeRotate
   * @return
   */
  public static int[] leftRotate(int[] array, int elementsToBeRotate) {
    reverse(array, 0, elementsToBeRotate - 1);
    reverse(array, elementsToBeRotate, array.length - 1);
    reverse(array, 0, array.length - 1);
    return array;
  }

  /**
   * @param array
   * @param startIndex
   * @param endIndex
   */
  public static void reverse(int[] array, int startIndex, int endIndex) {
    for (int i = startIndex, j = endIndex; i < j; i++, j--) {
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
    }
  }

  /**
   * @param a
   * @param n
   * @param d
   * @return
   */
  public static int[] rightRotate(int[] a, int n, int d) {
    reverse(a, 0, n - 1);
    reverse(a, 0, d - 1);
    reverse(a, d, n - 1);
    return a;
  }
}

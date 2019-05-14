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
        while (startIndex < endIndex) {
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
}

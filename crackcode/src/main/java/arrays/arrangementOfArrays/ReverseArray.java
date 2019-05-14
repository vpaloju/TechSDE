package arrays.arrangementOfArrays;

public class ReverseArray {

    /**
     * O(n) complexity.
     *
     * @param array
     * @return
     */
    public static int[] reverseArray(int[] array) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        if (startIndex >= endIndex) {
            return array;
        }
        while (startIndex < endIndex) {
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
        return array;
    }

    /**
     * @param array
     * @param startIndex
     * @param endIndex
     * @return
     */
    public static int[] reverseRecursive(int[] array, int startIndex, int endIndex) {
        if (startIndex >= endIndex)
            return null;
        int temp = array[startIndex];
        array[startIndex] = array[endIndex];
        array[endIndex] = temp;
        reverseRecursive(array, startIndex + 1, endIndex - 1);
        return array;
    }
}

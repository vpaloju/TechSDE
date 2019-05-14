package arrays.arrayRotations;

public class CyclicRotateByOne {

    /**
     * Time Complexity: O(n) As we need to iterate through all the elements
     * Auxiliary Space: O(1)
     *
     * @param array
     * @return
     */
    public static int[] cyclicRotate(int[] array) {
        int lastElement = array[array.length - 1], i;
        for (i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = lastElement;
        return array;
    }
}

package arrays.arrangementOfArrays;

public class MoveAllZerosToRight {

    public static int[] moveAllZerosToRight(int[] array) {
        int nonZeroNumberIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[nonZeroNumberIndex++] = array[i];
            }
        }
        while (nonZeroNumberIndex < array.length) {
            array[nonZeroNumberIndex++] = 0;
        }
        return array;
    }
}

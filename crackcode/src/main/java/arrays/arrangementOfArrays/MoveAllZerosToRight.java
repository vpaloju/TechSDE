package arrays.arrangementOfArrays;

public class MoveAllZerosToRight {

    public static int[] moveAllZerosToRight(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[count++] = array[i];
            }
        }
        while (count < array.length) {
            array[count++] = 0;
        }
        return array;
    }
}

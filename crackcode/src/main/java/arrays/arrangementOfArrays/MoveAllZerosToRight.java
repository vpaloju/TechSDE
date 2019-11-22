package arrays.arrangementOfArrays;

import java.util.Arrays;

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

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveAllZerosToRight(new int[]{0,1,2,3,0,4,0,5,6,0})));
    }
}

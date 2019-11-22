package arrays.sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BubbleSort {

    public static int[] bubbleSort(int[] array) {
        int n = array.length - 1;
        for (int i = 0; i < n - 1; i++) {
            int count = 0;
            for (int j = 0; j < n - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    count++;
                }
            }
            if (count == 0)
                break;
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{1, 2, 3, 5, 7, 6, 4})));
    }
}

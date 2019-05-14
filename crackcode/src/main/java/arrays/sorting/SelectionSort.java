package arrays.sorting;

public class SelectionSort {

    public static int[] selectionSort(int[] array) {
        int n = array.length - 1;
        for (int i = 0; i < n; i++) {
            int min = array[i], minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    int temp = array[minIndex];
                    array[minIndex] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}

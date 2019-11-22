package arrays.sorting;

import java.util.Arrays;

public class HeapSort {

    public static void heapify(int[] array, int size, int currentNodeIndex) {
        int largestNodeIndex = currentNodeIndex;
        int leftNodeIndex = currentNodeIndex * 2 + 1;
        int rightNodeIndex = currentNodeIndex * 2 + 2;
        if (leftNodeIndex < size && array[leftNodeIndex] > array[largestNodeIndex]) {
            largestNodeIndex = leftNodeIndex;
        }
        if (rightNodeIndex < size && array[rightNodeIndex] > array[largestNodeIndex]) {
            largestNodeIndex = rightNodeIndex;
        }
        if (largestNodeIndex != currentNodeIndex) {
            swap(array, currentNodeIndex, largestNodeIndex);
            heapify(array, size, largestNodeIndex);
        }
    }

    public static void swap(int[] array, int currentNodeIndex, int largestNodeIndex) {
        int temp = array[currentNodeIndex];
        array[currentNodeIndex] = array[largestNodeIndex];
        array[largestNodeIndex] = temp;
    }

    public static void buildHeap(int[] array) {
        int size = array.length;
        /*
         * As last non leaf node will be at [(arr.length)/2] - 1
         * so we will start from this location for heapifying the elements
         * */
        for (int i = (size / 2) - 1; i >= 0; i--) {
            heapify(array, size, i);
        }
    }

    public static int[] heapSort(int[] array) {
        buildHeap(array);
        int size = array.length - 1;
        for (int i = size; i > 0; i--) {
            swap(array, i, 0);
            heapify(array, i, 0);
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(heapSort(new int[]{7,1,3,2,4,5,6,-10,-20,-1,-40})));
    }
}

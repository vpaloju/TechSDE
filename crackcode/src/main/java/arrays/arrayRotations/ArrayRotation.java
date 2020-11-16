package arrays.arrayRotations;

import java.util.Arrays;

public class ArrayRotation {

    /**
     * This will take Time complexity : O(n)
     * Auxiliary Space : O(d)
     *
     * @param array
     * @param size
     * @param elementsToBeRotate
     * @return
     */
    public static int[] rotateUsingTempArray(int[] array, int size, int elementsToBeRotate) {
        int[] temp = new int[elementsToBeRotate];
        for (int i = 0; i < elementsToBeRotate; i++) {
            temp[i] = array[i];
        }
        for (int i = 0; i < size - elementsToBeRotate; i++) {
            array[i] = array[i + elementsToBeRotate];
        }
        for (int i = 0; i < temp.length; i++) {
            array[i + (size - elementsToBeRotate)] = temp[i];
        }
        return array;
    }

    /**
     * This will take Time complexity : O(n*d)
     * Auxiliary Space : O(1)
     *
     * @param array
     * @param size
     * @param elementsToBeRotate
     * @return
     */
    public static int[] rotateOneByOne(int[] array, int size, int elementsToBeRotate) {
        int[] resultArray = new int[size];
        for (int i = 0; i < elementsToBeRotate; i++) {
            resultArray = lefRotateArraybyOne(array, size);
        }
        return resultArray;
    }

    /**
     * @param array
     * @param size
     * @return
     */
    public static int[] lefRotateArraybyOne(int[] array, int size) {
        int temp = array[0];
        for (int i = 0; i < size - 1; i++) {
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
        return array;
    }

    public int[] leftRotateJugglingAlgorithm(int[] array, int size, int elementsToBeRotate) {
        int i, j, k, temp;
        for (i = 0; i < findGCD(elementsToBeRotate, size); i++) {
            /* move i-th values of blocks */
            temp = array[i];
            j = i;
            while (true) {
                k = j + elementsToBeRotate;
                if (k >= size)
                    k = k - size;
                if (k == i)
                    break;
                array[j] = array[k];
                j = k;
            }
            array[j] = temp;
        }
        return array;
    }

    public int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }

    }

    /**
     * O(n) complexity.
     *
     * @param array
     * @param size
     * @param elementsToBeRotate
     * @return
     */
    public static int[] rotateArray(int[] array, int size, int elementsToBeRotate) {
        for (int i = 0; i < elementsToBeRotate; i++) {
            swap(array, i, array.length - 1 - i);
        }
        return array;
    }

    /**
     * @param array
     * @param startIndex
     * @param endIndex
     * @return
     */
    public static int[] swap(int[] array, int startIndex, int endIndex) {
        for (int i = 0; i < array.length - 1; i++) {
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateOneByOne(new int[]{1,2,3,4},4,2)));
    }
}

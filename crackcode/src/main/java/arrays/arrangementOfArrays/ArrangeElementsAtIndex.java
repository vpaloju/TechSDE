package arrays.arrangementOfArrays;

import java.util.HashSet;

/**
 * Given an array of elements of length N, ranging from 0 to N – 1. All elements may not be present in the array. If element is not present then there will be -1 present in the array. Rearrange the array such that A[i] = i and if i is not present, display -1 at that place.
 */
public class ArrangeElementsAtIndex {

    public static int[] reArrangeArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] != -1 && array[i] != i) {
                int x = array[i];
                //Check the desired place is vacant or not
                while (array[x] != -1 && array[x] != x) {
                    int y = array[x];
                    array[x] = x;
                    x = y;
                }
                array[x] = x;
                if (array[i] != i) {
                    array[i] = -1;
                }
            }
        }
        return array;
    }

    public static int[] reArrangeUsingHashSet(int[] array) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < array.length - 1; i++) {
            hashSet.add(array[i]);
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (hashSet.contains(i)) {
                array[i] = i;
            } else
                array[i] = -1;
        }
        return array;
    }
}



package arrays.arrangementOfArrays;

/**
 * An array contains both positive and negative numbers in random order. Rearrange the array elements so that positive and negative numbers are placed alternatively. Number of positive and negative numbers need not be equal. If there are more positive numbers they appear at the end of the array. If there are more negative numbers, they too appear in the end of the array.
 * O(n) Times
 * O(1) Extra space
 */
public class ArrangePossitiveNegative {

    /**
     * The main function that rearranges elements of given array.  It puts positive elements at even indexes (0,2, ..) and negative numbers at odd indexes (1, 3, ..).
     *
     * @param array
     */
    public static int[] arrangePossitiveNegative(int[] array) {
        int size = array.length;
        int count = -1, temp = 0;
        for (int j = 0; j < size; j++) {
            if (array[j] < 0) {
                count++;
                temp = array[count];
                array[count] = array[j];
                array[j] = temp;

            }
        }
        int possitive = count + 1, negative = 0;

        while (possitive < size && negative < possitive && array[negative] < 0) {
            temp = array[negative];
            array[negative] = array[possitive];
            array[possitive] = temp;
            possitive++;
            negative += 2;
        }
        return array;

    }

}

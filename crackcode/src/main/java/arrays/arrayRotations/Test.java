package arrays.arrayRotations;

import arrays.arrangementOfArrays.*;
//import arrays.search.BinarySearch;
import arrays.search.LinearSearch;
import arrays.sorting.BubbleSort;
import arrays.sorting.HeapSort;
import arrays.sorting.InsertionSort;
import arrays.sorting.SelectionSort;
import interviewquestions.*;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] array=new int[]{1,2,4,5,6,7,8,9,10,20,15,18,30,25};
        String s="Welcome To ORACLE";

        /*int[] results = new int[array.length];
        System.out.println(Arrays.toString(array));
        results=HeapSort.heapSort(array);
        System.out.println(Arrays.toString(results));*/
        System.out.println(Arrays.toString(AllEvenToLeftOddsToRight.moveAllEvensToLeft(array)));
    }
}

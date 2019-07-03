package arrays.sorting;

import java.util.Arrays;

public class MergerSort {

    public static int[] mergeSort(int[] array, int start,int end){
        int mid=(start+end)/2;
        while (start<end){
        mergeSort(array,start,mid);
        mergeSort(array,mid+1,end);
        merge(start,mid,end);
        }
        return array;
    }

    private static void merge(int start, int mid, int end) {
    }

}

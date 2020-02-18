package interviewquestions.amazon;

import java.util.Arrays;

public class CombineTwoSortedArraysInSort {

    public static int[] combineArraysOnTheFlySort(int[] a,int[] b){
        int result[] = new int[a.length+b.length];
        int i=0,j=0,k=0;
        while (i<a.length&&j<b.length){
            if(a[i]<b[j]){
                result[k++]=a[i++];
            }else{
                result[k++]=b[j++];
            }
        }
        while (i<a.length){
            result[k++]=a[i++];
        }
        while (j<b.length){
            result[k++]=b[j++];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(combineArraysOnTheFlySort(new int[]{1, 3, 5, 7},new int[]{2, 4, 6, 8})));
    }
}

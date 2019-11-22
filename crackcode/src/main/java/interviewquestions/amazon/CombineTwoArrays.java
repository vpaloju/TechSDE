package interviewquestions.amazon;

import java.util.Arrays;

public class CombineTwoArrays {

    public static int[] concatArrays(int[] a,int[] b){
        int[] result = new int[a.length+b.length];
        int position = 0;
        for(int element:a){
            result[position]=element;
            position++;
        }
        for(int element:b){
            result[position]=element;
            position++;
        }
        return result;
    }

    public static int[] concatArraysUsingCopyArray(int[] a,int[] b) {
        int[] result = new int[a.length+b.length];
        System.arraycopy(a,0,result,0,a.length);
        System.arraycopy(b,0,result,a.length,b.length);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(concatArraysUsingCopyArray(new int[]{1,2,3,4,5},new int[]{6,7,8,9,10})));
    }
}

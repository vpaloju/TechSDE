package arrays.arrangementOfArrays;

import java.util.Arrays;

public class AllEvenToLeftOddsToRight {

    public static int[] moveAllEvensToLeft(int[] array){
        int n=array.length, evenNumberIndex=-1;
        for(int i=0;i<n;i++){
            if(array[i]%2==0){
                evenNumberIndex++;
                int temp=array[i];
                array[i]=array[evenNumberIndex];
                array[evenNumberIndex]=temp;
            }
        }
        return array;
    }

    public static int[] moveAllEvenToLeftOddsToRight(int[] array){
        int n= array.length-1;
        int evenIndex=0,oddIndex=0;
        for (int i = 0; i <array.length; i++) {
            if (array[evenIndex] % 2 == 0)
            {
                swap(evenIndex, oddIndex, array);
                evenIndex++;
                oddIndex++;
            }
            else
            {
                evenIndex++;
            }
        }
        System.out.println("array = " + Arrays.toString(array));
        return array;
    }

    private static void swap(int evenIndex, int oddIndex, int[] array) {
        int temp = array[evenIndex];
        array[evenIndex] = array[oddIndex];
        array[oddIndex] = temp;
    }

    public static void main(String[] args) {
        moveAllEvenToLeftOddsToRight(new int[]{3,1,2,5,6,8,0});
        System.out.println("array = " + Arrays.toString(moveAllEvensToLeft(new int[]{3,1,2,5,6,8,0})));
    }
}

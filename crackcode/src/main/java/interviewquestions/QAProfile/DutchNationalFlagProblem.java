package interviewquestions.QAProfile;

import java.util.Arrays;

public class DutchNationalFlagProblem {

    public static int[] sort012(int[] array){
        int low=0,mid=0,high=array.length-1,temp;
        while (mid<=high)
        {
           switch (array[mid]){
            case 0: {
                temp = array[low];
                array[low] = array[mid];
                array[mid] = temp;
                low++;
                mid++;
                break;
            }
               case 1: {
                   mid++;
                   break;
               }
               case 2: {
                   temp = array[mid];
                   array[mid] = array[high];
                   array[high] = temp;
                   high--;
                   break;
               }
        }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort012(new int[]{0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1})));
    }
}

package interviewquestions.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class FindSubArrayWithGivenSum {

    public static int[] findSubArray(int[] array, int sum) {
        int[] result = new int[3];
        int n = array.length - 1, currentSum = 0, beginIndex = 0, endIndex = n;
        for (int i = 0; i < n - 2; i++) {
            currentSum += array[i] + array[i + 1] + array[i + 2];
            if (currentSum == sum) {
                result[0] = array[i];
                result[1] = array[i + 1];
                result[2] = array[i + 2];
                return result;
            } else {
                currentSum = 0;
            }

        }
        return result;
    }

    public static void  findSubArrayWithGivenSum(int[] array,int n,int sum){
        int current_sum=0,start=0,end=-1,i;
        HashMap<Integer,Integer> map= new HashMap<Integer, Integer>();
        for(i=0;i<n;i++){
            current_sum+=array[i];
            if(current_sum==sum){
                start=0;
                end=i;
                break;
            }
            if(map.containsKey(current_sum-sum)){
                start=map.get(current_sum-sum)+1;
                end=i;
                break;
            }
            map.put(current_sum,i);
        }
        if(end==-1){
            System.out.println("The given sum is not identified with sub arrays");
        }else {
            System.out.println("The sum is identified with sub array index started from: " + start + " and ends at: " + end);
        }

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findSubArray(new int[]{1, 2, 3, 7, 5}, 12)));
        findSubArrayWithGivenSum(new int[]{1, 4, 20, 3, 10, 5},6,33);
    }
}

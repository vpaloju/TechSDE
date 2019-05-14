package interviewquestions.arrays;

/**
 * Given an array of n positive integers. Write a program to find the sum of maximum sum subsequence of the given array such that the integers in the subsequence are sorted in increasing order. For example, if input is {1, 101, 2, 3, 100, 4, 5}, then output should be 106 (1 + 2 + 3 + 100), if the input array is {3, 4, 5, 10}, then output should be 22 (3 + 4 + 5 + 10) and if the input array is {10, 5, 4, 3}, then output should be 10
 */
public class MaxSumIncreasingSubsequence {

    public static int maxSumIncreasingSubsequence(int[] array){
       int lastIndex=array.length-1,maxsum=array[lastIndex];
       int[] cache=new int[array.length];
       cache[lastIndex]=array[lastIndex];
       for(int i=array.length-2;i>=0;i--){
           int tempSum=array[i];
           if(array[i]<array[i+1]){
               tempSum+=cache[i+1];
           }
           maxsum = Math.max(maxsum,tempSum);
           cache[i]=maxsum;
       }
       return maxsum;
    }

    public static void main(String[] args) {
        System.out.println(maxSumIncreasingSubsequence(new int[]{1, 2, 4, 3,99,47}));
    }
}

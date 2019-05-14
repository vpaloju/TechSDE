package interviewquestions.arrays;

public class KadaneAlgorithm {

    public static int maxSumOfSubArray(int[] array){
        int currentSum=array[0],maxSum=array[0],n=array.length;
        for (int i=1;i<n;i++){
            currentSum=Math.max(currentSum+array[i],array[i]);
            maxSum=Math.max(currentSum,maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(maxSumOfSubArray(new int[]{1, 2, 3, -2, 5,-1,0}));
    }
}

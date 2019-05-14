package interviewquestions.arrays;

public class FindMissingNumberInArray {

    public static int findMissingNumber(int[] array,int n){
        int sum=(n+1)*(n+2)/2;
        for(int i=0;i<n;i++){
            sum-=array[i];
        }
        return sum;
    }

    public static int findMissingNumberXOR(int[] array,int n){
        int x1=array[0];
        /* For xor of all the elements in array */
        for(int i=1;i<n;i++){
            x1=x1^array[i];
        }
        /* For xor of all the elements from 1 to n+1 */
        int x2 = 1;
        for(int i=2;i<=n+1;i++){
            x2=x2^i;
        }
        return x1^x2;
    }
}

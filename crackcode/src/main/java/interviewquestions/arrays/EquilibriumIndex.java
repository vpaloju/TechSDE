package interviewquestions.arrays;

/**
 * Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes. For example, in an array A:
 *Example :
 * Input : A[] = {-7, 1, 5, 2, -4, 3, 0}
 * Output : 3
 * 3 is an equilibrium index, because:
 * A[0] + A[1] + A[2]  =  A[4] + A[5] + A[6]
 */
public class EquilibriumIndex {

    public static int equilibriumIndex(int[] array){
        int n=array.length;
        int sum=0,leftSum=0;
        for(int i=0;i<n;i++){
            sum+=array[i];
        }
        for(int i=0;i<n;i++){
            sum-=array[i];
            if(leftSum==sum){
                return i;
            }
            leftSum+=array[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(equilibriumIndex(new int[]{-7, 1, 5, 2, -4, 3, 0}));
    }
}

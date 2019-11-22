package interviewquestions;

/**
 * Given non-zero two integers N and M. The problem is to find the number closest to N and divisible by M. If there are more than one such number, then output the one having maximum absolute value.
 */
public class ClosestNumber {

    public static int closestNumber(int num1,int num2){
        if(num1>0) {
            return num1 -= num1 % num2;
        }else if(num1<0){
            return (num1) += num1 % num2;
        }else{
            return 0;
        }

    }

    public static void main(String[] args) {
        System.out.println(closestNumber(-15,6));
    }
}

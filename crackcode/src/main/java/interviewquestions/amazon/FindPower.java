package interviewquestions.amazon;

public class FindPower {

    public static int findPowerOfNumber(int base, int exponent) {
        int result = 1;
        if (exponent == 0) {
            return result;
        } else {
            while (exponent != 0) {
                result *= base;
                exponent--;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(findPowerOfNumber(2,4));
    }
}

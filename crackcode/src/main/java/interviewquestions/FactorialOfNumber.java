package interviewquestions;

public class FactorialOfNumber {
    /**
     * nPr represents n permutation r and value of nPr is (n!) / (n-r)!.
     *
     * @param num
     * @param r
     * @return
     */
    public static int factorialOfNumber(int num, int r) {
        if (num == 0 || num == 1) {
            return 1;
        }
        int result = 1;
        for (int i = num; i > num - r; i--) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorialOfNumber(10,4));
    }
}

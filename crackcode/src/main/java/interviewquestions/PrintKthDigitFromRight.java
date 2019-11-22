package interviewquestions;

/**
 * Given two numbers A and B, find Kth digit from right of A power of B.
 */
public class PrintKthDigitFromRight {

    public static int findKthDigit(int n, int k) {
        int result = 0;
        if (n == 0 || k == 0) {
            return 0;
        }
        if (k < 0) {
            return -1;
        }
        int digitCount = 0;
        while (n > 0) {
            result = n % 10;
            n /= 10;
            digitCount++;
            if (digitCount == k) {
                return result;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findKthDigit(powerOfNumber(5, 2), 2));
    }

    public static int powerOfNumber(int n, int m) {
        if (m == 0) {
            return 1;
        }
        if (m < 0) {
            return -1;
        }
        int result = n;
        while (m > 1) {
            result *= n;
            m--;
        }
        return result;
    }
}

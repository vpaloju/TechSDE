package interviewquestions;

public class SumOfDigitsPalindrom {

    public static boolean isSumOfDigitsPalindrom(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        if (sum == ReverseNumber.reverseNumber(sum)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isSumOfDigitsPalindrom(895));
        int sum = sumOfDigits(467);
        if (sum == reverseNumber(sum)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }


    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int reverseNumber(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n <= 9) {
            System.out.println("YES");
            return n;
        }
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }
}

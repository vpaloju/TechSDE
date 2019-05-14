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
}

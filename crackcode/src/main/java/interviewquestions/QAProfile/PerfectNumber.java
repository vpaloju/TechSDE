package interviewquestions.QAProfile;

public class PerfectNumber {

    public static boolean isPerfectNumber(int num) {
        int sumOfMultiples = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sumOfMultiples += i;
            }
        }
        if (num == sumOfMultiples) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(28));
    }
}

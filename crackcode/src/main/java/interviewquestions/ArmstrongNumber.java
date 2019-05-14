package interviewquestions;

public class ArmstrongNumber {

    public static boolean armstrong(int num) {
        int sum = 0, temp = num;
        boolean result = false;
        while (temp > 0) {
            int digit = temp % 10;
            sum += (digit * digit * digit);
            temp /= 10;
        }
        if (sum == num) {
            return true;
        } else {
            return false;
        }
    }
}

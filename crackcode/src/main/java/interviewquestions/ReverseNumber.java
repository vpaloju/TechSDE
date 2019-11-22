package interviewquestions;

public class ReverseNumber {

    public static int reverseNumber(int num) {
        if (num < 0) {
            return -1;
        }
        if (num == 0 || num <= 9) {
            return num;
        }
        int reverseNumber = 0;
        while (num > 0) {
            reverseNumber = reverseNumber * 10 + num % 10;
            num /= 10;
        }
        return reverseNumber;
    }

}


package interviewquestions;

import java.util.Arrays;

public class NumberOfEvenOddDigits {

    public static int[] numberOfEvenOddDigits(int num) {
        int evenDigits = 0, oddDigits = 0;
        while (num > 0) {
            if ((num % 10) % 2 == 0) {
                evenDigits++;
            } else {
                oddDigits++;
            }
            num /= 10;
        }
        return new int[]{evenDigits, oddDigits};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberOfEvenOddDigits(145678)));
    }
}

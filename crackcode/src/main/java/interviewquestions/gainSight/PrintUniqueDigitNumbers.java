package interviewquestions.gainSight;

import java.util.LinkedHashSet;

public class PrintUniqueDigitNumbers {

    public static void printNumberWithUniqueDigits(int lowerLimit, int upperLimit) {

        for (int i = lowerLimit; i <= upperLimit; i++) {
            if (!isDuplicateDigitsPresent(i)) {
                System.out.println(i);
            }
        }
    }

    public static void printUniqueDigitNumbers(int start, int end) {
        while (start <= end) {
            if (!isDuplicateDigitsPresent(start)) {
                System.out.print(start + " ");
            }
            if (!isDuplicateDigitsPresent(end)) {
                System.out.println(end + " ");
            }
            start++;
            end--;
        }
    }

    public static boolean isDuplicateDigitsPresent(int n) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        while (n != 0) {
            int d = n % 10;
            if (set.contains(d)) {
                return true;
            }
            set.add(d);
            n /= 10;
        }
        return false;
    }

    public static void printUniqueDigitNumber(int lowerLimit, int upperLimit) {
        for (int i = lowerLimit; i <= upperLimit; i++) {
            boolean visited[] = new boolean[10];
            int number = i;
            while (number != 0) {
                if (visited[number % 10]) {
                    break;
                }
                visited[number % 10] = true;
                number /= 10;
            }
            if (number == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        printUniqueDigitNumber(1, 100);
        printUniqueDigitNumbers(1, 100);
        printNumberWithUniqueDigits(1, 100);
    }
}

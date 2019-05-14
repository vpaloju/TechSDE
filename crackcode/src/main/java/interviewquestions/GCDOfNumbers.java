package interviewquestions;

public class GCDOfNumbers {

    public static int gcdOfNumbers(int a, int b) {
        for (int i = a; i >= 2; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }
}

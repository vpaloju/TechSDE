package interviewquestions;

public class GCDOfNumbers {

    public static int gcdOfNumbers(int a, int b) {
        if (a == 0) {
            return b;
        }
        for (int i = a; i >= 2; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    public static void main(String[] args) {
        System.out.println(gcd(4, 16));
        System.out.println(gcdOfNumbers(4, 16));
    }
}

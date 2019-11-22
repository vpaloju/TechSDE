package interviewquestions;

public class LCMOfNumbers {

    public static int lcmOfNumbers(int a, int b) {
        int lcm = 0;
        lcm = a > b ? a : b;
        for (int i = lcm; lcm % a != 0 || lcm % b != 0; i++) {
            lcm = i;
        }
        return lcm;
    }

    public static int lcm(int a, int b) {
        return (a * b) / GCDOfNumbers.gcd(a, b);
    }

    public static void main(String[] args) {
        System.out.println(lcm(4, 16));
    }
}

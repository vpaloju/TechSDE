import java.util.Scanner;

/**
 * S = x1 - x2 + x3 - x4 + x5 - ………… - x20; where x = 2
 */
public class Test {

    public static int calculate(int x, int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            int current = (int) Math.pow(x, i);
            if (i % 2 == 0) {
                result -= current;
            } else {
                result += current;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(6*1024 * 1024 * 1024);
        System.out.println((6*1024 * 1024 * 1024)/4096);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter x and n values");
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(calculate(x, n));
    }
}

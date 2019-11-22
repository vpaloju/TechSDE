package interviewquestions.amazon;

import java.util.Arrays;

public class FibonaciSeries {

    public static int[] generateFibonaciSeries(int num) {
        int num1 = 0, num2 = 1, sum = 0;
        int[] result = new int[num];
        result[0] = num1;
        result[1] = num2;
        for (int i = 2; i < num; i++) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            result[i] = sum;
        }
        return result;
    }

    public static int nThFibonicNumber(int n) {
        if (n == 1) {
            return 1;
        }
        int f1 = 0, f2 = 1, fn = 1;
        for (int i = 3; i <= n; i++) {
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        System.out.print(n + "Th Fibonic number:");
        return fn;
    }

    public static int fiboniccNumberUsingRecurssion(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fiboniccNumberUsingRecurssion(n - 1)
                + fiboniccNumberUsingRecurssion(n - 2);
    }

    public static void printNFiboniccNumbers(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print(fiboniccNumberUsingRecurssion(i) + ",");
        }
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateFibonaciSeries(10)));
    }
}

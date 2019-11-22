package interviewquestions;

public class SwapNumbers {

    public static void swapWithExtraSpace(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void swapWithOutExtraSpace(int a, int b) {
        //Using addition and substraction.
        a = a + b;
        b = a - b;
        a = a - b;

       /* //Using multiplication and division.
        a = a * b;
        b = a / b;
        a = a / b;

        //Using bitwise XOR operation.
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        //Single statement.
        b = a + b - (a = b);*/
    }
}

package interviewquestions;

public class ArithmaticOpsRecurssion {

    public static int multiplyWithRecursion(int a, int b) {
        return a == 0 ? 0 : (multiplyWithRecursion(a - 1, b) + b);
    }

    public static int divideWithRecursion(int a, int b) {
        return (b == 0 || a < b) ? 0 : (1 + divideWithRecursion(a - b, b));
		/*if (b == 0) {
			return 0;
		} else if (a < b) {
			return 0;
		} else {
			return (1+ divideWithRecursion(a -b, b));
		}*/

    }

    public static int sumUsingRecursion(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return sumUsingRecursion(a + 1, b - 1);
        }
    }
}

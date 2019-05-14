package interviewquestions;

public class BinaryNumberToDecimal {

    public static int binaryToDecimal(int binary) {
        int decimal = 0, n = 0;
        if (binary == 0) {
            return 0;
        }
        while (binary > 0) {
            decimal += binary % 10 * Math.pow(2, n);
            binary /= 10;
            n++;
        }
        return decimal;
    }
}

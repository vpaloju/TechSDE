package interviewquestions;

public class GCDOfArray {

    public static int gcdOfArray(int[] a) {
        int result = a[0];
        for (int i = 1; i < a.length; i++) {
            result = GCDOfNumbers.gcd(a[i], result);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(gcdOfArray(new int[]{2, 4, 6, 8, 16 }));
    }
}

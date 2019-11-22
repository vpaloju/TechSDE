package interviewquestions;

/**
 * Given N, count all ‘a’(>=1) and ‘b’(>=0) that satisfy the condition a3 + b3 = N.
 */
public class CountPairSumOfCubesIsN {

    public static int countPair(int N) {
        int count = 0;
        // Check for each number 1 to cbrt(N)
        for (int i = 1; i <= Math.cbrt(N); i++) {
            // Subtract the cube from given N
            int diff = N - i * i * i;
            ;
            // Check if the difference is also a perfect cube
            int cbrtDiff = (int) Math.cbrt(diff);
            // If yes, then increment count
            if (cbrtDiff * cbrtDiff * cbrtDiff == diff)
                count++;
        }
        // Return count
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPair(10));
    }
}

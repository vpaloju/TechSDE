package interviewquestions.salesForce;

public class JumpingJack {


    public static int maxSteps(int n, int k) {
        if (isLandedOnStepK(k)) {
            return n * (n + 1) / 2 - 1;
        } else {
            return n * (n + 1) / 2;
        }
    }

    public static boolean isLandedOnStepK(int k) {
        for (int i = 0; i <= k; i++) {
            if (i * (i + 1) / 2 == k) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(maxSteps(3, 3));
    }
}

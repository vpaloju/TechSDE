package interviewquestions.salesForce;

import java.util.List;

public class ReverseArrayByGivenNumberOfElements {

    public static int[] reverseArray(int[] a, int numberOfElementsToReverse) {
        int start = 0, end = numberOfElementsToReverse;
        while (start <= end) {
            int temp = a[start];
            a[start] = a[end];
            start++;
            end--;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = reverseArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5);
        for (int i : a) {
            System.out.println(i);
        }
    }
}

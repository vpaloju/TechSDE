package interviewquestions.salesForce;

import java.util.Arrays;

public class RemoveElementsLessThanGivenNumber {

    public static int[] removeElements(int[] a, int x) {
        int[] result = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > x) {
                result[j] = a[i];
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeElements(new int[]{1, 2, 3, 4, 5, 6, 8, 10, 9}, 4)));
    }
}

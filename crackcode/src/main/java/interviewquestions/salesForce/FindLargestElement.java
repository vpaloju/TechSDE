package interviewquestions.salesForce;

import java.util.Arrays;
import java.util.List;

public class FindLargestElement {

    public static int largestElement(List<Integer> list) {
        int largestElement = list.get(0);
        for (int a : list) {
            if (largestElement < a) {
                largestElement = a;
            }
        }
        return largestElement;
    }

    public static void main(String[] args) {
        final List<Integer> elements = Arrays.asList(5, 1, 2, 3, 0, 1);
        System.out.println(largestElement(elements));
    }
}

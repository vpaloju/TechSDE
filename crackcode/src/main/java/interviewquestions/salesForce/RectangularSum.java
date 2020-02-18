package interviewquestions.salesForce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RectangularSum {

    private static int rectangularSum(List<Integer> list, int startIndex, int endIndex) {
        int sum = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            sum += list.get(i) == null ? 0 : list.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        final List<List<Integer>> elements = new ArrayList<>();
        elements.add(Arrays.asList(1, 2, 3, 4));
        elements.add(Arrays.asList(5, 6, 7, 8));
        elements.add(Arrays.asList(8, 7, 6, 5));
        elements.add(Arrays.asList(4, 3, 2, 1));

        final String stringCoordinates1 = "0,0";
        final String stringCoordinates2 = "2,3";
        final int startIndex1 = Integer.parseInt(stringCoordinates1.split(",")[0]);
        final int startIndex2 = Integer.parseInt(stringCoordinates1.split(",")[1]);
        final int endIndex1 = Integer.parseInt(stringCoordinates2.split(",")[0]);
        final int endIndex2 = Integer.parseInt(stringCoordinates2.split(",")[1]);
        int sum = 0;
        for (int i = startIndex1; i <= endIndex1; i++) {
            sum += rectangularSum(elements.get(i), startIndex2, endIndex2);
        }
        System.out.println(sum);
    }
}

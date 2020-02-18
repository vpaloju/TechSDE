package interviewquestions.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RectangleSum {

    public static int rectangleSum(List<Integer> list, int startIndex, int endIndex) {
        int sum = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            sum += list.get(i) == null ? 0 : list.get(i);
        }
        return sum;
    }

    public static int rectangularSum(List<List<Integer>> matrix, String coord1, String coord2) {
        final int startIndex1 = Integer.parseInt(coord1.split(",")[0]);
        final int startIndex2 = Integer.parseInt(coord1.split(",")[1]);
        final int endIndex1 = Integer.parseInt(coord2.split(",")[0]);
        final int endIndex2 = Integer.parseInt(coord2.split(",")[1]);
        int sum = 0;
        for (int i = startIndex1; i <= endIndex1; i++) {
            sum += rectangleSum(matrix.get(i), startIndex2, endIndex2);

        }
        return sum;
    }

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(900000));
        final List<List<Integer>> elements = new ArrayList<>();
        elements.add(Arrays.asList(1, 2, 3, 4));
        elements.add(Arrays.asList(5, 6, 7, 8));
        elements.add(Arrays.asList(8, 7, 6, 5));
        elements.add(Arrays.asList(4, 3, 2, 1));
        System.out.println(rectangularSum(elements, "0,0", "2,3"));
    }
}

package interviewquestions.salesForce;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static int getPairsCount(List<Integer> list, int sum) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == sum) {
                    count++;
                }
            }

        }
        return count;
    }

    public static char mostOccurance(String str) {
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        int maxCount = 0;
        char maxOccuredChar = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] > maxCount) {
                maxCount = count[str.charAt(i)];
                maxOccuredChar = str.charAt(i);
            }
        }
        return maxOccuredChar;
    }

    public static int getLargestElement(List<Integer> elements) {
        int largestElement = elements.get(0);
        for (int i = 1; i < elements.size(); i++) {
            if (elements.get(i) > largestElement) {
                largestElement = elements.get(i);
            }
        }
        return largestElement;
    }

    public static void main(String[] args) {
        final List<Integer> elements = Arrays.asList(5, 1, 2, 3, 0, 1);
        System.out.println(getLargestElement(elements));
    }

}

package interviewquestions.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StarsAndBars {

    public static void main(String[] args) {
        String input = "|**|*|*|*";
        List<Integer> start = Arrays.asList(1, 1);
        List<Integer> end = Arrays.asList(5, 8);
        List<Integer> result = new ArrayList<>();
        result = getStarsCountBetweenBars(input, start, end);
        System.out.println("Stars count between bras:" + result);
    }

    public static List<Integer> getStarsCountBetweenBars(String input, List<Integer> startIndex, List<Integer> endIndex) {
        List<Integer> result = new ArrayList<>();
        if (startIndex.size() == endIndex.size()) {
            for (int i = 0; i < startIndex.size(); i++) {
                if (startIndex.get(i) < endIndex.get(i)) {
                    String sub = input.substring(startIndex.get(i) - 1, endIndex.get(i));
                    result.add(getStartCount(sub));
                }
            }
        }
        return result;
    }

    public static Integer getStartCount(String sub) {
        int count = 0, tempCount = 0;
        boolean foundBar = false;
        for (char c : sub.toCharArray()) {
            if (c == '|') {
                if (foundBar) {
                    count += tempCount;
                    tempCount = 0;
                }
                foundBar = true;
            }
            if (foundBar && c == '*') {
                tempCount++;
            }
        }
        return count;
    }
}

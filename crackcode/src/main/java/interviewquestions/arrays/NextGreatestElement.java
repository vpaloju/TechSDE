package interviewquestions.arrays;

import java.util.Arrays;
import java.util.List;

public class NextGreatestElement {

    public static int getNextGreatest(List<Integer> a, int element, int index) {
        int nextGratestElement = -1;
        for (int i = index; i < a.size(); i++) {
            if (a.get(i) > element) {
                nextGratestElement = a.get(i);
                break;
            }
        }
        return nextGratestElement;
    }

    public static void nextGratestElement(List<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(getNextGreatest(a, a.get(i), i + 1));
        }
    }

    public static void main(String[] args) {
        nextGratestElement(Arrays.asList(4, 4, 5, 2, 25));
    }
}

package interviewquestions.salesForce;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NextGratestNumber {

    private static Integer getNextGreaterElement(List<Integer> list, int element, int index) {
        int nextGreaterElement = -1;
        for (int i = index; i < list.size(); i++) {
            if (list.get(i) > element) {
                nextGreaterElement = list.get(i);
                break;
            }
        }
        return nextGreaterElement;
    }

    public static void main(String[] args) {
        System.out.println("Look at ReportGeneratorTest");
        final List<Integer> elements = Arrays.asList(5,1,2,3,0,1);
        //final List<Integer> elements = Arrays.asList(13, 7, 6, 12);
        //final List<Integer> elements = Arrays.asList(4, 5, 2, 25);
        /*for (int i = 0; i < elements.size(); i++) {
            System.out.println("Next greater element for " + elements.get(i) + " is: " + getNextGreaterElement(elements, elements.get(i), i + 1));
        }*/

    }


}

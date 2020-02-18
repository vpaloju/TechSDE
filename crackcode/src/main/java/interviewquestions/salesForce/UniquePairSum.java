package interviewquestions.salesForce;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniquePairSum {

    public static void main(String[] args) {
        final List<Integer> elements = Arrays.asList(5, 1, 2, 3, 0, 1);
        System.out.println(pairs(elements, 3));
    }

    static int pairs(List<Integer> arr, int x) {
        int pairsCount = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == x) {
                    if (!(map.containsKey(arr.get(i)) || (map.containsValue(arr.get(i))) && (map.containsKey(arr.get(j)) || (map.containsValue(arr.get(j)))))) {
                        map.put(arr.get(i), arr.get(j));
                        pairsCount++;
                    }
                }
            }
        }
        return pairsCount;
    }
}

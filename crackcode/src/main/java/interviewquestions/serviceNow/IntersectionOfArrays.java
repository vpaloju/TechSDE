package interviewquestions.serviceNow;

import java.util.*;

public class IntersectionOfArrays {

    public static int[] interSectionOfArrays(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        for (int i : a) {
            set.add(i);
        }
        List<Integer> list = new ArrayList<>();
        for (int i : b) {
            if (set.contains(i)) {
                list.add(i);
                set.remove(i);
            }
        }
        int i = 0;
        int[] result = new int[list.size()];
        for (int j : list) {
            result[i++] = j;
        }
        return result;
    }

    public static int[] interSectionWithSets(int[] a, int[] b) {
        Set<Integer> set1 = new HashSet<>();
        for (int i : a) {
            set1.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int i : b) {
            set2.add(i);
        }
        set1.retainAll(set2);
        int i = 0;
        int[] result = new int[set1.size()];
        for (int s : set1) {
            result[i++] = s;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = new int[]{4, 9, 5};
        int[] b = new int[]{9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(interSectionOfArrays(a, b)));
        System.out.println(Arrays.toString(interSectionWithSets(a, b)));
    }
}

package arrays;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesInArray {
    public static void printRepeating(int arr[], int size) {
        int i;
        System.out.println("The repeating elements are: \n");
        for (i = 0; i < size; i++) {
            if (arr[Math.abs(arr[i])] >= 0)
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            else
                System.out.println("Repeating elements are: "
                        + Math.abs(+arr[i]));
        }
    }

    public static void duplicatesInArray(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (!map.containsKey(a[i])) {
                map.put(a[i], 1);
            } else {
                map.put(a[i], map.get(a[i]) + 1);
            }
        }
        System.out.println("Duplicate Elements are: ");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }

    public static void main(String[] args) {
        printRepeating(new int[]{1,1,2}, 3);
        duplicatesInArray(new int[]{500, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 300});
    }
}

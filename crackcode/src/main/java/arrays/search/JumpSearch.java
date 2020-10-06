package arrays.search;

public class JumpSearch {

    public static int jumpSearch(int[] array, int x) {
        int n = array.length;
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;
        while (array[Math.min(step, n) - 1] < x) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;
        }
        while (array[prev] < x) {
            prev++;
            // If we reached next block or end of
            // array, element is not present.
            if (prev == Math.min(step, n))
                return -1;
        }
        // If element is found
        if (array[prev] == x) {
            return prev;
        }
        return -1;
    }
}

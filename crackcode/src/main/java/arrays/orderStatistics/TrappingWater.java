package arrays.orderStatistics;

/**
 * Trapping Rain Water
 * Difficulty Level : Hard
 *  Last Updated : 02 Dec, 2020
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
 *
 * Examples:
 *
 * Input: arr[]   = {3, 0, 2, 0, 4}
 * We can trap "3 units" of water between 3 and 2,
 * "1 unit" on top of bar 2 and "3 units" between 2
 * and 4.  See below diagram also.
 * Output: 7
 */
public class TrappingWater {

    public static int trapWater(int[] heights) {
        int n = heights.length;
        int left = 0, right = n - 1, result = 0;
        int maxLeft = 0, maxRight = 0;
        while (left <= right) {
            if (heights[left] <= heights[right]) {
                if (heights[left] > maxLeft) {
                    maxLeft = heights[left];
                } else {
                    result += maxLeft - heights[left];
                }
                left++;
            } else {
                if (heights[right] > maxRight) {
                    maxRight = heights[right];
                } else {
                    result += maxRight - heights[right];
                }
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] heights = new int[]{3, 0, 2, 0, 4};
        System.out.println(trapWater(heights));
    }
}

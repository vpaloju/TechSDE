package searchandsort;

public class SqureRootOfNumber {

  /**
   * Complexity Analysis:
   * Time Complexity: O(√ n).
   * Only one traversal of the solution is needed, so the time complexity is O(√ n).
   * Space Complexity: O(1).
   * Constant extra space is needed.
   *
   * @param n
   * @return
   */
  public static int squereRoot(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    int i = 1, result = 1;
    for (; result <= n; ) {
      i++;
      result = i * i;
    }
    return i - 1;
  }

  /**
   * Complexity Analysis:
   * Time complexity: O(log n).
   * The time complexity of binary search is O(log n).
   * Space Complexity: O(1).
   * Constant extra space is needed.
   *
   * @param x
   * @return
   */
  public static int floorSquereRoot(int x) {
    if (x == 0 || x == 1) {
      return 1;
    }
    int start = 1, end = x, ans = 0;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (x == mid * mid) {
        return mid;
      }
      if (x > mid * mid) {
        start = mid + 1;
        ans = mid;
      } else {
        end = mid - 1;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int x = 100, y = 11;
    System.out.println(squereRoot(x));
    System.out.println(squereRoot(y));
    System.out.println("*****************");
    System.out.println(floorSquereRoot(x));
    System.out.println(floorSquereRoot(y));
  }
}

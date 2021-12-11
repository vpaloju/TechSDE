package arrays.orderStatistics;

public class MinimumJumpsToReachEndOfArray {

  public static int minimumJumpsToReachEndOfArray(int[] a) {
    if (a.length <= 1) {
      return 0;
    }
    if (a[0] == 0) {
      return -1;
    }
    int maxReach = a[0];
    int step = a[0];
    int jump = 1;
    for (int i = 1; i < a.length; i++) {
      if (i == a.length - 1) {
        return jump;
      }
      maxReach = Math.max(maxReach, i + a[i]);
      step--;
      if (step == 0) {
        jump++;
        if (i >= maxReach)
          return -1;
        step = maxReach - i;
      }
    }
    return -1;
  }

  //Greedy approch.
  public static int minJumpsToReachEnd(int[] a) {
    int prev = 0, current = 0, jumps = 0;
    for (int i = 0; i < a.length; i++) {
      if (i > prev) {
        jumps = jumps + 1;
        prev = current;
      }
      current = Math.max(current, i + a[i]);
    }
    return jumps;
  }

  public static void main(String[] args) {
    System.out.println(minimumJumpsToReachEndOfArray(new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}));
    System.out.println(minJumpsToReachEnd(new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}));
  }
}

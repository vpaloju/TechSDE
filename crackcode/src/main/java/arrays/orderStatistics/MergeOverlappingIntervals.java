package arrays.orderStatistics;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class MergeOverlappingIntervals {

  static class Interval {
    int start, end;

    Interval(int start, int end) {
      this.start = start;
      this.end = end;
    }
  }

  public void mergeIntervals(Interval[] a) {
    if (a.length <= 0) {
      return;
    }
    Stack<Interval> stack = new Stack();
    /*Arrays.sort(a, new Comparator<InterVal>() {
      @Override
      public int compare(InterVal i1, InterVal i2) {
        return i1.start - i2.start;
      }
    });
    Arrays.sort(a, (i1, i2) -> i1.start - i2.start);*/

    // Sort Intervals in Increasing order of start time
    Arrays.sort(a, Comparator.comparingInt(i -> i.start));
    stack.push(a[0]);
    for (int i = 1; i < a.length; i++) {
      Interval top = stack.peek();
      if (top.end < a[i].start) {
        stack.push(a[i]);
      } else if (top.end < a[i].end) {
        top.end = a[i].end;
        stack.pop();
        stack.push(top);
      }
    }
    System.out.println("Merged Intervals are: ");
    while (!stack.isEmpty()) {
      Interval t = stack.pop();
      System.out.println("(" + t.start + "," + t.end + ")");
    }
  }

  public void mergeIntervalsWithOutStack(Interval[] a) {
    // Sort Intervals in decreasing order of start time
    Arrays.sort(a, (i1, i2) -> i2.start - i1.start);
    int index = 0;
    for (int i = 1; i < a.length; i++) {
      if (a[index].end >= a[i].start) {
        a[index].end = Math.max(a[index].end, a[i].end);
        a[index].start = Math.min(a[index].start, a[i].start);
      } else {
        index++;
        a[index] = a[i];
      }
    }
    System.out.print("The Merged Intervals are: ");
    for (int i = 0; i <= index; i++) {
      System.out.println("(" + a[i].start + ","
        + a[i].end + ")");
    }
  }

  public static void main(String[] args) {
    Interval[] interval = new Interval[]{new Interval(6, 8), new Interval(1, 9), new Interval(2, 4), new Interval(4, 7)};
    Interval[] interval1 = new Interval[]{new Interval(1, 3), new Interval(2, 4), new Interval(5, 7), new Interval(6, 8)};
    MergeOverlappingIntervals mergeOverlappingIntervals = new MergeOverlappingIntervals();
    mergeOverlappingIntervals.mergeIntervals(interval);
    mergeOverlappingIntervals.mergeIntervals(interval1);
    mergeOverlappingIntervals.mergeIntervalsWithOutStack(interval);
    mergeOverlappingIntervals.mergeIntervalsWithOutStack(interval1);
  }
}

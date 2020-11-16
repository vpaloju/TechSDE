package arrays.arrangementOfArrays;

import java.util.*;

/**
 * Arrange given numbers to form the biggest number | Set 1
 * Last Updated: 26-07-2019
 * Given an array of numbers, arrange them in a way that yields the largest value. For example, if the given numbers are {54, 546, 548, 60}, the arrangement 6054854654 gives the largest value. And if the given numbers are {1, 34, 3, 98, 9, 76, 45, 4}, then the arrangement 998764543431 gives the largest value.
 * <p>
 * Recommended: Please solve it on “PRACTICE ” first, before moving on to the solution.
 * A simple solution that comes to our mind is to sort all numbers in descending order, but simply sorting doesn’t work. For example, 548 is greater than 60, but in output 60 comes before 548. As a second example, 98 is greater than 9, but 9 comes before 98 in output.
 * <p>
 * So how do we go about it? The idea is to use any comparison based sorting algorithm.
 * <p>
 * In the used sorting algorithm, instead of using the default comparison, write a comparison function myCompare() and use it to sort numbers.
 * <p>
 * Given two numbers X and Y, how should myCompare() decide which number to put first – we compare two numbers XY (Y appended at the end of X) and YX (X appended at the end of Y). If XY is larger, then X should come before Y in output, else Y should come before. For example, let X and Y be 542 and 60. To compare X and Y, we compare 54260 and 60542. Since 60542 is greater than 54260,
 * we put Y first.
 */
public class FormBiggestNumber {

  public static void formBiggestNumber(Vector<String> a) {
    Collections.sort(a, new Comparator<String>() {
      @Override
      public int compare(String x, String y) {
        String xy = x + y;
        String yx = y + x;
        return xy.compareTo(yx) > 0 ? -1 : 1;
      }
    });
    Iterator it = a.iterator();
    while (it.hasNext()) {
      System.out.print(it.next());
    }
  }

  public static void main(String[] args) {
    Vector<String> a;
    a = new Vector<>();
    //output should be 6054854654
    a.add("54");
    a.add("546");
    a.add("548");
    a.add("60");
    formBiggestNumber(a);
  }

}

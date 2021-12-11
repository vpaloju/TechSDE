import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.SplittableRandom;

public class Test {

  public static int[] sotedMerge(int[] a, int[] b, int[] result) {
    int j = 0;
    for (int i = 0; i < a.length; i++) {
      sortedInsert(result, j++, a[i]);
    }
    for (int i = 0; i < b.length; i++) {
      sortedInsert(result, j++, b[i]);
    }
    return result;
  }

  public static int[] sortedInsert(int[] result, int length, int key) {
    int i;
    for (i = length - 1; (i >= 0 && result[i] > key); i--) {
      result[i + 1] = result[i];
    }
    result[i + 1] = key;
    return result;
  }

  public static char secondMaxOccurance(String str) {
    int ASCII_SIZE = 256;
    int[] map = new int[ASCII_SIZE];
    char[] charArray = str.toCharArray();
    int max = 0, secondMax = 0;
    char maxChar = '\n', secondMaxChar = '\n';
    for (int i = 0; i < charArray.length; i++) {
      map[charArray[i]]++;
    }
    for (int i = 0; i < ASCII_SIZE; i++) {
      if (map[i] > max) {
        secondMaxChar = maxChar;
        secondMax = max;
        max = map[i];
        maxChar = (char) i;
      } else if (map[i] > secondMax) {
        secondMax = map[i];
        secondMaxChar = (char) i;
      }
    }
    return secondMaxChar;
  }

  public static int numberOfFactorial(int n) {
    int fact = 1, result = 1;
    for (int i = 1; i <= Math.sqrt(n); i++) {
      fact *= i;
      if (fact == n) {
        return i;
      }
    }
    System.out.println("The give number " + n + " is not a factorial");
    return -1;
  }

  public static void printPyramid(int rows) {
    for (int i = 1; i <= rows; i++) {
      for (int space = 1; space <= 2 * (rows - i); space++) {
        System.out.print(" ");
      }
      for (int j = 1; j < 2 * i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static double betweenAngle(int h, int m) {
    if (h == 0 && m == 0) {
      return -1;
    }
    if (h == 12) {
      h = 0;
    }
    if (m == 60) {
      m = 0;
      h += 1;
    }
    double hoursAngle = (h * 60 + m) * 0.5;
    double minAngle = m * 6;
    double betweenAngle = Math.abs(hoursAngle - minAngle);
    return Math.min(360 - betweenAngle, betweenAngle);
  }

  public static void main(String[] args) {
    int[] a = new int[]{1, 2, 3, 8, 9, 10};
    int[] b = new int[]{4, 5, 6, 7};
    int[] result = new int[a.length + b.length];
    System.out.println(Arrays.toString(sotedMerge(a, b, result)));
    System.out.println(secondMaxOccurance("aabbbc"));
    System.out.println(numberOfFactorial(120));
    printPyramid(5);
    System.out.println(betweenAngle(3, 25));
    System.out.println("strawberries".substring(2,5));
    Integer x= 10,y=20;
    System.out.println(x.compareTo(y));
  }
}

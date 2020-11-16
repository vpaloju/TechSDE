package test;


import java.util.*;

public class Test {

  public static void printPascal(int n) {
    for (int line = 1; line <= n; line++) {
      int c = 1;
      for (int i = 1; i <= line; i++) {
        System.out.print(c+" ");
        c = c * (line - i) / i;
      }
      System.out.println();
    }
  }

  public static String test(String s, char c) {
    char[] a = s.toCharArray();
    int count = 0, j = 0;
    for (int i = j = 0; i < a.length; i++) {
      if (a[i] != c) {
        a[j++] = a[i];
      } else {
        count++;
      }
    }
    while (count > 0) {
      a[j++] = '\0';
      count--;
    }
    return new String(a);
  }

  public static int[] insertElementIntoSortedArray(int[] result, int length, int key) {
    int i;
    for (i = length - 1; i >= 0 && result[i] > key; i--) {
      result[i + 1] = result[i];
    }
    result[i + 1] = key;
    return result;
  }

  public static boolean isPalindrom(char[] s, int start, int end) {
    for (int i = start; i <= (start + end) / 2; i++) {
      if (s[i] != s[start + end - i]) {
        return false;
      }
    }
    return true;
  }

  public static String reverseString(String s, int start, int end) {
    char ch[] = s.toCharArray();
    while (start < end) {
      ch[start] ^= ch[end];
      ch[end] ^= ch[start];
      ch[start] ^= ch[end];
      start++;
      end--;
    }
    return new String(ch);
  }


  public static int[] test1(int[] a) {
    int n = a.length;
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < n; i++) {
      set.add(a[i]);
    }
    for (int i = 0; i < n; i++) {
      if (set.contains(i)) {
        a[i] = i;
      } else {
        a[i] = -1;
      }
    }
    return a;
  }

  public static void main(String[] args) {
    int a[] = new int[]{1, 2, 3, 4, 5, 9, 10, 8, 7};
    int A[] = {4, 2, 5, 1};
    int B[] = {8, 0, 5, 3};
    int K = 3;
    System.out.println(test("geeksforgeeks", 'g'));
    //System.out.println(test(a, 3));
    //System.out.println(Arrays.toString(test(a)));
    System.out.println(Arrays.toString(test1(a)));
    printPascal(5);
  }

  public static int[] reverse(int[] a, int s, int e) {
    while (s < e) {
      int temp = a[s];
      a[s] = a[e];
      a[e] = temp;
      s++;
      e--;
    }
    return a;
  }

  public static int[] movAllZerosToRight(int[] a) {
    int n = a.length, count = 0;
    for (int i = 0; i < n; i++) {
      if (a[i] != 0) {
        a[count++] = a[i];
      }
    }
    while (count < n) {
      a[count++] = 0;
    }
    return a;
  }

}

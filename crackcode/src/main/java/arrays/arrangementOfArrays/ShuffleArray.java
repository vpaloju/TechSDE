package arrays.arrangementOfArrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Shuffle a given array using Fisher–Yates shuffle Algorithm
 * Last Updated: 23-07-2019
 * Given an array, write a program to generate a random permutation of array elements. This question is also asked as “shuffle a deck of cards” or “randomize a given array”. Here shuffle means that every permutation of array element should equally likely.
 * <p>
 * shuffle-array
 * Let the given array be arr[]. A simple solution is to create an auxiliary array temp[] which is initially a copy of arr[]. Randomly select an element from temp[], copy the randomly selected element to arr[0] and remove the selected element from temp[]. Repeat the same process n times and keep copying elements to arr[1], arr[2], … . The time complexity of this solution will be O(n^2).
 * <p>
 * Fisher–Yates shuffle Algorithm works in O(n) time complexity. The assumption here is, we are given a function rand() that generates random number in O(1) time.
 * The idea is to start from the last element, swap it with a randomly selected element from the whole array (including last). Now consider the array from 0 to n-2 (size reduced by 1), and repeat the process till we hit the first element.
 * <p>
 * Following is the detailed algorithm
 * <p>
 * To shuffle an array a of n elements (indices 0..n-1):
 * for i from n - 1 downto 1 do
 * j = random integer with 0 <= j <= i
 * exchange a[j] and a[i]
 */
public class ShuffleArray {

  public static int[] randomisedArray(int[] a) {
    int n = a.length;
    Random random = new Random();
    for (int i = n - 1; i >= 0; i--) {
      //Generate random number between 0 - n
      int j = random.nextInt(i + 1);
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
    }
    return a;
  }

  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
    System.out.println(Arrays.toString(randomisedArray(a)));
  }

}

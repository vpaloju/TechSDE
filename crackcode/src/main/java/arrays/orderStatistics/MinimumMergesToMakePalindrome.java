package arrays.orderStatistics;

/**
 * ray A[] and a number x, check for pair in A[] with sum as x
 * Linear Search
 * Find minimum number of merge operations to make an array palindrome
 * Given an array of positive integers. We need to make the given array a ‘Palindrome’. The only allowed operation is”merging” (of two adjacent elements). Merging two adjacent elements means replacing them with their sum. The task is to find the minimum number of merge operations required to make the given array a ‘Palindrome’.
 * To make any array a palindrome, we can simply apply merge operation n-1 times where n is the size of the array (because a single-element array is always palindromic, similar to single-character string). In that case, the size of array will be reduced to 1. But in this problem, we are asked to do it in the minimum number of operations.
 * <p>
 * Example :
 * <p>
 * Input : arr[] = {15, 4, 15}
 * Output : 0
 * Array is already a palindrome. So we
 * do not need any merge operation.
 * <p>
 * Input : arr[] = {1, 4, 5, 1}
 * Output : 1
 * We can make given array palindrome with
 * minimum one merging (merging 4 and 5 to
 * make 9)
 * <p>
 * Input : arr[] = {11, 14, 15, 99}
 * Output : 3
 * We need to merge all elements to make
 * a palindrome.
 * The expected time complexity is O(n).
 */
public class MinimumMergesToMakePalindrome {

    public static int minOperations(int[] a) {
        int n = a.length - 1;
        int result = 0;
        for (int i = 0, j = n; i <= j; ) {
            if (a[i] == a[j]) {
                i++;
                j--;
            } else if (a[i] > a[j]) {
                j--;
                a[j] += a[j + 1];
                result++;
            } else {
                i++;
                a[i] += a[i - 1];
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int a[] = new int[]{11, 14, 15, 99};
        int b[] = new int[]{15, 4, 15};
        System.out.println("Count of minimum operations is " + minOperations(a));
        System.out.println("Count of minimum operations is " + minOperations(b));
    }
}

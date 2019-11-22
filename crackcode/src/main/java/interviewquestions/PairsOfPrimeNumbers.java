package interviewquestions;

import java.util.HashSet;
import java.util.Set;

/**
 * Print all pairs (sets) of prime numbers (p,q) such that p*q <= n, where n is given number.
 */
public class PairsOfPrimeNumbers {

    public static int[] primeNumbers(int n) {
        if (n < 2) {
            return null;
        }
        int[] result = new int[n];
        int index = 0;
        for (int i = 2; i <= n; i++) {
            if (PrimeNumber.isPrime(n)) {
                result[index] = i;
                index++;
            }
        }
        return result;
    }

    public static int[] getPairs(int[] a, int product) {
        Set<Integer> set = new HashSet<>();
        if (a.length < 2) {
            return null;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                if (product == 0) {
                    return new int[]{a[i], a[i + 1]};
                } else {
                    continue;
                }
            }
            if (product % a[i] == 0) {
                if (set.contains(product / a[i])) {
                    return new int[]{a[i], product / a[i]};
                } else {
                    set.add(a[i]);
                }
            }
        }
        return null;
    }
}

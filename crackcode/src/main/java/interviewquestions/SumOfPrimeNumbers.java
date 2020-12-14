package interviewquestions;

public class SumOfPrimeNumbers {

  public static int sumOfPrimeNumbers(int[] a) {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      if (PrimeNumber.isPrime(a[i])) {
        sum += a[i];
      }
    }
    return sum;
  }
}

package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PrintAllPrimesInRange {

  public static List printPrimeNumbers(int num) {
    List<Integer> primes = new ArrayList<>();
    IntStream.range(2, num).filter(n -> primes.parallelStream().noneMatch(i -> n % i == 0)).forEach(primes::add);
    return primes;
  }

  private boolean hasNoFactors(int number) {
    return IntStream.range(2, number)
      .noneMatch(i -> number % i == 0);
  }

  public static void main(String[] args) {
    printPrimeNumbers(100).stream().forEach(System.out::println);
  }
}

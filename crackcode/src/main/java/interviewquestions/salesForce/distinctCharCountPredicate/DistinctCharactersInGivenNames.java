package interviewquestions.salesForce.distinctCharCountPredicate;

import java.util.Arrays;
import java.util.List;

/**
 * Distinct Characters Count (Java Stream) In this challenge, use the Java Stream, Predicate, and Function to find the number of distinct characters in the given names which start with a given prefix. The complete implementation of CharactersCount class is given. It has the following two fields: name describes the name string. • distinctCharacterCount describes the number of distinct characters.
 * Create the following two classes:
 * Filter class with method Predicate<String> nameStartingWithPrefix(String prefix) that returns a predicate to check whether a name string starts with the given prefix or not.
 * Mapper class with method Function<String, CharactersCount> getDistinctCharactersCount() that returns a mapper function to return a CharactersCount class object that correspond to the given name string. The locked stub code in the editor validates the correctness of the Filter and Mapper classes implementation.
 */
public class DistinctCharactersInGivenNames {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("aaryanna", "aayanna", "airianna", "alassandra", "allanna", "allannah", "allessandra", "allianna", "allyanna", "anastaisa", "anastashia", "anastasia", "annabella", "annabelle", "annebelle");
    names.stream().filter(Filter.nameStartingWithPrefix("aa")).map(Mapper.getDistinctCharactersCount()).forEachOrdered(System.out::println);
  }
}

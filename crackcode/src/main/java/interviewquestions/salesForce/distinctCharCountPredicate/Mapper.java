package interviewquestions.salesForce.distinctCharCountPredicate;

import java.util.function.Function;

public class Mapper {

  public static Function<String, CharactersCount> getDistinctCharactersCount() {
    return s -> new CharactersCount(s, (int) s.chars().distinct().count());
  }

}

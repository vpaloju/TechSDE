import arrays.arrangementOfArrays.AllEvenToLeftOddsToRight;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllEvenToLeftOddsToRightTest {

  @Test
  public void testAllEvenToLeftOddsToRightTest() throws Exception {
    int[] inputArray = new int[]{1, 3, 4, 6, 12, 20, 9, 11, 13, 17};
    int[] outputArray = new int[]{4, 6, 12, 20, 1, 3, 9, 11, 13, 17};
    AllEvenToLeftOddsToRight allEvenToLeftOddsToRight = new AllEvenToLeftOddsToRight();
    Assert.assertEquals(allEvenToLeftOddsToRight.moveAllEvensToLeft(inputArray), outputArray);
  }
}

import arrays.arrangementOfArrays.AllEvenToLeftOddsToRight;
import org.junit.Assert;
import org.junit.Test;

public class AllEvenToLeftOddsToRightTest {

    @Test
    public void testAllEvenToLeftOddsToRightTest()throws Exception{
        int[] inputArray= new int[]{1,3,4,6,12,20,9,11,13,17};
        int[] outputArray=new int[]{4,6,12,20,1,3,9,11,13,17};
        AllEvenToLeftOddsToRight allEvenToLeftOddsToRight = new AllEvenToLeftOddsToRight();
        Assert.assertArrayEquals(allEvenToLeftOddsToRight.moveAllEvensToLeft(inputArray),outputArray);
    }
}

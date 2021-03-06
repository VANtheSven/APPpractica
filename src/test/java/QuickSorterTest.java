import Sorters.QuickSorter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sven_ on 03/03/2016.
 */
public class QuickSorterTest {
    int[] testArray = {8, 6, 0, 7, 5, 3, 1};
    int[] expectedResult = {0, 1, 3, 5, 6, 7, 8};
    @Before
    public void setup() {

    }

    @Test
    public void testSorter(){
        int[] actualResult = QuickSorter.sortArray(testArray);
        Assert.assertArrayEquals(actualResult, expectedResult);
    }
}

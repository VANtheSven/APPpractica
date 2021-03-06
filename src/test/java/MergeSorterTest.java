import Sorters.MergeSorter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sven_ on 03/03/2016.
 */
public class MergeSorterTest {
    int[] testArray = {8, 6, 0, 7, 5, 3, 1};
    int[] expectedResult = {0, 1, 3, 5, 6, 7, 8};

    @Before
    public void setup() {

    }

    @Test
    public void testSorter(){
        int[] actualResult = MergeSorter.sortArray(testArray);
        Assert.assertArrayEquals(actualResult, expectedResult);
    }
}

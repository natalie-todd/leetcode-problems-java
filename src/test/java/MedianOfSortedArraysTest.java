import addTwoNumbers.Solution;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class MedianOfSortedArraysTest {

    private MedianOfSortedArrays medianOfSortedArrays;

    @Before
    public void setUp() {
        medianOfSortedArrays = new MedianOfSortedArrays();
    }

    @Test
    public void findMedianSortedArrays_returnsMedian() {
        int[] array1 = new int[]{1, 3};
        int[] array2 = new int[]{2};

        medianOfSortedArrays = new MedianOfSortedArrays();

        double actual = medianOfSortedArrays.findMedianSortedArrays(array1, array2);

        assertThat(actual, equalTo(2.0));
    }
}
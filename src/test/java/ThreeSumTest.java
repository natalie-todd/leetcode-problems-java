import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import threeSum.ThreeSumSolution;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

@RunWith(MockitoJUnitRunner.class)
public class ThreeSumTest {
    private ThreeSumSolution threeSumSolution;

    @Before
    public void setUp() {
        threeSumSolution = new ThreeSumSolution();
    }

    @Test
    public void threeSum_returnsListOfLists_withSumsEqualingZero() {
        int[] given = new int[]{-1, 0, 1, 2, -1, -4};

        List<Integer> first = Arrays.asList(-1, 0, 1);

        List<Integer> second = Arrays.asList(-1, -1, 2);

        List<List<Integer>> expected = Arrays.asList(first, second);

        threeSumSolution = new ThreeSumSolution();

        List<List<Integer>> actual = threeSumSolution.threeSum(given);

        assertTrue(actual.size() == expected.size());
        assertTrue(actual.containsAll(expected));
        assertTrue(expected.containsAll(actual));
    }

    @Test
    public void threeSum_returnsListOfLists_withSumsEqualingZeroInput2() {
        int[] given = new int[]{-2,0,1,1,2};

        List<Integer> first = Arrays.asList(-2, 0, 2);

        List<Integer> second = Arrays.asList(-2, 1, 1);

        List<List<Integer>> expected = Arrays.asList(first, second);

        threeSumSolution = new ThreeSumSolution();

        List<List<Integer>> actual = threeSumSolution.threeSum(given);

        assertThat(actual, equalTo(expected));
    }

}

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

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

        assertThat(actual, equalTo(expected));
    }

}

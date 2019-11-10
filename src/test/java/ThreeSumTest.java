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

    @Test
    public void threeSum_returnsListOfLists_withSumsEqualingZero_largeInput() throws IOException {
        String fileName = "src/main/java/threeSum/input.txt";

        List<List<Integer>> expected = Arrays.asList(first, second);

        [[-99927,2246,97681],[-99927,12687,87240],[-99927,14861,85066],[-99927,17307,82620],[-99927,24208,75719],[-99927,25014,74913],[-99927,27134,72793],[-99927,33447,66480],[-99927,37446,62481],[-99927,40680,59247],[-99851,10093,89758],[-99851,11474,88377],[-99851,13483,86368],[-99851,14367,85484],[-99851,14848,85003],[-99851,16659,83192],[-99851,21412,78439],[-99851,21779,78072],[-99851,28095,71756],[-99851,33686,66165],[-99851,34153,65698],[-99851,35241,64610],[-99851,35368,64483],[-99851,39726,60125],[-99851,40887,58964],[-99851,42518,57333],[-99851,48050,51801],[-99822,21,99801],[-99822,12582,87240],[-99822,12741,87081],[-99822,13200,86622],[-99822,28007,71815],[-99822,34348,65474],[-99822,34557,65265],[-99822,35805,64017],[-99822,36095,63727],[-99822,46773,53049],[-99637,4508,95129],[-99637,11276,88361],[-99637,21395,78242],[-99637,21638,77999],[-99637,32506,67131],[-99637,37179,62458],[-99637,37906,61731],[-99637,39522,60115],[-99637,49277,50360],[-99583,46,99537],[-99583,6822,92761],...

        threeSumSolution = new ThreeSumSolution();

        List<List<Integer>> actual = threeSumSolution.threeSum(threeSumSolution.bigNum(fileName));

        assertThat(actual, equalTo(expected));
    }


}

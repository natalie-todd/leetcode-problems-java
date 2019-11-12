import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class NumberOfIslandsTest {
    private NumberOfIslands numberOfIslands;

    @Before
    public void setUp() {
        numberOfIslands = new NumberOfIslands();
    }

    @Test
    public void numberOfIslands_returnsCorrectNumberOfIslands() {
        char[][] theIsland = new char[][]{
                {1, 1, 1, 1, 0},
                {1, 1, 0, 1, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };

        numberOfIslands = new NumberOfIslands();

        int actual = (int) NumberOfIslands.numIslands(theIsland);

        assertThat(actual, equalTo(1));
    }
    @Test
    public void numberOfIslands_returnsCorrectNumberOfIslands_whenMultipleArePresent() {
        char[][] theIsland = new char[][]{
                {1,1,0,0,0},
                {1,1,0,0,0},
                {0,0,1,0,0},
                {0,0,0,1,1},
        };

        numberOfIslands = new NumberOfIslands();

        int actual = NumberOfIslands.numIslands(theIsland);

        assertThat(actual, equalTo(3));
    }

}
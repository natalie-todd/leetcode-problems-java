import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeSumSolution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int h = j + 1; h < nums.length; h++) {
                    if (nums[i] + nums[j] + nums[h] == 0) {
                        List<Integer> newAnswer = Arrays.asList(nums[i], nums[j], nums[h]);
                        Collections.sort(newAnswer);
                        result.add(newAnswer);
                    }
                }
            }
        }

        List<List<Integer>> dedupedResult = result.stream().distinct().collect(Collectors.toList());
        return dedupedResult;
    }
}

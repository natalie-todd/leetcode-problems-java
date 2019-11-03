import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeSumSolution {
    public List<List<Integer>> threeSum(int[] nums) {

//        List<Integer> intList = new ArrayList<Integer>(nums.length);
//        for (int i : nums)
//        {
//            intList.add(i);
//        }
  
        List<List<Integer>> result = new ArrayList<>();

        if(nums.length >= 3) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    for (int h = j + 1; h < nums.length; h++) {

                        if (nums[i] + nums[j] + nums[h] == 0) {
                            result.add(Arrays.asList(nums[i], nums[j], nums[h]));
                        }
                    }
                }
            }
        }

        List<List<Integer>> dedupedResult = result.stream()
                .map(eachList -> eachList.stream().sorted().collect(Collectors.toList()))
                .distinct().collect(Collectors.toList());
        return dedupedResult;
    }
}

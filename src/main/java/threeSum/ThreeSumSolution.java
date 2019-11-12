package threeSum;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeSumSolution {
    String fileName = "src/main/java/threeSum/input.txt.txt";

    public static int[] ex3 = new int[]{-3, 2, 1, 2, -1, -1};

    public static List<List<Integer>> threeSum(int[] nums) {

        List<Integer> intList = new ArrayList<Integer>(nums.length);
        for (int i : nums) {
            intList.add(i);
        }
        List<Integer> sortedList = intList.stream().sorted().collect(Collectors.toList());
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < sortedList.size() - 0; i++) {
            Integer l = 1;
            Integer r = sortedList.size() - 1;
            Integer x = i;
            while (l < r && x != r && x != l) {
                if (sortedList.get(x) + sortedList.get(l) + sortedList.get(r) == 0) {
                    List<Integer> oneAnswer = new ArrayList<>();
                    oneAnswer.add(sortedList.get(x));
                    oneAnswer.add(sortedList.get(l));
                    oneAnswer.add(sortedList.get(r));
                    result.add(oneAnswer.stream().sorted().collect(Collectors.toList()));
                    l = l + 1;
                    r = r - 1;
                } else if (sortedList.get(x) + sortedList.get(l) + sortedList.get(r) < 0) {
                    l = l + 1;
                } else if (sortedList.get(x) + sortedList.get(l) + sortedList.get(r) > 0) {
                    r = r - 1;
                }
            }
        }
        return result.stream().distinct().collect(Collectors.toList());
    }

    public int[] bigNum(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        List<Integer> list = new ArrayList<>();

        while ((line = br.readLine()) != null) {
            list.add(Integer.parseInt(line));
        }
        br.close();
        fr.close();

        int[] nums = new int[list.size()];

        for(int i = 0; i < list.size() -1; i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }

}

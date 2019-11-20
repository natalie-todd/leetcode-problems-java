import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MedianOfSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        List<Integer> totalNums = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++) {
            totalNums.add(nums1[i]);
        }

        for(int i = 0; i < nums2.length; i++) {
            totalNums.add(nums2[i]);
        }

        Collections.sort(totalNums);

        double answer = 0;

        if(totalNums.size() % 2 == 0) {
            int half = totalNums.size() / 2;
            int first = totalNums.get(half - 1);
            int second = totalNums.get(half);
            answer = (first + second) / 2.0;
        } else {
            int half = totalNums.size() / 2;
            answer = Double.valueOf(totalNums.get(half));
        }
        return answer;
    }
}

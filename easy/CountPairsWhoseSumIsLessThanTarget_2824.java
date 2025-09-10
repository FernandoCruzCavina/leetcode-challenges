package easy;

import java.util.Arrays;
import java.util.List;

public class CountPairsWhoseSumIsLessThanTarget_2824 {
    public static int countPairs(List<Integer> nums, int target) {
        int size = nums.size();
        int result = 0;

        for(int left = 0; left < size; left++){
            for(int right = left + 1; right < size; right++){
                int sum = nums.get(left) + nums.get(right);
                
                if(sum < target){
                    result++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(-1,1,2,3,1);
        int target = 2;
        System.out.println(countPairs(nums, target));
    }
}

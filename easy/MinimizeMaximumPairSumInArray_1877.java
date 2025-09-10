package easy;

import java.util.Arrays;

public class MinimizeMaximumPairSumInArray_1877 {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int left= 0;
        int right = nums.length - 1;
        int result = 0;

        while (left < right) {
            int average = (nums[left] + nums[right]);
            result = Math.max(average, result);
            
            left++;
            right--;
        }

        return result;
    }
}

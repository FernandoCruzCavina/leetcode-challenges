package medium;

import java.util.Arrays;

public class FindTriangularSumOfAnArray_2221 {
    public static int triangularSum(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        
        for (int steps = nums.length; steps > 1; steps--) {
            for(int i = 0; i < steps - 1; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
        }

        return nums[0];
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        System.out.println(triangularSum(nums));
    }
}

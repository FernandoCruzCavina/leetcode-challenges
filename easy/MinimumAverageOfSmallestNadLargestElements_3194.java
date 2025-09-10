package easy;

import java.util.Arrays;

public class MinimumAverageOfSmallestNadLargestElements_3194 {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length-1;
        double average = nums[right];

        while(left < right){
            average = Math.min(((nums[left]+nums[right])/2D) , average); 
            left++;
            right--;
        }

        return average;
    }
}

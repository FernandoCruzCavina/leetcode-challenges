package medium;

import java.util.Arrays;

public class ClosestThreeSum_16 {
    public static int threeSumClosest(int[] nums, int target) {
        int length = nums.length;
        int closestSum = 0, minDiff = Integer.MAX_VALUE/2;
        Arrays.sort(nums);

        for(int i = 0; i < length - 2; i++){
            int left = i + 1, right = length - 1;
            while (left < right) {
                int curSum = nums[left] + nums[i] + nums[right];
                int curDiff = Math.abs(curSum - target);
                
                if(curDiff < minDiff){
                    minDiff = curDiff;
                    closestSum = curSum;             
                }

                if(curSum < target){
                    left++;
                } else {
                    right--;
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        int[] nums = {-1000,-1000,-1000};
        int target = 10000;
        System.out.println(threeSumClosest(nums, target));
    }
}

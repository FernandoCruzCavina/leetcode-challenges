package easy;

import java.util.Arrays;

public class ContainsDuplicate_217 {
    public boolean containsDuplicate(int[] nums) {
        int size = nums.length;
        Arrays.sort(nums);

        for(int left = 0; left < size - 1; left++){
            if(nums[left] == nums[left + 1]){
                return true;
            }
        }

        return false;
    }
}

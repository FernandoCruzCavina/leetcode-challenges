package medium;

import java.util.HashMap;
import java.util.HashSet;

public class FindTheDuplicateNumber_287 {
    public static int findDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int size = nums.length;
        int result = 0;
        for(int i = 0; i < size; i++){
            if(!seen.contains(nums[i])){
                seen.add(nums[i]);
            } else {
                result = nums[i]; 
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
}

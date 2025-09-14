package easy;

import java.util.Arrays;

public class MajorityElement_169 {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int highAppearance = 0;
        int normalAppearance = 1;
        int majorityElement = 0;
        int lastNumber = 0;
        int size = nums.length;

        for(int i = 0; i < size; i++){
            if(nums[i] != lastNumber){
                lastNumber = nums[i];
                normalAppearance = 0;
            }

            normalAppearance++;
            
            if(normalAppearance > highAppearance ){
                highAppearance = normalAppearance;
                majorityElement = nums[i];
            }
        }

        return majorityElement;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}

package easy;

public class BuildArrayFromPermutation_1920 {
    public int[] buildArray(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];

        for(int i = 0; i < size; i++){
            result[i] = nums[nums[i]];
        }

        return result;
    }
}

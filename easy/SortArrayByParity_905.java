package easy;

public class SortArrayByParity_905 {
    public static int[] sortArrayByParity(int[] nums) {
        int left = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[left];
                nums[left] = nums[i];
                nums[i] = temp;
                left++;
            }
        }

        return nums; 
    }

    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(sortArrayByParity(nums));
    }
}

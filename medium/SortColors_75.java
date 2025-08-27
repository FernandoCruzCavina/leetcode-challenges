package medium;

public class SortColors_75 {
    public static void sortColors(int[] nums) {
        int length = nums.length;
        for(int left = 0; left < length - 1; left++){
            for(int right = left + 1; right < length; right++){
                if(nums[left] > nums[right]){
                    int temp = nums[right];
                    nums[right] = nums[left];
                    nums[left] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,0,2,1,1,0};
        sortColors(nums);
        System.out.println(nums.toString());
    }
}

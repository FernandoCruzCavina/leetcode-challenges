package easy;

public class MoveZeroes_283 {

    //[0,1,0,3,12]
    //
    //[1,3,12,0,0]
    public static void moveZeroes(int[] nums) {
        int size = nums.length;
        if(size > 1){
            int left = 0;

            for(; left < size; left++){
                if(nums[left] == 0){
                    break;
                }
            }

            int right = left + 1;

            while (left < right && right < size) {
                if(nums[right] != 0){
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp; 
                    left++;
                }

                right++;
            }
        }   
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(nums.toString());
    }
}

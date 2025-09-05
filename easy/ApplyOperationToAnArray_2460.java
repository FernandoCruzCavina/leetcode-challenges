package easy;

public class ApplyOperationToAnArray_2460 {
    public static int[] applyOperations(int[] nums) {
        int size = nums.length;
        
        for(int i = 0; i < size - 1; i++){
            if(nums[i] == nums[i + 1]){
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;  
            }
        }

        int left = 0;

        for(int right = 0; right < size; right++){
            if(nums[right] != 0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }

        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {312,312,436,892,0,0,528,0,686,516,
            0,0,0,0,0,445,445,445,445,445,445,984,984,984,
            0,0,0,0,168,0,0,647,41,203,203,241,241,0,628,
            628,0,875,875,0,0,0,803,803,54,54,852,0,0,0,9,
            58,195,590,300,126,0,0,523,523};
        System.out.println(applyOperations(nums));
    }
}

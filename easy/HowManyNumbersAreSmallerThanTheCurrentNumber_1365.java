package easy;

public class HowManyNumbersAreSmallerThanTheCurrentNumber_1365 {
     public int[] smallerNumbersThanCurrent(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];

        for(int i = 0; i < size; i++){
            int count = 0;
            for(int j = 0; j < size; j++){
                if(nums[i] > nums[j]) count++;
            }
            result[i] = count;
        }
        
        return result;
    }
}

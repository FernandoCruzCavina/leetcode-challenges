package easy;

public class NumberOfArithmeticTriplets_2367 {
    public static int arithmeticTriplets(int[] nums, int diff) {
        int size = nums.length;
        int result = 0;
        
        for(int i = 0; i < size; i++){
            int num1 = nums[i];
            
            for(int j = i + 1; j < size; j++){
                int num2 = nums[j];

                for(int k = j + 1; k < size; k++){
                    int num3 = nums[k];
                    if(num3 - num2 == diff && num2 - num1 == diff){
                        result++;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,8,9};
        int diff = 2;

        System.out.println(arithmeticTriplets(nums, diff));
    }
}

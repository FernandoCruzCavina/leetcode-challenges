package easy;

public class SquaresOfaSortedArray_977 {

    public static int[] sortedSquares(int[] nums) {
        int size = nums.length - 1;
        int left = 0, right = size;
        
        int[] result = new int[size + 1];

        while (left < right) {
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                result[size] = nums[left] * nums[left];
                left++;
            } else{
                result[size] = nums[right] * nums[right];
                right--;
            }
            size--;
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        sortedSquares(nums);
    }
}
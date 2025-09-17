package easy;

public class BinarySearch_704 {
    public int search(int[] nums, int target) {
        int size = nums.length;
        int low = 0;
        int high = size - 1;

        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                return mid;
            }

            if(target < nums[mid]){
                high = mid - 1;
            }

            if(target > nums[mid]){
                low = mid + 1;
            }
        }

        return -1;
    }
}

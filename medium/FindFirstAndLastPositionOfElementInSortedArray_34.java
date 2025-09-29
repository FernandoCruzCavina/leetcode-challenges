package medium;

public class FindFirstAndLastPositionOfElementInSortedArray_34 {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];

        result[0] = binarySearch(nums, target, true);
        result[1] = binarySearch(nums, target, false);

        return result;
    }

    private static int binarySearch(int[] nums, int target, boolean findFirst) {
        int left = 0, right = nums.length - 1, ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if(nums[mid] < target){
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                ans = mid;

                if (findFirst) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(searchRange(nums, target));
    }
}

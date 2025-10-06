package easy;

public class MaximumAverageSubarrayI_643 {

    public static double findMaxAverage(int[] nums, int k) {
        int left = 0, right = 0, n = nums.length, sum = 0;
        double result = Double.NEGATIVE_INFINITY;

        while (right < n) {
            sum+=nums[right];

            if (right >= (k - 1)) {
                double average = (double) sum / k;
                if (average > result) {
                    result = average;
                }
                sum-=nums[left];
                left++;
            }

            right++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }
}
package medium;

public class CountNumberOfNiceSubarrays_1248 {

    public int numberOfSubarrays(int[] nums, int k) {
        int result = 0, i = 0, count = 0;
        
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] % 2 == 1) {
                k--;
                count = 0;
            }
            
            while (k == 0) {
                k += nums[i++] & 1;
                count++;
            }
            
            result += count;
        }
        
        return result;
    }
}
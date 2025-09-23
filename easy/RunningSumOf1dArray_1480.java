package easy;

public class RunningSumOf1dArray_1480 {

  public int[] runningSum(int[] nums) {
    int sum = 0, index = 0;  

    for (int i : nums) {
      sum += i;
      nums[index] = sum;
      index++;
    }

    return nums;
  }
}

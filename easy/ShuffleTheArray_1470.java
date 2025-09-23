package easy;

public class ShuffleTheArray_1470 {
  public int[] shuffle(int[] nums, int n) {
    int[] result = new int[nums.length];
    int index = -1;

    for (int i = 0; i < n; i++) {
      result[index] = nums[i];
      index++;
      result[index] = nums[n + i];
      index++;
    }

    return result;
  }
}

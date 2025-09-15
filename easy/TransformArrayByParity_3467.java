package easy;

public class TransformArrayByParity_3467 {

  public static int[] transformArray(int[] nums) {
    int size = nums.length;
    int even = 0; 
    int[] result = new int[size];

    for (int i = 0; i < size; i++) {
      if (nums[i] % 2 == 0) {
        even++;
      }
    }

    for (int i = even; i < size; i++) {
      result[i] = 1;
    }

    return result;
  }

  public static void main(String[] args) {

    int[] nums = {4,3,2,1};
    System.out.println(transformArray(nums));
  }
}

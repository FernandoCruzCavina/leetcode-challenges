package easy;

public class FindMinimumOperationstoMakeAllElementsDivisibleByThree_3190 {

  public int minimumOperations(int[] nums) {
    int count = 0;


    for (int i : nums) {
      if(i % 3 != 0){
        count++;
      }
    }

    return count;
  }
}

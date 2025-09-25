package easy;

import java.util.HashSet;

public class ContainsDuplicateII_219 {

  public boolean containsNearbyDuplicate(int[] nums, int k) {
    HashSet<Integer> numList = new HashSet<>();
    int left = 0;

    for (int i = 0; i < nums.length; i++) {
      while (numList.contains(nums[i])) {
        if(nums[left] == nums[i] && Math.abs(i - left) <= k){
          return true;
        }

        numList.remove(nums[left]);
        left++;
      
      }
      numList.add(nums[i]);  
    }
    return false;
  }
}

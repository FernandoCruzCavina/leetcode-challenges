package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans  = new ArrayList<Integer>();
        HashSet<Integer> hs = new HashSet<Integer>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            hs.add(nums[i]);
        }

        for (int i = 1; i <= n; i++) {
            if (!hs.contains(i)) {
                ans.add(i);
            }
        }
        
        return ans;
    }
}

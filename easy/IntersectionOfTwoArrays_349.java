package easy;

import java.util.HashSet;

public class IntersectionOfTwoArrays_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s = new HashSet<>();
        for (Integer i : nums1) {
            s.add(i);
        }
        
        HashSet<Integer> res = new HashSet<>();
        for (Integer i : nums2) {
            if (s.contains(i)) {
                res.add(i);
                s.remove(i);
            }
        }

        int[] ans = new int[res.size()];
        int i = 0;
        for (Integer num : res) {
            ans[i++] = num;
        }
        return ans;
    }    
}

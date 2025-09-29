package easy;

import java.util.Arrays;

public class LongestCommonPrefix_14 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last  = strs[strs.length - 1];
        int size = Math.min(first.length(), last.length());
        
        for (int i = 0; i < size; i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }

            ans.append(first.charAt(i));
        }

        return ans.toString();
    }
}

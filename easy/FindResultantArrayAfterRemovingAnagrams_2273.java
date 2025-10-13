package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindResultantArrayAfterRemovingAnagrams_2273 {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        result.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            char[] a = words[i].toCharArray(), b = result.get(result.size() - 1).toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if (!Arrays.equals(a, b)) {
                result.add(words[i]);
            }
        }
        return result;
    }
}

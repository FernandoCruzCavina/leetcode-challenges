package medium;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters_3 {

  public int lengthOfLongestSubstring(String s) {
    HashSet<Character> uniqueChar = new HashSet<>();
    int left = 0;
    int result = 0;

    for (int right = 0; right < s.length(); right++) {
      char c = s.charAt(right);
      while (uniqueChar.contains(c)) {
        uniqueChar.remove(s.charAt(left));
        left++;
      }

      uniqueChar.add(c);
      result = Math.max(result, right - left + 1);
    }

    return result;
  }
}

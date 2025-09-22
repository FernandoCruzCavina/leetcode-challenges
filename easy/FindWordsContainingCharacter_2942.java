package easy;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter_2942 {

  public List<Integer> findWordsContaining(String[] words, char x) {
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < words.length; i++) {
      int size = words[i].length();
      for(int j = 0; j < size; j++){
        if (words[i].charAt(j) == x) {
          result.add(i);
          break;
        }
      }
    }

    return result;
  }
}

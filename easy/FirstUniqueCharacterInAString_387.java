package easy;

import java.util.ArrayList;
import java.util.List;

public class FirstUniqueCharacterInAString_387 {
    public static int firstUniqChar(String s) {
        char[] letters = s.toCharArray();
        List<Character> repteatedChar = new ArrayList<>();
        int size = letters.length;

        for(int left = 0; left < size; left++){
            boolean isRepeatChar = false;

            for(int i = 0; i < repteatedChar.size(); i++){
                if(letters[left] == repteatedChar.get(i)){
                    isRepeatChar = true;
                    break;       
                }
            }
            
            if(!isRepeatChar){
                for(int right = left + 1; right < size; right++){
                    if(letters[left] == letters[right]){
                        isRepeatChar = true;
                        repteatedChar.add(letters[left]);
                        break;
                    }
                }
            }
            
            if(!isRepeatChar){
                return left;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("aabb"));
    }
}

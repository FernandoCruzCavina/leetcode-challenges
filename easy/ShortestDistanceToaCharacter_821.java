package easy;

import java.util.ArrayList;
import java.util.List;

public class ShortestDistanceToaCharacter_821 {
    public static int[] shortestToChar(String s, char c) {
        int size = s.length(), index = 0;
        List<Integer> posOfC = new ArrayList<>();
        int[] result = new int[size];

        for(int i = 0; i < size; i++){
            if(s.charAt(i) == c){
                posOfC.add(i);
            }
        }

        int sizeOfC = posOfC.size();
        
        if(sizeOfC >= 2){
            for(int j = 0; j < size; j++){
                int distance1 = Math.abs(posOfC.get(index) - j);
                int distance2 = Math.abs(posOfC.get(index + 1) - j);
                if(distance2 == 0 && index != sizeOfC - 2){
                    index++;
                } 
                result[j] = Math.min(distance1, distance2);
            }
        } else {
            for(int j = 0; j < size; j++){
                int distance1 = Math.abs(posOfC.get(index) - j);
                result[j] = distance1;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';
        System.out.println(shortestToChar(s, c));
    }
}

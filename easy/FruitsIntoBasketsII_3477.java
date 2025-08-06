package easy;

import java.util.ArrayList;
import java.util.List;

public class FruitsIntoBasketsII_3477 {
    public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int insufficientCapacityNum = 0;
        List<Integer> availablePosition = new ArrayList<>();
        
        for(int i = 0; i < baskets.length; i++){
            availablePosition.add(i);
        }

        for(int i = 0; i < fruits.length; i++) {
            boolean placed = false;

            for(int j = 0; j < availablePosition.size(); j++) {
                int basketIndex = availablePosition.get(j);
                if(fruits[i] <= baskets[basketIndex]) {
                    availablePosition.remove(j);
                    placed = true;
                    break;
                }
            }

            if(!placed) {
                insufficientCapacityNum++;
            }
        }

        return insufficientCapacityNum;
    }
    public static void main(String[] args) {
        int[] fruits = {4,2,5};
        int[] baskets = {3,5,4};
        System.out.println(numOfUnplacedFruits(fruits, baskets));
    }
}

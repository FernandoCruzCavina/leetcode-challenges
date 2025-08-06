package medium;

public class FruitIntoBaskets_904 {
    public static int totalFruit(int[] fruits) {
        if(fruits.length<=2){
            return fruits.length;
        }

        int totalFruits = 2;
        int totalVar = 2;

        int numberRef1 = fruits[0];
        int numberRef2 = fruits[1];
        
        for(int i = 2; i < fruits.length; i++){
            if(fruits[i] == numberRef1 || fruits[i] == numberRef2 || numberRef1==numberRef2){
                totalVar++;
                if(numberRef1==numberRef2){
                    numberRef2 = fruits[i];
                }
            } else {
                if(totalVar>totalFruits){
                    totalFruits = totalVar;
                }
                totalVar = 2;
    
                numberRef1 = fruits[i - 1];
                numberRef2 = fruits[i];
                for(int k=2; k < i; k++){
                    if(fruits[(i - k)]!=numberRef1){
                        break;
                    }
                    totalVar++;
                }
            }
        }
        if(totalVar>totalFruits){
            totalFruits = totalVar;
        }
        return totalFruits;
    }

    public static void main(String[] args) {
        int[] fruits = {1,0,1,4,1,4,1,2,3};
        System.out.println(totalFruit(fruits));
    }
}

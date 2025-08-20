package easy;

public class Largest3SameDigitNumberinString_2264 {
    public static String largestGoodInteger(String num) {
        if(num.length() < 3){
            return "";
        }
        int countRep = 0;
        int goodInteger = -10;
        int prevInteger = 10;
        
        for(int i = 0; i < num.length(); i++){
            int value = Integer.valueOf(String.valueOf(num.charAt(i)));
            if(prevInteger == value){
                countRep++;
                if(countRep == 3){
                    int ref = Integer.valueOf(String.valueOf(num.charAt(i - 1)));
                    if(ref > goodInteger){
                        goodInteger = ref;
                    }
                }
            } else {
                prevInteger = value;
                countRep = 1;
            }
        }
        if(goodInteger == 10){
            return "";
        }

        String result = String.valueOf(goodInteger);
        return result + result + result;
    }

    public static void main(String[] args) {
        String num = "6777133339";

        System.out.println(largestGoodInteger(num));
    }
}
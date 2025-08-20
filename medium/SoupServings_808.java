package medium;

public class SoupServings_808 {
    public static double soupServings(int n) {
        double factor = 0;

        for (int i = 0; i < 4; i++) {
            int soupA = n - (100 - (25 * i));
            int soupB = n - (25 * i);

            if(soupA == 0){
                if(soupA < soupB){
                    factor += 1;
                }
                if(soupA == soupB){
                    factor += 0.5;
                }
                if(soupA > soupB){
                
                }
            }

        }

        return 0.25 * factor;
    }

    public static void main(String[] args) {
        System.out.println(soupServings(50));
    }
}

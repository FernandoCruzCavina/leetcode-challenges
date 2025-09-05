package easy;

public class FindClosestPerson_3156 {
    public int findClosest(int x, int y, int z) {
        int closeCaseA = Math.abs(z - x);
        int closeCaseB = Math.abs(z - y);
        
        if(closeCaseA > closeCaseB){
            return 2;
        } else if(closeCaseA == closeCaseB){
            return 0;
        }
        return 1;
    }
}

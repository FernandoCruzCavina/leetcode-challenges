package easy;

import java.util.Arrays;

public class MinimumNumberOfMovesToSeatEveryone_2037 {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int n=seats.length;
        int sum=0;
        
        for(int i=0;i<n;i++){
            sum += Math.abs(seats[i]-students[i]);
        }
        
        return sum;
    }
}

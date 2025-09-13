package medium;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections_986 {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int []> result = new ArrayList<>();

        int i = 0, j = 0;
        int sizeOfFirstList = firstList.length;
        int sizeOfSecondList = secondList.length;

        while( i < sizeOfFirstList && j < sizeOfSecondList){
            int start= Math.max(firstList[i][0],secondList[j][0]);
            int end= Math.min(firstList[i][1],secondList[j][1]);

            if(start <= end){
                result.add(new int[]{start,end});
            }

            if(firstList[i][1] < secondList[j][1]){
                i++;
            }else{
                j++;
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}

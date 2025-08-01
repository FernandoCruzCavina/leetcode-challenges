package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle_118 {
    public static List<List<Integer>> generate(int numRows) {
        if(numRows<=0){
            return new ArrayList<>();
        }
        if(numRows==1){
            List<List<Integer>> result = new ArrayList<>();
            result.add(Arrays.asList(1));
            return result;
        }
        if(numRows==2){
            List<List<Integer>> result = new ArrayList<>();
            result.add(Arrays.asList(1));
            result.add(Arrays.asList(1, 1));
            return result;
        }
        
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1));
        result.add(Arrays.asList(1,1));
        List<Integer> actualRow = Arrays.asList(1,1);
        
        for(int i=2;i<numRows;i++){
            List<Integer> nextRow = new ArrayList<>();
            nextRow.add(1);

            for(int j=0;j<(actualRow.size() - 1);j++){
                int sum = actualRow.get(j) + actualRow.get(j + 1);
                nextRow.add(sum);
            }

            nextRow.add(1);
            result.add(nextRow);
            actualRow = nextRow;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(generate(4).toString());
    }
}

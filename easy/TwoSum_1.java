package easy;

import java.util.stream.IntStream;

public class TwoSum_1 {
    
    public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        int attemps = nums.length;
        int i, result;

        for(i=0; attemps>i; i++){
            for(int y=0; attemps>y; y++){
                if (i != y) { 
                    result = nums[i] + nums[y];
                    if (result == target) {
                        answer[0] = i;
                        answer[1] = y;
                        return answer;
                    }
                }
            }
        }
        return answer;
    }

    public static int[] twoSumWithStreams(int[] nums, int target) {
        return IntStream.range(0, nums.length)
            .boxed()
            .flatMap(i -> IntStream.range(i + 1, nums.length)
                .filter(y -> nums[i] + nums[y] == target)
                .mapToObj(y -> new int[]{i,y}))
            .findFirst()
            .get();
    }

    public static void main(String[] args) {
        int[] test = {3,2,4};
        twoSum(test, 6);
    }
}

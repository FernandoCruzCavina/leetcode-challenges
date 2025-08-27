package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum_18 {

    // aparently this not works because in {2,2,2,2,2} exist 5 combinations but in reality so have 1 combination possible
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int length = nums.length;
        List<List<Integer>> allCombinationEqualsToTarget = new ArrayList<>();

        for(int i = 0; i < length - 3; i++){
            for(int j = i + 1; j < length - 2; j++){
                for(int k = j + 1; k < length - 1; k++){
                    for(int l = k + 1; l < length; l++){ 
                        int curSum = nums[i] + nums[j] + nums[k] + nums[l]; 
                        if(curSum == target){
                            allCombinationEqualsToTarget.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        }
                    }
                }
            }
        }

        return allCombinationEqualsToTarget;
    }

    public List<List<Integer>> fSum(int[] nums, int target) {
        List<List<Integer>> li=new ArrayList<>();
        if(nums==null || nums.length<4){
            return li;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1&&nums[j]==nums[j-1]){
                    continue;
                }
                int left=j+1; int right=nums.length-1;
                while(left<right){
                    long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        li.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        while(left<right&&nums[left]==nums[left+1]){
                            left++;
                        }
                        while(left<right&&nums[right]==nums[right+-1]){
                            right--;
                        }
                        left++;
                        right--;
                    }else if(sum<target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return li;
    }



    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        System.out.println(fourSum(nums, target));
    }
}

package easy;

public class RmDuplicatesFromSortedArray_26 {
    public static int removeDuplicates(int[] nums) {
        int reminder=-1000;
        int repititionCount=0;
        int uniqueNumbers=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] != reminder){
                reminder = nums[i];
                nums[(i - repititionCount)] = reminder;
                uniqueNumbers++;
            } else {
                repititionCount++;
            }
        }
        return uniqueNumbers;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}

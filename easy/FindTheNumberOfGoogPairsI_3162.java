package easy;

public class FindTheNumberOfGoogPairsI_3162 {
    public static int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;

        for (int n1 : nums1) {
            for (int n2 : nums2) {
                if (n1 % (n2 * k) == 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,4,12};
        int[] nums2 = {2,4};
        int k = 3;
        System.out.println(numberOfPairs(nums1, nums2, k));
    }
}

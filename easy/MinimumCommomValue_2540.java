package easy;

public class MinimumCommomValue_2540 {

  public int getCommon(int[] nums1, int[] nums2){
    int j = 0, k = 0;

    while (j < nums1.length && k < nums2.length) {
      if(nums1[j] == nums2[k]){
        return nums2[k];
      }
      if(nums1[j] < nums2[k]){
        j++;
      } else {
        k++;
      }
    }

    return -1;
  }
}

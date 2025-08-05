package hard;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MedianOfTwoSortedArrays_4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double[] mergedLists = IntStream.concat(IntStream.of(nums1), IntStream.of(nums2)).asDoubleStream().toArray();
        Arrays.sort(mergedLists);
        int pos = mergedLists.length;

        if(pos==1){
            return mergedLists[0];
        }

        if(pos%2==0){
            pos = (pos / 2) - 1;
            double median1 = mergedLists[pos];
            double median2 = mergedLists[pos + 1];
            return (median1 + median2) / 2;
        }else{
            pos = ((pos - 1) / 2);
            return mergedLists[pos];
        }
    }

    public static void main(String[] args) {

        int[] sum1 = {1,3};
        int[] sum2 = {2};
        System.out.println(findMedianSortedArrays(sum1,sum2));
    }
}

package easy;

public class FindTheDistanceValueBetweenTwoArrays_1385 {
    private static boolean isWithInDistance(int[] arr2,int num1, int d) {
        for(int i=0,j=arr2.length-1;i<=j;i++,j--){
            if(Math.abs(arr2[i]-num1)<=d || Math.abs(arr2[j]-num1)<=d  ){
                return false;
            }
        }
        return true;
    }
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        for(int i=0;i<arr1.length;i++){
            if(isWithInDistance(arr2,arr1[i],d)){
                count++;
            }
        }
        return count;
    }   

    public static void main(String[] args) {
        int[] arr1 = {2,1,100,3};
        int[] arr2 = {-5,-2,10,-3,7};

        System.out.println(findTheDistanceValue(arr1, arr2, 6));
    }
}

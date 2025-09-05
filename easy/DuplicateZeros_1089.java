package easy;

public class DuplicateZeros_1089 {
    public static void duplicateZeros(int[] arr) {
        int size = arr.length;
        int numZeros = 0;

        for(int num : arr){
            if (num == 0) {
                numZeros++;
            }
        } 
        
        for(int i = size - 1; i >= 0; i--){
            if(arr[i] == 0){
                numZeros--;
            }
            int j = i + numZeros;
            if((j) < size){
                arr[j] = arr[i];
            }
            if(arr[i] == 0 && j + 1 < size){
                arr[j + 1] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
    }
}

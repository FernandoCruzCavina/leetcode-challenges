package easy;

public class SumOfAllOddLengthSubarrays_1588 {
    public int sumOddLengthSubarrays(int[] arr) {
        int result = 0, size = arr.length;

        for (int i = 0; i < size; i++) {
            result += ((i + 1) * (size - i) + 1) / 2 * arr[i];
        }

        return result;
    }
}

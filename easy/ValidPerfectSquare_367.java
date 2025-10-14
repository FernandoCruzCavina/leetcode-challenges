package easy;

public class ValidPerfectSquare_367 {
    public boolean isPerfectSquare (int num) {
        if (num < 2){
            return true;
        }

        int left = 0, right = num / 2;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            double square = (double) mid * mid;

            if (square == num) {
                return true;
            }
            if (square < num) {
                left = mid + 1;
            }
            if (square > num) {
                right = mid - 1;
            }
        }

        return false;
    }
}

package easy;

public class SqrtX_69 {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int left = 1, right = x/2;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            double square = (double) mid * mid;

            if (square == x) {
                return mid;
            } 
            if (square < x) {
                left = mid + 1;
            }
            if (square > x) {
                right = mid - 1;
            }
        }

        return right;
    }
}

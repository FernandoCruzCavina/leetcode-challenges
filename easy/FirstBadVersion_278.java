package easy;

public class FirstBadVersion_278 {
    public static boolean isBadVersion (int version) {
        //it just for example
        return true;
    }

    public int firstBadVersion(int n) {
        int left = 1, right = n;

        while (left <= right) {
            int mid = left - (right - left) / 2;
            
            if (isBadVersion(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}

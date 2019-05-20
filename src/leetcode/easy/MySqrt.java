package leetcode.easy;

public  class MySqrt {

    public static int mySqrt(int x) {

        int L = 1, R = x;

        int ans = 0;

        while (L <= R) {
            int mid = (L + R)  / 2;
            int div = x / mid;
            if (div == mid) {
                ans = mid;
                return ans;
            } else if (mid < div) {
                ans = mid;
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(MySqrt.mySqrt(4));
    }

}

package leetcode;

/**
 * 202. Happy Number
 * https://leetcode.com/problems/happy-number/
 */
public class HappyNumber {

    public static boolean isHappy(int n){
        if (n <= 0) return false;

        while (n >= 10) {
            int sum = 0;
            while (n != 0) {
                sum += (n%10)*(n%10);
                n /= 10;
            }
            n = sum;
            System.out.println(n);
        }
        return n == 1 || n == 7;
    }


    public static void main(String[] args) {
       boolean b =  HappyNumber.isHappy(315465);
        System.out.println(b);
    }

}

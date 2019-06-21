package leetcode.array;

/**
 * 509. Fibonacci Number
 * https://leetcode.com/problems/fibonacci-number/
 */
public class FibonacciNumber {

    public int fib(int N) {
        if (N == 1) return 1;
        if (N == 2) return 2;
        return fib(N - 2) + fib(N - 1);
    }
}

}

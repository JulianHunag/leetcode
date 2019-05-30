package leetcode.queue;

import java.util.PriorityQueue;

/**
 * 返回数据流中的第k大元素
 * 703 https://leetcode.com/problems/kth-largest-element-in-a-stream/
 * 使用优先队列解决
 */
public class KthLargest {

    final PriorityQueue<Integer> q;
    final int k;

    public KthLargest(int k, int[] a) {
        this.k = k;
        q = new PriorityQueue<>(k);
        for (int n : a) {
            add(n);
        }
    }

    public int add(int n) {

        if (q.size() < k)
            q.offer(n);
         else if (q.peek() < n) {
            q.poll();
            q.offer(n);
        }

        return q.peek();
    }


    public static void main(String[] args) {
        int k = 3;
        int[] arr = {4, 5, 8, 2};
        KthLargest kthLargest = new KthLargest(k, arr);

        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(5));
        System.out.println(kthLargest.add(10));
        System.out.println(kthLargest.add(9));
        System.out.println(kthLargest.add(4));

    }


}

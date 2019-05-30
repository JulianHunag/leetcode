package leetcode;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

/**
 * 找出滑动窗口数组中的最大值
 * 239 https://leetcode.com/problems/sliding-window-maximum/
 * <p>
 * 如果新来的值比队列尾部的数小，那就追加到后面，因为它可能在前面的最大值划出窗口后成为最大值
 * 如果新来的值比尾部的大，那就删掉尾部，再追加到后面
 * 如果追加的值比的索引跟队列头部的值的索引超过窗口大小，那就删掉头部的值
 * 每次队列的头都是滑动窗口中值最大的
 * <p>
 * 滑动窗口的最大值总是保存在队列首部，队列里面的数据总是从大到小排列
 */
public class MaxSlidingWindow {

    public int[] maxSlidingWindow(int[] nums, int k) {

        if(nums.length == 0) return new int[0];


        ArrayList<Integer> res = new ArrayList<>();


        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {

            if (!deque.isEmpty()) {
                //如果队列头元素不在滑动窗口中了，就删除头元素
                if (i >= deque.peek() + k) {
                    deque.pop();
                }
                // 如果当前数字大于队列尾，则删除队列尾，直到当前数字小于等于队列尾，或者队列空
                while (!deque.isEmpty() && nums[i] >= nums[deque.getLast()]) {
                    deque.removeLast();
                }
            }
            //入队
            deque.offer(i);

            // 滑动窗口经过一个滑动窗口的大小，就获取当前的最大值，也就是队列的头元素
            if (i + 1 >= k) {
                res.add(nums[deque.peek()]);
            }
        }


        int[] r = new int[res.size()];

        for (int i = 0; i <r.length ; i++) {
            r[i] = res.get(i);
        }

        return r;

    }


}

package leetcode.easy.stack;

import java.util.Stack;

/**
 * https://leetcode.com/problems/implement-queue-using-stacks/
 */
public class MyQueue {

     Stack<Integer> inputStack = new Stack<>();
     Stack<Integer> outputStack = new Stack<>();

    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        inputStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        peek();
        return outputStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(outputStack.empty())
        while (!inputStack.empty()){
            outputStack.push(inputStack.pop());
        }

        return outputStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
       return inputStack.empty() && outputStack.empty();
    }


    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        int param_2 = obj.peek();
        obj.push(3);
        int param_3 = obj.pop();
        int param_5 = obj.pop();
        int param_6 = obj.pop();
        boolean param_4 = obj.empty();

        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);

    }

}

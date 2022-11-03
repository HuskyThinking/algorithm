package net.husky.queue;

import java.util.Stack;

/**
 * @author: dingxin.li
 * @date: 2022/11/2 19:37
 * @description:
 */
class MyQueue {

    Stack<Integer> stackIn;
    Stack<Integer> stackOut;

    /** Initialize your data structure here. */
    public MyQueue() {
        // 负责进栈
        stackIn = new Stack<>();
        // 负责出栈
        stackOut = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     * 将一个元素放入队列的尾部
     * */
    public void push(int x) {
       stackIn.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     * 从队列首部移除元素
     * */
    public int pop() {
        dumpstackIn();
        return stackOut.pop();
    }

    /**
     * Get the front element.
     * 返回队列首部的元素
     * */
    public int peek() {
        dumpstackIn();
        return stackOut.peek();
    }

    /**
     * Returns whether the queue is empty.
     * 返回队列是否为空
     * */
    public boolean empty() {
        return stackIn.empty() && stackOut.empty();
    }

    /**
     * 如果stackOut为空，那么将stackIn中的元素全部放到stackOut中
     */
    private void dumpstackIn(){
        if (!stackOut.empty()){
            return;
        }
        while(!stackIn.empty()){
            stackOut.push(stackIn.pop());
        }
    }
}

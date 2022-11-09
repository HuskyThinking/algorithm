package net.husky.stack;

import java.util.Stack;

/**
 * @author: dingxin.li
 * @date: 2022/11/8 9:28
 * @description:
 */
public class LeetCode150 {

    public static void main(String[] args) {
        String[] target =  {"4", "13", "5", "/", "+"};
        int husky = evalRPN(target);
        System.out.println(husky);
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        for (String s : tokens) {
            if ("+".equals(s)) {
                stack.push(stack.pop() + stack.pop());
            } else if ("-".equals(s)) {
                stack.push(-stack.pop() + stack.pop());
            } else if ("*".equals(s)) {
                stack.push(stack.pop() * stack.pop());
            } else if ("/".equals(s)) {
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2 / temp1);
            } else {
                stack.push(Integer.valueOf(s));
            }
        }
        return stack.pop();
    }

}

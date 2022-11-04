package net.husky.stack;

import java.util.Stack;

/**
 * @author: dingxin.li
 * @date: 2022/11/4 16:41
 * @description:
 */
public class LeetCode020 {


    public static boolean isValid(String s) {
        Stack<Character> temp = new Stack<>();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            //碰到左括号，就把相应的右括号入栈
            if (ch == '(') {
                temp.push(')');
            }else if (ch == '{') {
                temp.push('}');
            }else if (ch == '[') {
                temp.push(']');
            } else if (temp.isEmpty() || temp.peek() != ch) {
                return false;
            }else {//如果是右括号判断是否和栈顶元素匹配
                temp.pop();
            }
        }
        return temp.empty();
    }

}

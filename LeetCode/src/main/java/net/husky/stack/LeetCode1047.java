package net.husky.stack;

import java.util.Stack;

/**
 * @author: dingxin.li
 * @date: 2022/11/4 17:20
 * @description:
 */
public class LeetCode1047 {

    public static void main(String[] args) {
        String a = removeDuplicates("annaca");
        System.out.println(a);
    }

    public static String removeDuplicates(String s) {
        Stack<Character> temp = new Stack<>();
        StringBuilder target = new StringBuilder();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (temp.empty()){
                temp.push(ch);
            } else {
               if (temp.peek() == ch) {
                   temp.pop();
               } else {
                   temp.push(ch);
               }
            }
        }
        while (!temp.empty()) {
            target.append(temp.pop());
        }
        return target.reverse().toString();
    }

}

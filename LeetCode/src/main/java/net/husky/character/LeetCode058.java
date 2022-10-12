package net.husky.character;

import java.util.Arrays;

/**
 * @author: dingxin.li
 * @date: 2022/10/12 14:24
 * @description: 058.左旋转字符串
 */
public class LeetCode058 {
    /**
     * https://leetcode.cn/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
     * 剑指Offer58-II.左旋转字符串
     *     字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。
     * 比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
     * 示例 1：
     * 输入: s = "abcdefg", k = 2
     * 输出: "cdefgab"
     *
     * @param args
     */
    public static void main(String[] args) {
        String str = "abcdefg";
        int n = 2;
        String target = reverseLeftWordsOne(str, n);
        System.out.println(target);
    }

    /**
     * 1. 反转区间为前n的子串
     * 2. 反转区间为n到末尾的子串
     * 3. 反转整个字符串
     *
     * @param s
     * @param n
     * @return
     */
    public static String reverseLeftWordsOne(String s, int n) {
        int length = s.length();
        char chars[] = s.toCharArray();
        chars = reverseWord(chars, 0, n - 1);
        chars = reverseWord(chars, n, length - 1);
        chars = reverseWord(chars, 0, length - 1);

        return String.copyValueOf(chars);
    }

    private static char[] reverseWord(char[] chars, int begin, int end) {
        int i = begin;
        int j = end;
        while (i < j) {
            char temp = chars[i];
            chars[i++] = chars[j];
            chars[j--] = temp;
        }
        return chars;
    }


}

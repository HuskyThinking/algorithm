package net.husky.character;

import sun.security.util.Length;

/**
 * @author: dingxin.li
 * @date: 2022/10/10 18:52
 * @description: 151. 反转字符串中的单词
 */
public class LeetCode151 {

    public static void main(String[] args) {

    }

    /**
     * @param s
     * @return
     */
    public String reverseWordsOne(String s) {
        char[] chars = s.toCharArray();
        // 翻转字符数组
        reverse(chars, 0, s.length() - 1);
        int begin = 0;
        int end = 0;
        // 翻转单个单词
        int i = 0;
        int j = 0;
        while (i < chars.length) {
            while (i < chars.length && chars[i] == ' ') {
                i += 1;
            }
            j = i;
            while (j < chars.length && chars[j] != ' ') {
                j += 1;
            }
            reverse(chars, i, j);
        }

        // 去除多余空格
        return chars.toString();
    }

    /**
     * 翻转字符串
     *
     * @param chars
     * @param begin
     * @param end
     */
    public void reverse(char[] chars, int begin, int end) {
        for (int i = begin, j = end; i <= j; i++, j++) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
    }

    /**
     * 清除多余空格
     */
    public void cleanSpace(char[] chars){
        int i = 0;
        int j = 0;
        while (j < chars.length){
            while (j < chars.length && chars[j] == ' '){
                j += 1;
            }
            while (j < chars.length && chars[j] != ' '){
                chars[i] = chars[j];
                i += 1;
                j += 1;
            }
            while(j < chars.length && chars[j] == ' '){
                j += 1;
            }
            if(j < chars.length){
                chars[i] = ' ';
                i += 1;
            }
        }
    }
}

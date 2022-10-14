package net.husky.character;

import java.util.Arrays;

/**
 * @author: dingxin.li
 * @date: 2022/10/12 15:08
 * @description: 28. 实现 strStr()
 */
public class LeetCode028 {


    /**
     * https://leetcode.cn/problems/find-the-index-of-the-first-occurrence-in-a-string/
     * 28. 实现 strStr()
     * KMP算法
     * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串
     * 出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
     * <p>
     * 示例 1: 输入: haystack = "hello", needle = "ll" 输出: 2
     * 示例 2: 输入: haystack = "aaaaa", needle = "bba" 输出: -1
     *
     * @param args
     */
    public static void main(String[] args) {
        String haystack = "aabaabaafa";
        String needle = "aabaaf";
        String needle1 = "issip";
        strStr(haystack, needle);
//        System.out.println(Arrays.toString(getNext(needle1.toCharArray())));
//        System.out.println(strStr(haystack, needle));
    }


    public static int strStr(String haystack, String needle) {

        char haystacks[] = haystack.toCharArray();
        char needles[] = needle.toCharArray();
        int next[] = getNextOne(needles);
        int retNum = -1;
        for (int i = 0, j = 0; i < haystacks.length; i++) {
            char a = haystacks[i];
            char b = needles[j];
            if (a == b) {
                if (j == needles.length - 1) {
                    retNum = i - j;
                    break;
                }
                if (j < needles.length - 1) {
                    j++;
                }
            } else {
                if (j != 0) {
                    j = next[j - 1];
                    --i;
                }
            }
        }

        return retNum;
    }

    /**
     * 获取前缀表(自己写的)
     *
     * @param chars
     * @return
     */
    public static int[] getNextOne(char[] chars) {
        int next[] = new int[chars.length];
        for (int end = chars.length - 1; end > 0; end--) {
            int temp = end;
            int count = 0;
            for (int begin = 0; begin < temp; begin++) {
                if (chars[begin] == chars[temp]) {
                    temp--;
                    count++;
                } else {
                    break;
                }
            }
            next[end] = count;
        }
        return next;
    }

    /**
     * 获取前缀表
     * 前缀表（不减一）
     * @param next
     * @param s
     */
    private void getNext(int[] next, String s) {
        int j = 0;
        next[0] = 0;
        for (int i = 1; i < s.length(); i++) {
            while (j > 0 && s.charAt(j) != s.charAt(i)) {
                j = next[j - 1];
            }
            if (s.charAt(j) == s.charAt(i)) {
                j++;
            }
            next[i] = j;
        }
    }
}

package net.husky.hash;

/**
 * @author: dingxin.li
 * @date: 2022/10/13 16:07
 * @description: 242.有效的字母异位词
 */
public class LeetCode242 {

    /**
     * 242.有效的字母异位词
     *
     * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
     * 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。
     *
     * @param args
     */
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println('z'-'a');
        System.out.println('a'-'a');
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        int[] record = new int[26];
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i) - 'a');
            record[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            record[t.charAt(i) - 'a']--;
        }

        for (int count: record) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

}

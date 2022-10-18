package net.husky.hash;


/**
 * @author: dingxin.li
 * @date: 2022/10/18 14:30
 * @description: 383. 赎金信
 */
public class LeetCode383 {

    public static void main(String[] args) {

    }

    public boolean canConstruct(String ransomNote, String magazine) {
        Boolean resp = true;
        int[] record = new int[26];
        for (char c : magazine.toCharArray()) {
            record[c - 'a'] += 1;
        }
        for (char c : ransomNote.toCharArray()) {
            record[c - 'a'] -= 1;
        }
        for (int i : record) {
            if (i < 0) {
                resp = false;
            }
        }

        return resp;
    }

}

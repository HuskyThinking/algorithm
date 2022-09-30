package net.husky.character;

/**
 * @author: dingxin.li
 * @date: 2022/9/30 15:45
 * @description: 344. 反转字符串
 */
public class LeetCode344 {

    public static void main(String[] args) {

    }

    public void reverseStringOne(char[] s) {
        int j = s.length - 1;
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            if (i == j){
                return;
            }
        }
    }

    public void reverseStringTwo(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }

}

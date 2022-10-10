package net.husky.character;

/**
 * @author: dingxin.li
 * @date: 2022/9/30 15:46
 * @description: 05.替换空格
 */
public class LeetCode005 {

    public static void main(String[] args) {

    }

    private static String replaceSpace(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        //扩充空间，空格数量2倍
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                str.append("  ");
            }
        }
        //若是没有空格直接返回
        if (str.length() == 0) {
            return s;
        }
        //有空格情况 定义两个指针
        //左指针：指向原始字符串最后一个位置
        int left = s.length() - 1;
        s += str.toString();
        //右指针：指向扩展字符串的最后一个位置
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        while (left >= 0) {
            if (chars[left] == ' ') {
                chars[right--] = '0';
                chars[right--] = '2';
                chars[right] = '%';
            } else {
                chars[right] = chars[left];
            }
            left--;
            right--;
        }
        return new String(chars);
    }

}

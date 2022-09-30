package net.husky.array;

/**
 * @author: dingxin.li
 * @date: 2022/9/30 15:33
 * @description: 209. 长度最小的子数组
 */
public class LeetCode209 {

    /**
     * 209. 长度最小的子数组
     * 给定一个含有 n 个正整数的数组和一个正整数 target
     * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。
     * 如果不存在符合条件的子数组，返回 0
     */
    public static void main(String[] args) {
        System.out.println();
    }

    /**
     *
     * 暴力算法
     *
     */
    private static int minSubArrayLenOne(int s, int[] nums) {
        int resp = 0;
        return resp;
    }

    /**
     * 滑动窗口
     *
     */
    private static int minSubArrayLenTwo(int s, int[] nums) {
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= s) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

}

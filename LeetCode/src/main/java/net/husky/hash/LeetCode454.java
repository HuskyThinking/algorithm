package net.husky.hash;

import java.util.HashMap;

/**
 * @author: dingxin.li
 * @date: 2022/10/17 19:08
 * @description: 454.四数相加II
 */
public class LeetCode454 {

    /**
     *
     * 给定四个包含整数的数组列表 A , B , C , D ,计算有多少个元组 (i, j, k, l) ，使得 A[i] + B[j] + C[k] + D[l] = 0
     * 为了使问题简单化，所有的 A, B, C, D 具有相同的长度 N，且 0 ≤ N ≤ 500 。所有整数的范围在 -2^28 到 2^28 - 1 之间，
     * 最终结果不会超过 2^31 - 1 。
     * @param args
     */
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {-2, -1};
        int[] nums3 = {-1, 2};
        int[] nums4 = {0, 2};
        System.out.println(fourSumCount(nums1,nums2,nums3,nums4));
    }

    /**
     * 首先定义 一个unordered_map，key放a和b两数之和，value 放a和b两数之和出现的次数。
     * 遍历大A和大B数组，统计两个数组元素之和，和出现的次数，放到map中。
     * 定义int变量count，用来统计 a+b+c+d = 0 出现的次数。
     * 在遍历大C和大D数组，找到如果 0-(c+d) 在map中出现过的话，就用count把map中key对应的value也就是出现次数统计出来。
     * 最后返回统计值 count 就可以了
     *
     * @param nums1
     * @param nums2
     * @param nums3
     * @param nums4
     * @return
     */
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int temp;
        int count = 0;
        //统计两个数组中的元素之和，同时统计出现的次数，放入map
        for (int i : nums1) {
            for (int j : nums2) {
                temp = i + j;
                if (map.containsKey(temp)) {
                    map.put(temp, map.get(temp) + 1);
                } else {
                    map.put(temp, 1);
                }
            }
        }
        //统计剩余的两个元素的和，在map中找是否存在相加为0的情况，同时记录次数
        for (int i : nums3) {
            for (int j : nums4) {
                temp = i + j;
                if (map.containsKey(0 - temp)) {
                    count += map.get(0 - temp);
                }
            }
        }
        return count;
    }

}

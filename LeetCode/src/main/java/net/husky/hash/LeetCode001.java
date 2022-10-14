package net.husky.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author: dingxin.li
 * @date: 2022/10/14 11:08
 * @description: 1. 两数之和
 */
public class LeetCode001 {

    public static void main(String[] args) {

    }

    public static int[] twoSumOne(int[] nums, int target) {
        int[] respInt = new int[1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++){
                if (target == nums[i] + nums[j]){
                    respInt[0] = i;
                    respInt[1] = j;
                }
            }
        }
        return respInt;
    }

    public static int[] twoSumTwo(int[] nums, int target) {
        int[] res = new int[2];
        if(nums == null || nums.length == 0){
            return res;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                res[1] = i;
                res[0] = map.get(temp);
            }
            map.put(nums[i], i);
        }
        return res;
    }

}

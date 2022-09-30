package net.husky.array;

/**
 * @author: dingxin.li
 * @date: 2022/9/30 15:31
 * @description: 27. 移除元素
 */
public class LeetCode027 {

    /**
     * 27. 移除元素
     * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
     * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并原地修改输入数组。
     *
     * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
     *
     * 示例 1: 给定 nums = [3,2,2,3], val = 3, 函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
     * 你不需要考虑数组中超出新长度后面的元素。
     *
     * 示例 2: 给定 nums = [0,1,2,2,3,0,4,2], val = 2, 函数应该返回新的长度 5,
     * 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
     *
     */
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 2;
        System.out.println(removeElementOne(nums,val));
//        System.out.println(removeElementTwo(nums,val));
    }

    /**
     * 暴力解法
     * 一个for循环遍历数组元素 ，第二个for循环更新数组
     */
    private static int removeElementOne(int[] nums, int val) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] == val) {
                for (int j = i + 1; j < length; j++) {
                    nums[j - 1] = nums[j];
                }
                i--;
                length--;
            }

        }
        return length;
    }

    /**
     * 双指针法
     * 快指针：寻找新数组的元素 ，新数组就是不含有目标元素的数组
     * 慢指针：指向更新 新数组下标的位置
     */
    private static int removeElementTwo(int[] nums, int val) {
        int length = nums.length;
        int slow = 0;
        for (int fast = 0; fast < length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }

}

package husky.base;

/**
 * @ClassName: LeetCode035
 * @Description: 035. 搜索插入位置
 * @Author: Fisher
 * @Date: 2022/9/25 16:25
 **/
public class LeetCode035 {


    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9};
        int target = 8;
        System.out.println(searchInsert(nums, target));
    }

    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     * <p>
     * 请必须使用时间复杂度为 O(log n) 的算法。
     *
     * 核心：在一个有序数组中找第一个大于等于target的下标
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] > target) {
                // 在一个有序数组中找第一个大于等于target的下标
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return right + 1;
    }

}

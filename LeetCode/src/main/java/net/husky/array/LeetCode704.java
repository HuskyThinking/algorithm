package net.husky.array;

/**
 * @ClassName: LeetCode704
 * @Description: 704. 二分查找
 * @Author: Fisher
 * @Date: 2022/9/25 14:15
 **/
public class LeetCode704 {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
//        System.out.println(searchOne(nums, target));
        System.out.println(searchTwo(nums, target));
    }

    /**
     * 1. 左闭右闭区间
     *
     * @param nums
     * @param target
     * @return
     */
    private static int searchOne(int[] nums, int target) {
        int resp = -1;
        if (target < nums[0] && target > nums[nums.length - 1]) {
            return resp;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                // target 在右区间，所以[middle + 1, right]
                left = mid + 1;
            } else if (nums[mid] > target) {
                // target 在左区间，所以[left, middle - 1]
                right = mid - 1;
            }
        }
        return resp;
    }

    /**
     * 1. 左闭右开区间
     *
     * @param nums
     * @param target
     * @return
     */
    private static int searchTwo(int[] nums, int target) {
        int resp = -1;
        if (target < nums[0] && target > nums[nums.length - 1]) {
            return resp;
        }
        int left = 0;
        int right = nums.length - 1;
        // 因为left == right的时候，在[left, right)是无效的空间，所以使用 <
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                // target 在右区间，所以[middle + 1, right)
                left = mid + 1;
            } else if (nums[mid] > target) {
                // target 在左区间，所以[left, middle)
                right = mid;
            }
        }
        return resp;
    }

    /**
     * 2022.11.15 二刷
     *  未及时退出，没有思考到左闭右闭区间这个方向，left与right的增减
     *  midlle的计算
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ret = -1;
        while(left < right){
            int middle = (left + right) / 2;
            int temp = nums[middle];
            if(temp > target) {
                right = middle;
            } else if(temp < target) {
                left = middle;
            } else {

                ret = middle;
            }
        }
        return ret;
    }

}

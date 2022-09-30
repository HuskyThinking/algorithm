package net.husky.array;

/**
 * @author: dingxin.li
 * @date: 2022/9/30 15:32
 * @description: 59. 螺旋矩阵II
 */
public class LeetCode059 {

    /**
     * 给定一个正整数 n，生成一个包含 1 到 n^2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
     */
    public static void main(String[] args) {

    }

    private int[][] generateMatrix(int n) {
        // 控制循环次数
        int loop = 0;
        int[][] res = new int[n][n];
        // 每次循环的开始点(start, start)
        // 定义填充数字
        int start = 0;
        int count = 1;
        int i, j;

        // 判断边界后，loop从1开始
        while (loop++ < n / 2) {
            // 模拟上侧从左到右
            for (j = start; j < n - loop; j++) {
                res[start][j] = count++;
            }

            // 模拟右侧从上到下
            for (i = start; i < n - loop; i++) {
                res[i][j] = count++;
            }

            // 模拟下侧从右到左
            for (; j >= loop; j--) {
                res[i][j] = count++;
            }

            // 模拟左侧从下到上
            for (; i >= loop; i--) {
                res[i][j] = count++;
            }
            start++;
        }

        if (n % 2 == 1) {
            res[start][start] = count;
        }
        return res;
    }

}

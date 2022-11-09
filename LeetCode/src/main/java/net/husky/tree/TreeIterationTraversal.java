package net.husky.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author: dingxin.li
 * @date: 2022/11/9 18:02
 * @description:
 */
public class TreeIterationTraversal {

    /**
     * 二叉树的前序遍历（中左右）
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> target = new ArrayList<>();
        if (root == null) {
            return target;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            target.add(node.val);
            if (node.right != null){
                stack.push(node.right);
            }
            if (node.left != null){
                stack.push(node.left);
            }
        }
        return target;

    }

}

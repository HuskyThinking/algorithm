package net.husky.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: dingxin.li
 * @date: 2022/11/9 16:34
 * @description: 94、145、144
 */
public class TreeRecursionTraversal {

    public static void main(String[] args) {

    }

    /**
     * 二叉树的前序遍历（中左右）
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> target = new ArrayList<>();
        preorder(root, target);
        return target;

    }
    public static void preorder(TreeNode tree, List<Integer> target) {
        if (tree == null) {
            return;
        }
        target.add(tree.val);
        preorder(tree.left, target);
        preorder(tree.right, target);
    }

    /**
     * 二叉树的中序遍历（左中右）
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> target = new ArrayList<>();
        inorder(root, target);
        return target;
    }

    public static void inorder(TreeNode tree, List<Integer> target) {
        if (tree == null) {
            return;
        }
        inorder(tree.left, target);
        target.add(tree.val);
        inorder(tree.right, target);
    }

    /**
     * 二叉树的后序遍历（左右中）
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> target = new ArrayList<>();
        postorder(root, target);
        return target;
    }

    public static void postorder(TreeNode tree, List<Integer> target) {
        if (tree == null) {
            return;
        }
        postorder(tree.left, target);
        postorder(tree.right, target);
        target.add(tree.val);
    }

}

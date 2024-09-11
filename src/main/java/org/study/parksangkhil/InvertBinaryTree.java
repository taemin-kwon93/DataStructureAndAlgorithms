package org.study.parksangkhil;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        swapTree(root);
        return root;
    }

    public void swapTree(TreeNode node) {
        if (node == null) return;

        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;

        swapTree(node.left);
        swapTree(node.right);
    }
}

package org.study.parksangkhil;

public class BalancedBinaryTree {
    public boolean isBalancedTree(TreeNode root) {
        return dfs(root) != -1;
    }

    public int dfs(TreeNode node) {
        if (node == null) return 0;
        int leftHeight = dfs(node.left);
        int rightHeight = dfs(node.right);

        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1)
            return -1;
        return 1 + Math.max(leftHeight, rightHeight);
    }
}

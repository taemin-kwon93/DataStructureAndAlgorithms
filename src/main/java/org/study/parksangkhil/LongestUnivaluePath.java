package org.study.parksangkhil;

public class LongestUnivaluePath{
    private int value = 0;

    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return this.value;
    }

    private int dfs(TreeNode node) {
        if (node == null)
            return 0;
        int left = dfs(node.left);
        int right = dfs(node.right);


        if (node.left != null && node.val == node.left.val)
            left += 1;
        else
            left = 0;


        if (node.right != null && node.val == node.right.val)
            right += 1;
        else
            right = 0;

        this.value = Math.max(this.value, left + right);
        return Math.max(left, right);
    }
}

package org.study.parksangkhil;

public class RangeSumOfBST {
    int value = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;
        if (root.val >= low && root.val <= high) value += root.val;
        rangeSumBST(root.left, low, high);
        rangeSumBST(root.right, low, high);
        return value;
    }
}

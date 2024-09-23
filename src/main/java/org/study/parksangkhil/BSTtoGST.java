package org.study.parksangkhil;

/**
 * <p> Given the root of a Binary Search Tree (BST),
 * convert it to a Greater Tree such that every key of the original
 * BST is changed to the original key plus the sum of all keys greater
 * than the original key in BST.</p>
 * <p> GST: Greater Sum Tree </p>
 */
public class BSTtoGST {
    int value = 0;
    public TreeNode bstToGst(TreeNode root) {
        return copyTree(root);
    }

    public TreeNode copyTree(TreeNode node) {
        if (node != null) {
            copyTree(node.right);
            value += node.val;
            node.val = value;
            copyTree(node.left);
        }

        return node;
    }
}

package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBinaryTreeTest {
    private BalancedBinaryTree balancedBinaryTree;

    @BeforeEach
    void setUp() {
        balancedBinaryTree = new BalancedBinaryTree();
    }

    @Test
    void itShouldReturnTrueWhenTreeIsBalanced() {
        TreeNode n5 = new TreeNode(5);
        TreeNode n4 = new TreeNode(4);
        TreeNode n3 = new TreeNode(6);
        TreeNode n2 = new TreeNode(2, n4, n5);
        TreeNode root = new TreeNode(1, n2, n3);

        boolean result = balancedBinaryTree.isBalancedTree(root);

        assertTrue(result);
    }

    @Test
    void itShouldReturnFalseWhenTreeIsNotBalanced() {
        TreeNode n9 = new TreeNode(5);
        TreeNode n8 = new TreeNode(5);
        TreeNode n7 = new TreeNode(5, n8, n9);
        TreeNode n6 = new TreeNode(5);
        TreeNode n5 = new TreeNode(5, n6, n7);
        TreeNode n4 = new TreeNode(4);
        TreeNode n3 = new TreeNode(6);
        TreeNode n2 = new TreeNode(2, n4, n5);
        TreeNode root = new TreeNode(1, n2, n3);

        boolean result = balancedBinaryTree.isBalancedTree(root);

        assertFalse(result);
    }
}
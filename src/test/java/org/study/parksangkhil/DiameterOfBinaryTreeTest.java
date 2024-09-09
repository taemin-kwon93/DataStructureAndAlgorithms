package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiameterOfBinaryTreeTest {
    private DiameterOfBinaryTree diameterOfBinaryTree;

    @BeforeEach
    void setUp() {
        diameterOfBinaryTree = new DiameterOfBinaryTree();
    }
    @Test
    void diameterOfBinaryTree() {
        TreeNode n5 = new TreeNode(5);
        TreeNode n4 = new TreeNode(4);
        TreeNode n3 = new TreeNode(6);
        TreeNode n2 = new TreeNode(2, n4, n5);
        TreeNode root = new TreeNode(1, n2, n3);

        int expected = 3;

        int result = diameterOfBinaryTree.diameterOfBinaryTree(root);

        assertEquals(expected, result);
    }
}
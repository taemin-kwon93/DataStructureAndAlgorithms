package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthOfTreeTest {
    private MaximumDepthOfTree maximumDepthOfTree;
    private static final TreeNode n7 = new TreeNode(7);
    private static final TreeNode n6 = new TreeNode(15);
    private static final TreeNode n5 = new TreeNode();
    private static final TreeNode n4 = new TreeNode();
    private static final TreeNode n3 = new TreeNode(20, n6, n7);
    private static final TreeNode n2 = new TreeNode(9, n4, n5);
    private static final TreeNode root = new TreeNode(3, n2, n3);
    private static final int expected = 3;

    @BeforeEach
    void setUp() {
        maximumDepthOfTree = new MaximumDepthOfTree();
    }

    @Test
    void depthCounter() {
        int result = maximumDepthOfTree.depthCounter(root);

        assertEquals(expected, result);
    }

    @Test
    void maxDepth() {
        int result = maximumDepthOfTree.maxDepth(root);
        assertEquals(expected, result);
    }
}
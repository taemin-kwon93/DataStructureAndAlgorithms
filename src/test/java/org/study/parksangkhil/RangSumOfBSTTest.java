package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangSumOfBSTTest {
    private RangeSumOfBST rangeSumOfBST;

    @BeforeEach
    void setUp() {
        rangeSumOfBST = new RangeSumOfBST();
    }

    @Test
    void rangeSumBST() {
        TreeNode n5 = new TreeNode(18);
        TreeNode n4 = new TreeNode(7);
        TreeNode n3 = new TreeNode(3);
        TreeNode n2 = new TreeNode(15, null, n5);
        TreeNode n1 = new TreeNode(5, n3, n4);
        TreeNode root = new TreeNode(10, n1, n2);

        int result = rangeSumOfBST.rangeSumBST(root, 6, 15);

        assertEquals(32, result);
    }
}
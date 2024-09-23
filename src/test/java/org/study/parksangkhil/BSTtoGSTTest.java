package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BSTtoGSTTest {
    private BSTtoGST bstToGST;

    @BeforeEach
    void setUp() {
        bstToGST = new BSTtoGST();
    }

    @Test
    void bstToGst() {
        TreeNode n5 = new TreeNode(8);
        TreeNode n4 = new TreeNode(7, null, n5);
        TreeNode n3 = new TreeNode(5);
        TreeNode n2 = new TreeNode(6, n3, n4);
        TreeNode n1 = new TreeNode(1);
        TreeNode root = new TreeNode(4, n1, n2);

        TreeNode result = bstToGST.bstToGst(root);

        assertEquals(30, result.val);
        assertEquals(21, result.right.val);
        assertEquals(31, result.left.val);
        assertEquals(26, result.right.left.val);
        assertEquals(15, result.right.right.val);
        assertEquals(8, result.right.right.right.val);
    }
}
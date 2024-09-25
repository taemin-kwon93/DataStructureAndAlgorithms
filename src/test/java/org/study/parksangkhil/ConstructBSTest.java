package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructBSTest {
    private ConstructBS constructBS;

    @BeforeEach
    void setUp() {
        constructBS = new ConstructBS();
    }

    @Test
    void buildTree() {
        int[] preorder = {1, 2, 4, 5, 3, 6, 7, 9, 8};
        int[] inorder = {4, 2, 5, 1, 7, 9, 6, 8, 3};

        TreeNode n9 = new TreeNode(9);
        TreeNode n8 = new TreeNode(8);
        TreeNode n7 = new TreeNode(7, null, n9);
        TreeNode n6 = new TreeNode(6, n7, n8);
        TreeNode n5 = new TreeNode(5);
        TreeNode n4 = new TreeNode(4);
        TreeNode n3 = new TreeNode(3, n6, null);
        TreeNode n2 = new TreeNode(2, n4, n5);
        TreeNode expected = new TreeNode(1, n2, n3);

        TreeNode result = constructBS.buildTree(preorder, inorder);

        assertTrue(areTreesEqual(expected, result));
    }

    // 두 트리가 동일한 구조와 값을 가지고 있는지 확인하는 헬퍼 메서드
    private boolean areTreesEqual(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        if (t1.val != t2.val) return false;

        return areTreesEqual(t1.left, t2.left) && areTreesEqual(t1.right, t2.right);
    }
}
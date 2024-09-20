package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertArrToBSTTest {
    private ConvertArrToBST convArrToBST;

    @BeforeEach
    void setUp() {
        convArrToBST = new ConvertArrToBST();
    }

    @Test
    void sortedArrayToBST() {
        int[] nums = {-10, -7, -3, 0, 5, 7, 9};
        TreeNode result = convArrToBST.sortedArrayToBST(nums);

        TreeNode n6 = new TreeNode(9);
        TreeNode n5 = new TreeNode(5);
        TreeNode n4 = new TreeNode(-3);
        TreeNode n3 = new TreeNode(-10);
        TreeNode n2 = new TreeNode(7, n5, n6);
        TreeNode n1 = new TreeNode(-7, n3, n4);
        TreeNode expected = new TreeNode(0, n1, n2);

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
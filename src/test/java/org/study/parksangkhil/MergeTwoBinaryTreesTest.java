package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoBinaryTreesTest {
    private MergeTwoBinaryTrees mergeTwoBinaryTrees;

    @BeforeEach
    void setUp() {
        mergeTwoBinaryTrees = new MergeTwoBinaryTrees();
    }

    @Test
    void mergeTrees() {
        // 첫 번째 트리 설정
        TreeNode n5 = new TreeNode(5);
        TreeNode n3 = new TreeNode(3, n5, null);
        TreeNode n2 = new TreeNode(2);
        TreeNode root1 = new TreeNode(1, n3, n2);

        // 두 번째 트리 설정
        TreeNode m4 = new TreeNode(4);
        TreeNode m1 = new TreeNode(1);
        TreeNode m7 = new TreeNode(7);
        TreeNode m3 = new TreeNode(3, m1, m7);
        TreeNode root2 = new TreeNode(2, m4, m3);

        // 병합 실행
        TreeNode result = mergeTwoBinaryTrees.mergeTrees(root1, root2);

        // 기대하는 병합 트리 설정
        TreeNode e6 = new TreeNode(7);
        TreeNode e5 = new TreeNode(1);
        TreeNode e4 = new TreeNode(5);
        TreeNode e3 = new TreeNode(5, e5, e6);
        TreeNode e2 = new TreeNode(7, e4, null);
        TreeNode expected = new TreeNode(3, e2, e3);

        // 결과 트리와 기대하는 트리 비교
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
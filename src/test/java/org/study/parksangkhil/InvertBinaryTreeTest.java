package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvertBinaryTreeTest {
    private InvertBinaryTree invertBinaryTree;

    @BeforeEach
    void setUp() {
        invertBinaryTree = new InvertBinaryTree();
    }

    @Test
    void invertTree() {
        // 원본 트리 설정
        TreeNode n7 = new TreeNode(7);
        TreeNode n6 = new TreeNode(6);
        TreeNode n5 = new TreeNode(5);
        TreeNode n4 = new TreeNode(4);
        TreeNode n3 = new TreeNode(3, n6, n7);
        TreeNode n2 = new TreeNode(2, n4, n5);
        TreeNode root = new TreeNode(1, n2, n3);

        // 트리 뒤집기
        TreeNode result = invertBinaryTree.invertTree(root);

        // 기대하는 트리의 결과 설정 (뒤집힌 트리)
        TreeNode en7 = new TreeNode(7);
        TreeNode en6 = new TreeNode(6);
        TreeNode en5 = new TreeNode(5);
        TreeNode en4 = new TreeNode(4);
        TreeNode en3 = new TreeNode(3, en7, en6);
        TreeNode en2 = new TreeNode(2, en5, en4);
        TreeNode expectedRoot = new TreeNode(1, en3, en2);

        // 트리가 올바르게 뒤집혔는지 확인
        assertTrue(areTreesEqual(result, expectedRoot));
    }

    // 두 트리가 동일한 구조와 값을 가지고 있는지 확인하는 헬퍼 메서드
    private boolean areTreesEqual(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        if (t1.val != t2.val) return false;

        return areTreesEqual(t1.left, t2.left) && areTreesEqual(t1.right, t2.right);
    }
}
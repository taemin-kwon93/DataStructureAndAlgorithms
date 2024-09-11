package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestUnivaluePathTest {
    private LongestUnivaluePath longestUnivaluePath;

    @BeforeEach
    void setUp() {
        longestUnivaluePath = new LongestUnivaluePath();
    }

    @Test
    void longestUnivaluePath() {
        TreeNode n5 = new TreeNode(5);
        TreeNode n4 = new TreeNode(1);
        TreeNode n3 = new TreeNode(2);
        TreeNode n2 = new TreeNode(1, n4, n5);
        TreeNode root = new TreeNode(1, n2, n3);

        int result = longestUnivaluePath.longestUnivaluePath(root);

        assertEquals(2, result);
    }
}
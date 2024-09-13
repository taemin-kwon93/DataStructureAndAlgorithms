package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SerializeAndDeserializeTest {
    private SerializeAndDeserialize serializeAndDeserialize;
    @BeforeEach
    void setUp() {
        serializeAndDeserialize = new SerializeAndDeserialize();
    }

    @Test
    void serialize() {
        // 트리 구조 생성
        TreeNode n5 = new TreeNode(5);
        TreeNode n4 = new TreeNode(4);
        TreeNode n3 = new TreeNode(3, null, n5);
        TreeNode n2 = new TreeNode(2, n4, null);
        TreeNode root = new TreeNode(1, n2, n3);

        // serialize 호출
        String result = serializeAndDeserialize.serialize(root);

        // 기대하는 직렬화된 결과값
        String expected = "1, 2, 3, 4, , , 5, , , , , ";

        // 결과 검증
        assertEquals(expected, result);
    }

    @Test
    void deserialize() {
        // 직렬화된 문자열 생성
        String data = "1, 2, 3, 4, , , 5, , , , , ";

        // deserialize 호출
        TreeNode result = serializeAndDeserialize.deserialize(data);

        // 트리 복원 후 결과 검증
        assertNotNull(result);
        assertEquals(1, result.val);
        assertEquals(2, result.left.val);
        assertEquals(3, result.right.val);
        assertEquals(4, result.left.left.val);
        assertNull(result.left.right);
        assertNull(result.right.left);
        assertEquals(5, result.right.right.val);
    }
}
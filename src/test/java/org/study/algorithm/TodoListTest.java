package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoListTest {
    private TodoList todoList;

    @BeforeEach
    void setUp() {
        todoList = new TodoList();
    }

    @Test
    void solution() {
        String[] a = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] b = {true, false, true, false};
        String[] expected = {"practiceguitar", "studygraph"};

        String[] result = todoList.solution(a, b);

        assertArrayEquals(expected, result);
    }

}
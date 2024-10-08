package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {
    private Trie trie;

    @BeforeEach
    void setUp() {
        trie = new Trie();
    }

    @Test
    void insert() {
        trie.insert("apple");
        assertTrue(trie.search("apple"));   // returns true
        assertFalse(trie.search("app"));    // returns false
    }

    @Test
    void startWiths() {
        trie.insert("apple");
        assertTrue(trie.startsWith("app"));  // returns true
        assertFalse(trie.startsWith("apl")); // returns false
    }

    @Test
    void search() {
        trie.insert("banana");
        trie.insert("band");
        trie.insert("bandana");

        assertTrue(trie.search("banana"));
        assertTrue(trie.search("band"));
        assertFalse(trie.search("ban"));
    }
}
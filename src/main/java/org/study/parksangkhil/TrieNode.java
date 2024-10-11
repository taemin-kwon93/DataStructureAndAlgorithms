package org.study.parksangkhil;

public class TrieNode {
    boolean isWord;
    TrieNode[] children;

    public TrieNode() {
        children = new TrieNode[26];
        isWord = false;
    }
}

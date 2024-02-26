package org.study.book;

import java.util.Comparator;

public class Bintree<K, V> {

    static class Node<K, V> {
        private K key;
        private V data;
        private Node<K, V> left;
        private Node<K, V> right;
        Node(K key, V data, Node<K, V> left, Node<K, V> right) {
            this.key = key;
            this.data = data;
            this.left = left;
            this.right = right;
        }

        K getKey() {
            return key;
        }

        V getValue() {
            return data;
        }

        void print() {
            System.out.println(data);
        }
    }

    private Node<K, V> root;
    private Comparator<? super K> comparator = null; // 키값의 대소 관계를 판단하는 비교자

    public Bintree() {
        root = null;
    }

    public Bintree(Comparator<? super K> c) {
        this();
        comparator = c;
    }

    private int comp(K key1, K key2) {
        return (comparator == null) ? ((Comparable<K>)key1).compareTo(key2) : comparator.compare(key1, key2);
    }

    public V search(K key) {
        Node<K, V> p = root;

        while (true) {
            if (p == null) return null;
            int cond = comp(key, p.getKey());
            if (cond == 0) return p.getValue();
            else if (cond < 0) p = p.left;
            else p = p.right;
        }
    }
}

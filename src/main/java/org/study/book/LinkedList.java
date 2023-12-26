package org.study.book;

public class LinkedList<E> {
    class Node<E> {
        private E data;
        private Node<E> next;

        Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<E> head;   // 머리 포인터(머리 노드 참조)
    private Node<E> crnt;   // 선택 포인터(선택 노드 참조)
}

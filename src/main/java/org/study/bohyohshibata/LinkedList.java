package org.study.bohyohshibata;

import java.util.Comparator;

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

    public LinkedList() {
        head = crnt = null;
    }

    public E search(E obj, Comparator<? super E> c) {
        Node<E> ptr = head;     // 현재 스캔중인 노드

        while (ptr != null) {    // 종료 조건 1을 먼저 판단합니다. ptr 값이 null 이 아니면 루프 본문을 실행합니다.
            if (c.compare(obj, ptr.data) == 0) { // 검색 성공
                crnt = ptr;
                return ptr.data;
            }
            ptr = ptr.next;
        }
        return null;
    }

    public void addFirst(E obj) {
        Node<E> ptr = head;     // next 의 값이 될 ptr 을 head 값으로 대입
        head = crnt = new Node<E>(obj, ptr);
    }

    public void addLast(E obj) {
        if (head == null)
            addFirst(obj);
        else {
            Node<E> ptr = head;
            while (ptr.next != null)
                ptr = ptr.next;
            ptr.next = crnt = new Node<E>(obj, null);
        }
    }

    public void removeFirst() {
        if (head != null)
            head = crnt = head.next;
    }

    public void removeLast() {
        if (head != null) {
            if(head.next == null)
                removeFirst();
            else {
                Node<E> ptr = head;      // 스캔 중인 노드
                Node<E> pre = head;      // 스캔 중인 노드의 앞쪽 노드

                while (ptr.next != null) {
                    pre = ptr;
                    ptr = ptr.next;
                }
                pre.next = null;         // pre는 삭제 후의 꼬리 노드
                crnt = pre;
            }
        }
    }

    public void remove(Node p) {
        if (head != null) {
            if (p == head)                   // p가 머리 노드면
                removeFirst();               // 머리 노드를 삭제
            else {
                Node<E> ptr = head;
                while (ptr.next != p) {
                    ptr = ptr.next;
                    if (ptr == null) return; // p가 리스트에 없음
                }
                ptr.next = p.next;
                crnt = ptr;
            }
        }
    }

    // 선택 노드를 삭제
    public void removeCurrentNode() {
        remove(crnt);
    }

    public void clear() {
        while (head != null) // 노드에 아무것도 없을 때까지
            removeFirst();   // 머리 노드를 삭제
        crnt = null;
    }

    public boolean next() {
        if (crnt == null || crnt.next == null)
            return false;    // 진행할 수 없음
        crnt = crnt.next;
        return true;
    }

    // 선택 노드를 출력
    public void printCurrentNode() {
        if (crnt == null)
            System.out.println("선택한 노드가 없습니다.");
        else
            System.out.println(crnt.data);
    }

    // 모든 노드를 출력
    public void dump() {
        Node<E> ptr = head;
        while(ptr != null) {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }
}

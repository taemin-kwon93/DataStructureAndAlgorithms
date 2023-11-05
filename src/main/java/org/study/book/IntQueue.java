package org.study.book;

import java.util.Arrays;

public class IntQueue {
    private int[] que;
    private int capacity;
    private int front;
    private int rear;
    private int num;

    // 실행 시 예외: 큐가 비어있음
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() { }
    }

    // 실행 시 예외: 큐가 가득 참
    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() { }
        public void alertMessage() {
            System.out.println("큐가 가득 찼습니다.");
        }
    }

    // 생성자
    public IntQueue(int maxlen) {
        num = front = rear = 0;
        capacity = maxlen;
        try {
            que = new int[capacity]; // 큐 본체용 배열을 생성
        } catch (OutOfMemoryError e) { // 생성할 수 없음
            capacity = 0;
        }
    }

    public void viewQueueInformation() {
        System.out.println("queue list: " + Arrays.toString(this.que));
        System.out.println("rear: " + this.rear);
        System.out.println("front: " + this.front);
        System.out.println("num: " + this.num);
        System.out.println("capacity: " + this.capacity);

    }

    public int enque(int x) throws OverflowIntQueueException {
        if (num >= capacity) throw new OverflowIntQueueException();
        que[rear++] = x;
        num++;
        if (rear == capacity) rear = 0;
        return x;
    }

    public int deque() throws EmptyIntQueueException {
        if (num <= 0) throw new EmptyIntQueueException();
        int x = que[front++];
        num--;
        if (front == capacity) front = 0;
        return x;
    }

    public int peek() throws EmptyIntQueueException {
        if (num <= 0) throw new EmptyIntQueueException();
        return que[front];
    }

    public void clear() {
        num = front = rear = 0;
    }

    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;
            if (que[idx] == x) return idx;
        }
        return -1;
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return num;
    }

    public boolean isEmpty() {
        return num <= 0;
    }

    public boolean isFull() {
        return num >= capacity;
    }

    public void dump() {
        if (num <= 0) System.out.println("큐가 비어있습니다.");
        else {
            for (int i = 0; i < num; i++) System.out.print(que[(i + front) % capacity] + " ");
            System.out.println();
        }
    }

    public int search(int x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;  // 원형 큐의 인덱스 계산
            if (que[idx] == x) {
                return i + 1;  // 큐 내 위치를 1부터 시작하도록 반환
            }
        }
        return 0;  // 검색 실패 시 0 반환
    }
}

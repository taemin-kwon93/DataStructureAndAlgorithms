package org.study.book;

import java.util.Scanner;

public class IntQueueTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntQueue s = new IntQueue(5);

        while(true) {
            System.out.println();
            System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
            System.out.print("(1) 인큐  (2) 디큐  (3) 피크  (4) 덤프  (5) indexOf  (6) search  (99) 큐 전체보기 (0) 종료: ");
            int menu = stdIn.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu) {
                case 99:
                    s.viewQueueInformation();
                    break;

                case 1:
                    System.out.print("데이터: ");
                    x = stdIn.nextInt();
                    try {
                        s.enque(x);
                    } catch (IntQueue.OverflowIntQueueException e) {
                        e.alertMessage();
                    }
                    break;

                case 2:
                    try {
                        x = s.deque();
                        System.out.println("디큐 데이터 : " + x);
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;

                case 3:
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터 : " + x);
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;

                case 4:
                    s.dump();
                    break;

                case 5:
                    x = stdIn.nextInt();
                    System.out.println("검색한 데이터: " + s.indexOf(x));
                    break;

                case 6:
                    x = stdIn.nextInt();
                    System.out.println(s.search(x));
                    break;

            }
        }
    }
}

package org.study.book;

import java.util.Comparator;
import java.util.Scanner;

public class LinkedListTester {
    static Scanner stdIn = new Scanner(System.in);

    static class Data {
        static final int NO = 1;    // 번호 입력받기
        static final int NAME = 2;  // 이름 입력기

        private Integer no;         // 회원번호
        private String name;        // 이름

        // 문자열 출력
        public String toString() {
            return "(" + no + ")" + name;
        }

        // 데이터 입력받기
        void scanData(String guide, int sw) {
            System.out.println(guide + "할 데이터를 입력하세요.");

            if ((sw & NO) == NO) {
                System.out.println("번호: ");
                no = stdIn.nextInt();
            }
            if ((sw & NAME) == NAME) {
                System.out.println("이름: ");
                name = stdIn.next();
            }
        }

        // 회원번호로 순서를 정하는 comparator
        public static final Comparator<Data> NO_ORDER = new NoOrderComparator();
        private static class NoOrderComparator implements Comparator<Data> {
            public int compare(Data d1, Data d2) {
                return (d1.no > d2.no) ? 1 : (d1.no < d2.no) ? -1 : 0;
            }
        }

        // 이름으로 순서를 정하는 comparator
        public static final Comparator<Data> NAME_ORDER = new NameOrderComparator();
        private static class NameOrderComparator implements Comparator<Data> {
            public int compare(Data d1, Data d2) {
                return d1.name.compareTo(d2.name);
            }
        }
    }

    // 메뉴 열거형
    enum Menu {
        ADD_FIRST("머리에 노드 삽입"),
        ADD_LAST("꼬리에 노드 삽입"),
        RMV_FIRST("머리 노드를 삭제"),
        RMV_LAST("꼬리 노드를 삭제"),
        RMV_CRNT("현재 노드를 삭제"),
        CLEAR("모든 노드를 삭제"),
        SEARCH_NO("번호로 검색"),
        SEARCH_NAME("이름으로 검색"),
        NEXT("선택 노드를 하나 뒤쪽으로 진행"),
        PRINT_CRNT("선택 노드를 출력"),
        DUMP("모든 노드를 출력"),
        TERMINATE("종료");

        private final String message;
        static Menu MenuAt(int idx){
            for (Menu m: Menu.values())
                if(m.ordinal() == idx)
                    return m;
            return null;
        }
        Menu(String string) {
            message = string;
        }

        String getMessage() {
            return message;
        }
    }

}

package org.study.parksangkhil;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ReorderLogFiles {
    public String[] solution(String[] strArr) {
        // 문자와 숫자 두개의 형식으로 나누어 List에 추가
        List<String> letterList = new ArrayList<>();
        List<String> digitList = new ArrayList<>();

        for (String s : strArr) {
            String[] tmp = s.split(" ");
            if (Character.isDigit(tmp[1].charAt(0))) {
                digitList.add(s);
            } else {
                letterList.add(s);
            }
        }

        letterList.sort(LETTER_ORDER);
        letterList.addAll(digitList);

        return letterList.toArray(new String[0]);
    }

    // 정렬 기준 생성
    public static final Comparator<String> LETTER_ORDER = new LetterLogComparator();
    private static class LetterLogComparator implements Comparator<String> {
        public int compare(String s1, String s2) {
            String[] a = s1.split(" ", 2);
            String[] b = s2.split(" ", 2);

            int compared = a[1].compareTo(b[1]);
            if (compared == 0) {
                return a[0].compareTo(b[0]);
            } else {
                return a[1].compareTo(b[1]);
            }
        }
    }
}

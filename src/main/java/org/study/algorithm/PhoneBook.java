package org.study.algorithm;

import java.util.*;

public class PhoneBook {
    public boolean solution(String[] phone_book) {
        if (phone_book.length < 2) return true;
        // 모든 전화번호를 Set에 추가
        Set<String> set = new HashSet<>(Arrays.asList(phone_book));
        // 각 전화번호의 접두어가 Set에 존재하는지 확인
        for (String pb : phone_book) {
            StringBuilder sb = new StringBuilder();
            for (char chars : pb.toCharArray()) {
                sb.append(chars);
                // 접두어가 Set에 존재하고, 전체 번호와 일치하지 않을 경우 false
                if (!sb.toString().equals(pb) && set.contains(sb.toString())) {
                    return false;
                }
            }
        }

        return true;
    }
}

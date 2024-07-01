package org.study.parksangkhil;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class PalindromeLinkedList {
    public boolean solution(List<Integer> list1) {
        List<Integer> list2 = new ArrayList<>(list1);
        Collections.reverse(list1);

        for (int i = 0; i < list1.size(); i++) {
            if (!Objects.equals(list1.get(i), list2.get(i))) return false;
        }

        return true;
    }
}

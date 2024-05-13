package org.study.algorithm;

import java.util.ArrayList;
import java.util.List;

public class GroupOfFivePeople {
    public static void main(String[] args) {
        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        String[] a = solution(names);
        for (int i = 0; i < a.length; i++){
            System.out.println("a" + "[" + i + "]: " + a[i]);
        }

    }

    private static String[] solution(String[] names) {
        List<String> result = new ArrayList<>();
        for (int y = 0; y < names.length; y++) {
            if (y % 5 == 0) result.add(names[y]);
        }

        return result.toArray(new String[0]);
    }

}

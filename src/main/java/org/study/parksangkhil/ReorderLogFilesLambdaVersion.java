package org.study.parksangkhil;

import java.util.ArrayList;
import java.util.List;

public class ReorderLogFilesLambdaVersion {
    public String[] solution(String[] strArr) {
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

        letterList.sort((s1, s2) -> {
            String[] a = s1.split(" ", 2);
            String[] b = s2.split(" ", 2);

            int compared = a[1].compareTo(b[1]);
            if (compared == 0) {
                return a[0].compareTo(b[0]);
            } else {
                return a[1].compareTo(b[1]);
            }
        });

        letterList.addAll(digitList);

        return letterList.toArray(new String[0]);
    }
}

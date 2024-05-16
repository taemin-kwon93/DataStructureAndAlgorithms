package org.study.algorithm;

public class SamYukGoo {
    public int solution(int order) {
        int counter = 0;
        String strOrder = Integer.toString(order);

        for (int i = 0; i < strOrder.length(); i++) {
            char c = strOrder.charAt(i);
            if (c == '3' || c == '6' || c == '9') counter++;
        }

        return counter;
    }
}

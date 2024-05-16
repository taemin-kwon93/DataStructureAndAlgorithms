package org.study.algorithm;

public class SharePizza2 {
    public int solution(int n) {
        int pizza = 1;
        do {
            if ((pizza * 6) % n != 0) pizza++;
        } while ((pizza * 6) % n != 0);

        return pizza;
    }
}

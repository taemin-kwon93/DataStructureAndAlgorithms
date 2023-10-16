package org.study.book;

public class CardConv {
    static int cardConv(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "01234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while(x != 0);


        for(int i = 0; i < digits / 2; i++) {
            char t = d[i];
            d[i] = d[digits - 1 - i];
            d[digits - 1 - i] = t;
        }

        return digits;
    }
}

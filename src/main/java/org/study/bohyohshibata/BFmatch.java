package org.study.bohyohshibata;

public class BFmatch {
    static int bfMatch(String txt, String pat) {
        int pt = 0;
        int pp = 0;
        while (pt != txt.length() && pp != pat.length()) {
            if (txt.charAt(pt) == pat.charAt(pp)) {
                pt++;
                pp++;
            } else {
                pt = pt - pp + 1;
                pp = 0;
            }
        }
        if (pp == pat.length())
            return pt - pp;
        return -1;
    }

    public static void main(String[] args) {
        String a = "ABABABCDEF";
        String b = "ABC";

        System.out.println(bfMatch(a, b));
    }
}

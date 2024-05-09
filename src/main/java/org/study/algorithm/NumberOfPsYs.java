package org.study.algorithm;

public class NumberOfPsYs {
    public static void main(String[] args) {
        String x = "pPoooyY";
        String y = "Pyy";
        boolean a = solution(x);
        boolean b = solution(y);
        System.out.println(a);
        System.out.println(b);
    }

    private static boolean solution(String s) {
        int a = counter(s.toLowerCase(), 'p');
        int b = counter(s.toLowerCase(), 'y');
        return (a == b)? true : false;
    }

    private static int counter(String a, char b) {
        int counter = 0;
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == b) counter++;
        }
        return counter;
    }


}

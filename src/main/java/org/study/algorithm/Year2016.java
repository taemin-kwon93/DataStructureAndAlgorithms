package org.study.algorithm;

public class Year2016 {
    public String solution(int a, int b) {
        // a is month, b is day
        // February 2016 has 29th
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = 0;
        for (int i = 0; i < a - 1; i++)
            days += month[i];
        days += b;
        days %= 7;
        return switch (days) {
            case 0 -> "THU";
            case 1 -> "FRI";
            case 2 -> "SAT";
            case 3 -> "SUN";
            case 4 -> "MON";
            case 5 -> "TUE";
            case 6 -> "WED";
            default -> "";
        };
    }
}

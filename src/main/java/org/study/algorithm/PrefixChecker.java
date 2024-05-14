package org.study.algorithm;

public class PrefixChecker {
    public int solution(String my_string, String is_prefix) {
        char[] a = new char[my_string.length()];
        char[] b = new char[is_prefix.length()];

        for (int i = 0; i < my_string.length(); i++) {
            a[i] = my_string.charAt(i);
        }

        for (int i = 0; i < is_prefix.length(); i++) {
            b[i] = is_prefix.charAt(i);
        }

        int checker = 0;

        if (is_prefix.length() < my_string.length()) {
            for (int i = 0; i < is_prefix.length(); i++) {
                if (b[i] == a[i]) checker++;
            }
        } else {
            for (int i = 0; i < my_string.length(); i++) {
                if (b[i] == a[i]) checker++;
            }
        }


        return (checker == is_prefix.length()) ? 1 : 0;
    }

    public int solution2(String my_string, String is_prefix) {
        if (my_string.startsWith(is_prefix)) return 1;
        return 0;
    }
}

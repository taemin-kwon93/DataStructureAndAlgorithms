package org.study.algorithm;

import java.util.Arrays;
import java.util.Objects;

/**
 * 문자열 before와 after가 매개변수로 주어질 때, before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.
 */

public class MakeAtoB {
    public int solution(String before, String after) {
        String[] a = after.split("");
        String[] b = before.split("");
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) if (!Objects.equals(a[i], b[i])) return 0;
        return 1;
    }
}

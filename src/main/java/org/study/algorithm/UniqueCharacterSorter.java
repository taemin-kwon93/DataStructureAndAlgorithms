package org.study.algorithm;

import java.util.*;

/**
 * 문자열 s가 매개변수로 주어집니다. s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요. 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
 */

public class UniqueCharacterSorter {
    public String solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        // Make map data
        for (int i = 0; i < 26; i++) {
            int x = 97;
            map.put((char) (x + i), 0);
        }

        // Count spell
        for (char c : s.toCharArray()) {
            map.replace(c, map.get(c) + 1);
        }

        for (int k = 0; k < 26; k++) {
            int x = 97;
            if (map.get((char)(x + k)) == 1) list.add(String.valueOf((char) (x + k)));
        }
        String[] strArr = list.toArray(new String[0]);
        Arrays.sort(strArr);

        for (String str : strArr) {
            sb.append(str);
        }

        return sb.toString();
    }

    public String solution2(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c: map.keySet()) {
            if (map.get(c) == 1) sb.append(c);
        }

        char[] charArr = sb.toString().toCharArray();
        Arrays.sort(charArr);

        return new String(charArr);
    }
}

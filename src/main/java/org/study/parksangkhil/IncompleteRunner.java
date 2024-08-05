package org.study.parksangkhil;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IncompleteRunner {
    public String solution(String[] a, String[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < b.length; i++) {
            if (!b[i].equals(a[i])) return a[i];
        }

        return a[a.length - 1];
    }

    public String solutionB(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        for (String c : completion) {
            int left = map.get(c);
            if (left == 1) map.remove(c);
            else map.put(c, map.get(c) - 1);
        }

        return map.entrySet().iterator().next().getKey();
    }
}

package org.study.parksangkhil;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> solution(String[] strArr) {
        Map<String, List<String>> results = new HashMap<>();

        for (String s : strArr) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (!results.containsKey(key))
                results.put(key, new ArrayList<>());
            results.get(key).add(s);
        }

        return new ArrayList<>(results.values());
    }
}

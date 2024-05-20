package org.study.algorithm;

import java.util.List;
import java.util.ArrayList;

public class RemoveAdSubstrings {
    public String[] solution(String[] strArr) {
        List<String> answer = new ArrayList<>();
        for (String s : strArr) {
            if (!s.contains("ad")) answer.add(s);
        }

        return answer.toArray(new String[0]);
    }
}

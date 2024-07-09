package org.study.algorithm;

public class AlienDictionary {
    public int solution(String[] spell, String[] dic) {
        for (String s : dic) {
            int checker = 0;
            for (String sp : spell) {
                if (s.contains(sp)) checker++;
                if (checker == spell.length) return 1;
            }
        }
        return 2;
    }
}

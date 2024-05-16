package org.study.algorithm;

import java.util.stream.Collectors;

public class RemoveDuplicateCharacters {
    public String solution(String my_string) {
        StringBuilder a = new StringBuilder();
        a.append(my_string.charAt(0));

        for (int i = 1; i < my_string.length(); i++) {
            int counter = 0;
            for (int j = 0; j < a.length(); j++) {
                if (my_string.charAt(i) == a.charAt(j)) {
                    break;
                } else counter++;
            }
            if (counter == a.length()) a.append(my_string.charAt(i));
        }
        return a.toString();
    }

    public String solution2(String my_string) {
        return my_string.chars().mapToObj(Character::toString).distinct().collect((Collectors.joining()));
    }
}

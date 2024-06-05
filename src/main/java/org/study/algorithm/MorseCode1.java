package org.study.algorithm;

import java.util.Map;
import java.util.HashMap;

/**
 * 머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다. 그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다. 문자열 letter가 매개변수로 주어질 때,
 * letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
 * 모스부호는 다음과 같습니다.
 */

public class MorseCode1 {
    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        Map<String, String> code = new HashMap<>();
        code.put(".-", "a");
        code.put("-...", "b");
        code.put("-.-.", "c");
        code.put("-..", "d");
        code.put(".", "e");
        code.put("..-.", "f");
        code.put("--.", "g");
        code.put("....", "h");
        code.put("..", "i");
        code.put(".---", "j");
        code.put("-.-", "k");
        code.put(".-..", "l");
        code.put("--", "m");
        code.put("-.", "n");
        code.put("---", "o");
        code.put(".--.", "p");
        code.put("--.-", "q");
        code.put(".-.", "r");
        code.put("...", "s");
        code.put("-", "t");
        code.put("..-", "u");
        code.put("...-", "v");
        code.put(".--", "w");
        code.put("-..-", "x");
        code.put("-.--", "y");
        code.put("--..", "z");

        String[] sArr = letter.split(" ");
        for (String s : sArr) sb.append(code.get(s));
        return sb.toString();
    }
}

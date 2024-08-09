package org.study.parksangkhil;

import java.util.*;

public class LetterCombinations {
    public void dfs(List<String> result, Map<Character, List<Character>> keyboard, String digits, int index, StringBuilder path) {
        if (path.length() == digits.length()) {
            result.add(String.valueOf(path));
            return;
        }

        // Map에 저장한 key와 value에 해당하는 글자들을 순회함
        // 첫 순회 시, digits.charAt(0) 은 '2'다.
        // 이때 Map의 key '2'의 value는 List<Character> 이며, 값은 ['a', 'b', 'c'] 이다.
        // 따라서 Character c가 a, b, c와 같은 값으로 변경되며 반복문이 동작한다.
        // for 문은 총 세번 동작하게 될 예정이며, 그 안에서 재귀함수 호출이 이루어진다.
        for (Character c : keyboard.get(digits.charAt(index))) {
            dfs(result, keyboard, digits, index + 1, new StringBuilder(path).append(c));
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) return result;

        Map<Character, List<Character>> keyboard = new HashMap<>();
        keyboard.put('2', Arrays.asList('a', 'b', 'c'));
        keyboard.put('3', Arrays.asList('d', 'e', 'f'));
        keyboard.put('4', Arrays.asList('g', 'h', 'i'));
        keyboard.put('5', Arrays.asList('j', 'k', 'l'));
        keyboard.put('6', Arrays.asList('m', 'n', 'o'));
        keyboard.put('7', Arrays.asList('p', 'q', 'r', 's'));
        keyboard.put('8', Arrays.asList('t', 'u', 'v'));
        keyboard.put('9', Arrays.asList('w', 'x', 'y', 'z'));

        dfs(result, keyboard, digits, 0 , new StringBuilder());
        return result;
    }
}


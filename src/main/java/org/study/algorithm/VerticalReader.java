package org.study.algorithm;

/**
 * 문자열 my_string과 두 정수 m, c가 주어집니다. my_string을 한 줄에 m 글자씩 가로로 적었을 때 왼쪽부터 세로로 c번째 열에 적힌 글자들을 문자열로 return 하는 solution 함수를 작성해 주세요.
 */

public class VerticalReader {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        int line = my_string.length() / m;
        char[][] code = new char[line][m];
        int ptr = 0;

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < m; j++) code[i][j] = my_string.charAt(ptr++);
        }
        for (int i = 0; i < line; i++) sb.append(code[i][c - 1]);

        return sb.toString();
    }
}

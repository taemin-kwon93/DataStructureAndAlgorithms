package org.study.algorithm;

/**
 * 직사각형 형태의 그림 파일이 있고, 이 그림 파일은 1 × 1 크기의 정사각형 크기의 픽셀로 이루어져 있습니다.
 * 이 그림 파일을 나타낸 문자열 배열 picture과 정수 k가 매개변수로 주어질 때,
 * 이 그림 파일을 가로 세로로 k배 늘린 그림 파일을 나타내도록 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
 */
public class ExpandPainting {
    public String[] solution(String[] picture, int k) {
        String[] expandedRow = new String[picture.length * k];

        int idx1 = 0;
        for (String tmp : picture) {
            for (int i = 0; i < k; i++) {
                expandedRow[idx1++] = tmp;
            }
        }

        int idx2 = 0;
        for (String s : expandedRow) {
            expandedRow[idx2++] = expandPic(s, k);
        }

        return expandedRow;
    }

    public String expandPic(String s, int k) {
        char[] expandedPicture = new char[s.length() * k];
        char[] chars = s.toCharArray();
        int i = 0;
        for (char c : chars) {
            for (int j = 0; j < k; j++) {
                expandedPicture[i++] = c;
            }
        }

        return new String(expandedPicture);
    }
}

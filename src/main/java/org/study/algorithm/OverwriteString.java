package org.study.algorithm;

/**
 * 문자열 my_string, overwrite_string과 정수 s가 주어집니다.
 * 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을
 * 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
 */
public class OverwriteString {
    public String solution(String os, String ns, int s) {
        StringBuilder sb = new StringBuilder();
        String part = os.substring(s, ns.length() + s);
        part = part.replaceAll(part, ns);

        sb.append(os, 0, s);
        sb.append(part);
        sb.append(os, s + ns.length(), os.length());

        return sb.toString();
    }
}

package org.study.algorithm;

public class DecryptionPassword {
    public static void main(String[] args) {
        DecryptionPassword decryptionPassword = new DecryptionPassword();
        String answer = decryptionPassword.solution("pfqallllabwaoclk", 2);
        System.out.println(answer);
    }

    public String solution(String str, int n) {
        String answer = "";
        for(int i = 0; i < str.length(); i++) {
            answer += ((i + 1) % n == 0)? str.charAt(i): "";
        }
        return answer;
    }
}

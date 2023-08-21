package org.study.algorithm;

public class StringContainsChecker {
    public int solution(String mainString, String subString) {
        byte[] mainBytes = mainString.getBytes();
        byte[] subBytes = subString.getBytes();

        for(int i = 0; i <= mainString.length() - subString.length(); i++) {
            boolean isMatch = true;
            for (int j = 0; j < subString.length(); j++) {
                if (mainBytes[i + j] != subBytes[j]) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) {
                return 1;
            }
        }
        return 2;
    }
}

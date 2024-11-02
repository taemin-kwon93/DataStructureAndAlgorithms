package org.study.algorithm;

public class EncryptedMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] map = new String[n];
        for (int i = 0; i < n; i++) {
            int decryptedNum = arr1[i] | arr2[i];
            map[i] = makeDecryptedMap(decryptedNum, n);
        }
        return map;
    }


    public String makeDecryptedMap(int x, int n) {
        String s = Integer.toBinaryString(x);
        if (s.length() < n)
            s = "0".repeat(n - s.length()) + s;

        s = s.replaceAll("1", "#");
        s = s.replaceAll("0", " ");

        return s;
    }
}

package org.study.algorithm;

public class LengthOfWords {
    public static void main(String[] args) {
        String[] x = {"test1", "test22", "test333", "test4444"};
        int[] a = new LengthOfWords().solution(x);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }

        return answer;
    }
}

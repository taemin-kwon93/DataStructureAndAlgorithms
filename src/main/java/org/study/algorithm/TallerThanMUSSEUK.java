package org.study.algorithm;

public class TallerThanMUSSEUK {
    public static void main(String[] args) {
        TallerThanMUSSEUK checker = new TallerThanMUSSEUK();
        int result = checker.solution(new int[]{149, 180, 192, 170}, 167);
        System.out.println(result);
    }

    public int solution(int[] friendsHeight, int MUSSEUKsHeight) {
        int count = 0;
        for (int i = 0; i < friendsHeight.length; i++) {
            count = (friendsHeight[i] > MUSSEUKsHeight)? ++count : count;
        }

        return count;
    }
}

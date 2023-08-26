package org.study.algorithm;

public class QuadrantCalculator {
    public static void main(String[] args) {
        QuadrantCalculator quadrantCalculator = new QuadrantCalculator();
        int result = quadrantCalculator.solution(new int[] {-7, 9});
        System.out.println(result);
    }

    public int solution(int[] dot) {
        int answer = 0;

        String position = "";
        position = (dot[0] < 0)? "a" : "b";
        position = (dot[1] < 0)? position + "c" : position + "d";

        switch (position) {
            case "ac" : answer = 3; break;
            case "ad" : answer = 2; break;
            case "bc" : answer = 4; break;
            case "bd" : answer = 1;
        }
        return answer;
    }
}

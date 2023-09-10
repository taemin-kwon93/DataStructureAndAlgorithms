package org.study.algorithm;

public class Ants {
    public static void main(String[] args) {
        Ants solve = new Ants();
        int answer = solve.solution(23);
        System.out.println(answer);
    }
    public int solution(int n) {
        int generalAntPower = 5;
        int soldierAntsPower = 3;
        int ergatePower = 1;

        int x1 = n / generalAntPower;
        int x2 = n % generalAntPower;
        int y1 = x2 / soldierAntsPower;
        int y2 = x2 % soldierAntsPower;
        int z1 = y2 /ergatePower;

        return x1 + y1 + z1;
    }
}

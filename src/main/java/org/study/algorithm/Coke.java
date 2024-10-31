package org.study.algorithm;

/**
 * 빈 병 a개를 가져다주면 콜라 b병을 주는 마트가 있을 때, 빈 병 n개를 가져다주면 몇 병을 받을 수 있는지 계산하는 문제입니다.
 * 기존 콜라 문제와 마찬가지로, 보유 중인 빈 병이 a개 미만이면, 추가적으로 빈 병을 받을 순 없습니다.
 * 상빈이는 열심히 고심했지만, 일반화된 콜라 문제의 답을 찾을 수 없었습니다.
 * 상빈이를 도와, 일반화된 콜라 문제를 해결하는 프로그램을 만들어 주세요.
 * 콜라를 받기 위해 마트에 주어야 하는 병 수 a, 빈 병 a개를 가져다 주면 마트가 주는 콜라 병 수 b,
 * 상빈이가 가지고 있는 빈 병의 개수 n이 매개변수로 주어집니다.
 * 상빈이가 받을 수 있는 콜라의 병 수를 return 하도록 solution 함수를 작성해주세요.
 */
public class Coke {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int remain;

        while (n >= a) {
            int bottle = (n / a) * b;
            remain = n % a;
            answer += bottle;
            n = bottle + remain;
        }

        return answer;
    }
}

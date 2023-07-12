package org.study.algorithm;

public class DividePizza {
    public static void main(String[] args) {
        int result = new DividePizza().solution(15);
        System.out.println(result);
    }

    public int solution(int personCount) {
        int answer = 0;
        int pizzaSlices = 7;
        int quotient = personCount / pizzaSlices;
        int remainder = personCount % pizzaSlices;
        if (remainder == 0) {
            answer = quotient;
        } else {
            answer = quotient + 1;
        }
        return answer;
    }
}

/** 인상깊은 다른사람의 풀이 방법
 *  - 삼항 연산자를 이용한 풀이
 *  public int solution(int n) {
 *      int answer = (n%7 == 0) ? n/7 : n/7+1;
 *      return answer
 *  }
 *
 *  1. remainder라는 값을 계산하지 않고 삼항 연산자를 이용하여 풀 수 있다.
 *  2. 삼항 연산자의 조건내에서 계산을 한다. (personCount/7 == 0) ? personCount/7 : personCount/7+1;
 */
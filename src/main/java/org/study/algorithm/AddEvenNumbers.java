package org.study.algorithm;

public class AddEvenNumbers {
    public static void main(String[] args) {
        AddEvenNumbers addEvenNumbers = new AddEvenNumbers();
        System.out.println(addEvenNumbers.solution(10));
    }
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                answer += i;
            }
        }
        return answer;
    }
}

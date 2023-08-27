package org.study.algorithm;

public class OrderedPair {
    public static void main(String[] args) {
        OrderedPair orderedPair = new OrderedPair();
        int result = orderedPair.solution(20);
        System.out.println(result);
    }

    public int solution(int number) {
        int count = 0;
        for(int i = 1; i <= number; i++) {
            count = (number % i == 0)? ++count : count;
        }
        return count;
    }
}

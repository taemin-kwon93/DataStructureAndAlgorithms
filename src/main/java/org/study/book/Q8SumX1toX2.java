package org.study.book;

public class Q8SumX1toX2 {
    public static void main(String[] args) {
        Q8SumX1toX2 q8SumX1toX2 = new Q8SumX1toX2();
        int result = q8SumX1toX2.sumof(3, 5);
        int result2 = q8SumX1toX2.sumof(5, 3);

    }

    public int sumof(int a, int b) {
        int answer = 0;
        if(a < b) {
            for(int i = a; i <= b; i++) {
                answer += i;
            }
            System.out.println("a < b and answer is " + answer);
        } else {
            for(int i = b; i <= a; i++) {
                answer += i;
            }
            System.out.println("b < a and answer is " + answer);
        }
        return answer;
    }
}

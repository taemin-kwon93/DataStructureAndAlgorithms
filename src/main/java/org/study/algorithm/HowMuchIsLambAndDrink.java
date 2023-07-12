package org.study.algorithm;

public class HowMuchIsLambAndDrink {
    public static void main(String[] args) {
        int result = solution(10	, 3);
        System.out.println(result);
    }
    public static int solution(int n, int k) {
        int answer = 0;
        int lamb = 12000;
        int drink = 2000;
        int lambPrice = lamb * n;
        int drinkPrice = drink * k;
        int freeDrinkPrice = (n / 10) * drink;
        answer = lambPrice + drinkPrice - freeDrinkPrice;
        return answer;
    }
}

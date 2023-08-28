package org.study.algorithm;

/**
 * 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
 * 구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
 */
public class DiscountEvent {
    public static void main(String[] args) {
        DiscountEvent discountEvent = new DiscountEvent();
        int result = discountEvent.solution(150000);
        System.out.println(result);
    }

    public int solution(int purchasePrice) {
        double discountRate = (purchasePrice >= 500000)? 0.2 : (purchasePrice >= 300000)? 0.1 : (purchasePrice >= 100000)? 0.05 : 0;
        double price = purchasePrice - ((double)purchasePrice * discountRate);

        return (int)price;
    }
}

package org.study.algorithm;

public class ReverseNumberList {
    public int[] solution(int[] numberList) {
        int[] clonedNumberList = numberList.clone();
        int j = numberList.length - 1;
        for (int i = 0; i < numberList.length; i++){
            numberList[i] = clonedNumberList[j];
            --j;
        }
        return numberList;
    }
}

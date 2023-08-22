package study.algorithm;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseNumberList {

    public static void main(String[] args) {
        ReverseNumberList reverseNumList = new ReverseNumberList();

        int[] result1 = reverseNumList.solution(new int[]{1, 2, 3, 4, 5});
        System.out.println("solution : " + Arrays.toString(result1));

        int[] result2 = reverseNumList.solution2(new int[]{1, 2, 3, 4, 5});
        System.out.println("solution2 : " + Arrays.toString(result2));

        int[] result3 = reverseNumList.solution3(new int[]{1, 2, 3, 4, 5});
        System.out.println("solution3 : " + Arrays.toString(result3));
    }

    public int[] solution(int[] numberList) {
        int[] clonedNumberList = numberList.clone();
        int j = numberList.length - 1;
        for (int i = 0; i < numberList.length; i++){
            numberList[i] = clonedNumberList[j];
            --j;
        }
        return numberList;
    }

    public int[] solution2(int[] numberList) {
        int length = numberList.length;
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            answer[i] = numberList[(length - 1)- i];
        }
        return answer;
    }

    public int[] solution3(int[] numberList) {
        List<Integer> list = Arrays.stream(numberList).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

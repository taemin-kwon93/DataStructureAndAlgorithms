package org.study.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class PickAMultipleOfN {
    public static void main(String[] args) {
        PickAMultipleOfN pickAMultipleOfN = new PickAMultipleOfN();
        int[] answer = pickAMultipleOfN.solution(3, new int[] {4, 5, 6, 7, 8, 9, 10, 11, 12});
        System.out.println(Arrays.toString(answer));
        int[] answer2 = pickAMultipleOfN.solution2(3, new int[] {4, 5, 6, 7, 8, 9, 10, 11, 12});
        System.out.println(Arrays.toString(answer2));
        int[] answer3 = pickAMultipleOfN.solution3(3, new int[] {4, 5, 6, 7, 8, 9, 10, 11, 12});
        System.out.println(Arrays.toString(answer3));
    }
    public int[] solution(int n, int[] numList) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < numList.length; i++) {
            if(numList[i] % n == 0) answer.add(numList[i]);
        }
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        return result;
    }

    public int[] solution2(int n, int[] numList) {
        List<Integer> answer = new ArrayList<>();
        for(int num : numList) if(num % n == 0) answer.add(num);
        return answer.stream().mapToInt(x -> x).toArray();
    }

    public int[] solution3(int n, int[] numList) {
        return Arrays.stream(numList).filter(value -> value % n == 0).toArray();
    }
}

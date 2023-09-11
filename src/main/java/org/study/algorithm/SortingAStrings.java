package org.study.algorithm;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class SortingAStrings {
    public static void main(String[] args) {
        SortingAStrings solve = new SortingAStrings();
        int[] answer = solve.solution("hi12392");
        System.out.println(Arrays.toString(answer));
    }
    public int[] solution(String myString) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < myString.length(); i++) if(myString.charAt(i) >= 48 & myString.charAt(i) <= 57) answer.add((int)myString.charAt(i));
        int[] result = answer.stream().mapToInt(value -> Integer.parseInt(Character.toString(value))).toArray();
        Arrays.sort(result);
        return result;
    }
}

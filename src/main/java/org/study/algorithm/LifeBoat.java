package org.study.algorithm;

import java.util.*;

/**
 * 사람들의 몸무게를 담은 배열 people과 구명보트의 무게 제한 limit가 매개변수로 주어질 때,
 * 모든 사람을 구출하기 위해 필요한 구명보트 개수의 최솟값을 return 하도록 solution 함수를 작성해주세요.
 */
public class LifeBoat {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int rescue = 0; // 보트가 구조를 위해 이동하는 횟수

        int left = 0;
        int right = people.length - 1;

        while (left <= right) {
            int sum = people[left] + people[right];
            if (sum <= limit) {
                left++;
            }
            right--;
            rescue++;
        }

        return rescue;
    }
}

package org.study.algorithm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 정수 배열 arr과 delete_list가 있습니다. arr의 원소 중 delete_list의 원소를 모두 삭제하고 남은 원소들은 기존의 arr에 있던 순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.
 */

public class DeleteElementsFromArray {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        for (int i :arr) {
            answer.add(i);
        }

        Iterator<Integer> iterator = answer.iterator();
        while (iterator.hasNext()) {
            int value = iterator.next();
            for (int deleteValue : delete_list) {
                if (value == deleteValue) {
                    iterator.remove();
                    break;
                }
            }
        }

        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        return result;
    }
}

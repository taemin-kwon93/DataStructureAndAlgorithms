package org.study.algorithm;

import java.util.ArrayList;
import java.util.List;

public class SumArrays {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            list.add(new ArrayList<>());

            for (int j = 0; j < arr1[i].length; j++) {
                list.get(i).add(arr1[i][j] + arr2[i][j]);
            }
        }

        int[][] result = new int[list.size()][];
        for (int k = 0; k < result.length; k++) {
            result[k] = new int[list.get(k).size()];
            for (int l = 0; l < list.get(k).size(); l++) {
                result[k][l] = list.get(k).get(l);
            }
        }

        return result;
    }
}

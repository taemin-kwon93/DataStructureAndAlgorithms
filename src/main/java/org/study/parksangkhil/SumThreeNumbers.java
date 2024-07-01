package org.study.parksangkhil;

import java.util.*;

public class SumThreeNumbers {
    public List<List<Integer>> solution(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();

        int y, z;


        for (int x = 0; x < arr.length - 1; x++) {
            y = arr.length - 1;
            z = x + 1;
            if (x > 0 && arr[x] == arr[x - 1])
                continue;

            while (z < y) {
                if (arr[x] + arr[y] + arr[z] == 0) {
                    list.add(Arrays.asList(arr[x], arr[z], arr[y]));
                    z++;
                } else if (arr[x] + arr[y] + arr[z] < 0) {
                    z++;
                } else if (arr[x] + arr[y] + arr[z] > 0) {
                    y--;
                }

            }
        }


        return list;
    }
}

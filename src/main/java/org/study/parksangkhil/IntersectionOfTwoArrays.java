package org.study.parksangkhil;

import java.util.*;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();

        for (int x : nums1)
            if (!list1.contains(x)) list1.add(x);

        for (int y : nums2)
            if (!list2.contains(y)) list2.add(y);

        for (Integer z : list1) {
            if (list2.contains(z)) answer.add(z);
        }

        return answer.stream().mapToInt(i->i).toArray();
    }
}

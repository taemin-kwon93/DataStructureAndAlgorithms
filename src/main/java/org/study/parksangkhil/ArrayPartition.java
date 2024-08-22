package org.study.parksangkhil;

import java.util.*;

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += Math.min(nums[i], nums[i+1]);
        }

        return sum;
    }
}

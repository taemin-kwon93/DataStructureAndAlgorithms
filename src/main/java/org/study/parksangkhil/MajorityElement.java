package org.study.parksangkhil;

public class MajorityElement {
    public int helper(int left, int right, int[] nums) {
        if (left == right) return nums[left];
        int mid = left + (right - left) / 2;
        int a = helper(left, mid, nums);
        int b = helper(mid + 1, right, nums);

        int counter = 0;
        for (int i = 0; i <= right; i++)
            if (nums[i] == a) counter++;

        return counter > (right - left) / 2 ? a : b;
    }

    public int majorityElement(int[] nums) {
        return helper(0, nums.length - 1, nums);
    }
}

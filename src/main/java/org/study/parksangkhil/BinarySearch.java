package org.study.parksangkhil;

public class BinarySearch {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int ptr, left = 0, right = nums.length - 1;

        while (left <= right) {
            ptr = (right + left) / 2;
            if (nums[ptr] < target) {
                left = ptr + 1;
            } else if (nums[ptr] > target) {
                right = ptr - 1;
            } else
                return ptr;
        }

        return -1;
    }
}

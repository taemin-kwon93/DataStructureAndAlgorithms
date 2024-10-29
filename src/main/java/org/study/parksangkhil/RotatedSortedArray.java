package org.study.parksangkhil;

public class RotatedSortedArray {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;  // 중간 인덱스 계산

            // 타겟을 찾으면 인덱스 반환
            if (nums[mid] == target) {
                return mid;
            }

            // 왼쪽 부분이 정렬되어 있는 경우
            if (nums[left] <= nums[mid]) {
                // 타겟이 왼쪽 정렬된 부분에 있다면
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;  // 왼쪽 부분 탐색
                } else {
                    left = mid + 1;   // 오른쪽 부분 탐색
                }
            }
            // 오른쪽 부분이 정렬되어 있는 경우
            else {
                // 타겟이 오른쪽 정렬된 부분에 있다면
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;   // 오른쪽 부분 탐색
                } else {
                    right = mid - 1;  // 왼쪽 부분 탐색
                }
            }
        }
        return -1;  // 타겟이 없는 경우
    }
}

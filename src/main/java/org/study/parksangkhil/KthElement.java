package org.study.parksangkhil;

public class KthElement {
    public int findKthLargest(int[] nums, int k) {
        BinaryHeap bh = new BinaryHeap();
        for (int i : nums)
            bh.insert(i);

        int x = 0;
        for (int j = 0; j <= k + 1; j++)
            x = bh.extract();

        System.out.println("x: " + x);
        return x;
    }
}

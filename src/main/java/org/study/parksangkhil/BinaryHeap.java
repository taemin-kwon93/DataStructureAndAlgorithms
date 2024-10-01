package org.study.parksangkhil;

import java.util.List;
import java.util.ArrayList;

public class BinaryHeap {
    public List<Integer> elems;

    public BinaryHeap() {
        elems = new ArrayList<>();
        elems.add(null);
    }

    public void swap(int i, int j) {
        int tmp = elems.get(i);
        elems.set(i, elems.get(j));
        elems.set(j, tmp);
    }

    public void percolateUp() {
        int idx = elems.size() - 1;
        int parentIdx = idx / 2;

        while (parentIdx > 0) {
            if (elems.get(idx) > elems.get(parentIdx)) {
                swap(idx, parentIdx);
            }

            idx = parentIdx;
            parentIdx = idx / 2;
        }
    }

    public void insert(int k) {
        elems.add(k);
        percolateUp();
    }

    public void maxHeapify(int i) {
        int left = i * 2;
        int right = left + 1;
        int smallest = i;

        if (left <= elems.size() - 1 && elems.get(left) < elems.get(smallest)) {
            smallest = left;
        }
        if (right <= elems.size() - 1 && elems.get(right) < elems.get(smallest)) {
            smallest = right;
        }

        if (smallest != i) {
            swap(smallest, i);
            maxHeapify(smallest);
        }
    }

    public int extract() {
        int extracted = elems.get(1);
        elems.set(1, elems.get(elems.size() - 1));
        elems.remove(elems.size() - 1);
        maxHeapify(1);
        return extracted;
    }
}

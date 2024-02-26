package org.study.bohyohshibata;

public class SelectionSort2 {
    public static void swap(int[] x, int idx1, int idx2) {
        int t = x[idx1];
        x[idx1] = x[idx2];
        x[idx2] = t;
    }
    public static void selectionSort(int[] x, int n) {

        for (int i = 0; i < n - 1; i++){
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (x[j] < x[min]) min = j;
            }
            printTargetIndex(x, x.length, i, min);
            swap(x, i, min);
        }
    }

    public static void printTargetIndex(int[] x, int n, int idx1, int idx2) {
        for (int i = 0; i <= idx2; i++) {
            if (i == idx1) {
                System.out.print("* ");
            } else if (i == idx2) {
                System.out.print("+");
            }
            else System.out.print("  ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] x = {6, 4, 8, 3, 1, 9, 7};
        selectionSort(x, x.length);
    }
}

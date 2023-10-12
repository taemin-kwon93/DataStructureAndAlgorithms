package org.study.book;

/**
 * n개 의 별을 출력합니다.
 * x개의 별을 출력한 후 줄바꿈 하여 남은 별을 출력합니다.
 */
public class PrintStar {
    static int counter = 1;
    public static void main(String[] args) {
        PrintStar printStar = new PrintStar();
        printStar.printStar(15, 3);
    }

    private void printStar(int n, int x) {
        int y = n / x;
        int z = n % x;

        for(int i = 0; i < y; i++) {
            for(int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i < z; i++) {
            System.out.print("*");
        }

    }
}

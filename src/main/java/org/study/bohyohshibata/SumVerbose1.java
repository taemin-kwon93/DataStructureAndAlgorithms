package org.study.bohyohshibata;

import java.util.Scanner;

/**
 * 1부터 n까지의 합을 구합니다.
 * 단, '+' 또는 '=' 문자열을 같이 표기해줍니다.
 * 예시: 1 + 2 + 3 + 4 + 5 = 15
 * 1 + 2 + ... + n-1 + n = result 와 같이 마지막 n 뒤의 연산기호는 '=' 으로 출력돼야 합니다.
 */
public class SumVerbose1 {
    public static void main(String[] args) {
        SumVerbose1 sv = new SumVerbose1();

        sv.verboseVersionMethod(sv.inputNumber());
        System.out.println();
        sv.refactorVerboseMethod(sv.inputNumber());
    }

    /**
     * 1. 숫자 입력 알림을 출력합니다.
     * 2. 입력받은 숫자를 리턴합니다.
     *
     * n : 입력받은 숫자
     */
    private int inputNumber () {
        Scanner stdIn = new Scanner(System.in);
        int n;
        System.out.println("1부터 n까지의 합을 구합니다.");
        do {
            System.out.print("n값: ");
            n = stdIn.nextInt();
        } while (n <= 0);
        return n;
    }

    /**
     * for 문 안에 if문이 있습니다.
     * 연산이 n번 이뤄져야 한다면, 해당 if문은 n번 실행됩니다.
     * if 문의 목적은 마지막 "n =" 을 출력하기 위함입니다.
     * 1번의 else문 실행을 위해 n번 if문을 실행하는 것은 비효율적입니다.
     */
    private void verboseVersionMethod(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
            if (i < n) System.out.print(i + " + ");
            else System.out.print(i + " = " + sum);
        }
    }

    /**
     *  verboseVersionMethod()의 수정된 버전입니다.
     */
    private void refactorVerboseMethod(int n) {
        int sum = 0;
        for(int i = 1; i < n; i++) {
            System.out.print(i + " + ");
            sum += i;
        }
        System.out.print(n + " = " + (sum + n));
    }
}

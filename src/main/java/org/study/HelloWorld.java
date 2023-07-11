package org.study;

public class HelloWorld {
    public static void main(String args[]) {
        int a = 1;
        int b = 2;
        int result = add(a, b);
        System.out.println(result);
        System.out.println("Hello world It Tom again!");
    }

    private static int add(int a, int b) {
        return a + b;
    }
}

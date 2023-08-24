package org.study.algorithm;

import java.util.Arrays;

/**
 * {5, 5, 3} 과 같이 이등변 삼각형에 대한 대비를 못함
 */
public class TriangleValidator {
    public static void main(String[] args) {
        int[] sides = {5, 5, 3};
        TriangleValidator triangleValidator = new TriangleValidator();
        int result = triangleValidator.solution(sides);
        System.out.println(result);
    }

    public int solution(int[] sides) {
        int x = 0;
        int[] y = {0, 0};
        int index = 0;
        if(sides[0] == sides[1] & sides[0] == sides[2]) {return 1;}
        // 가장 큰 수를 뽑고 x에 저장합니다.
        for (int i : sides) x = (x < i)? i : x;
        System.out.println("x: " + x);

        for (int i = 0; i < sides.length; i++) {
            if(sides[i] == x) {
                System.out.println("가장 긴 변의 길이는 " + sides[i] + "입니다.  for i : " + i);
            } else {
                System.out.println("y[index] : " + y[index] + " 은 " + "sides[i] 의 값 " + sides[i] + "이 대입 됩니다.");
                y[index] = sides[i];
                System.out.print("현재 y의 값: ");
                System.out.println(Arrays.toString(y));
                index++;
            }
        }

        // 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
        // 삼각형을 만들 수 있으면 1, 없으면 2
        return  (x < (y[0] + y[1]))? 1 : 2;
    }
}

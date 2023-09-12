package org.study.algorithm;

public class NumberToPatternConverter {
    public static void main(String[] args) {
        NumberToPatternConverter solve = new NumberToPatternConverter();
        String answer = solve.solution(23);
        System.out.println(answer);
    }


    public String solution(int x) {
        String xToString = x + "";
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < xToString.length(); i++) {
            answer.append(numToChar(Character.getNumericValue(xToString.charAt(i))));
        }
        return answer.toString();
    }

    public char numToChar(int x) {
        switch (x) {
            case 0:
                return 'a';
            case 1:
                return 'b';
            case 2:
                return 'c';
            case 3:
                return 'd';
            case 4:
                return 'e';
            case 5:
                return 'f';
            case 6:
                return 'g';
            case 7:
                return 'h';
            case 8:
                return 'i';
            case 9:
                return 'j';
        }
        return ' ';
    }
}

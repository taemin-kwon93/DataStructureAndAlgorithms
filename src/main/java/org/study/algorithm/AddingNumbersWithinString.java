package org.study.algorithm;

public class AddingNumbersWithinString {
    public static void main(String[] args) {
        AddingNumbersWithinString solve = new AddingNumbersWithinString();
        int answer = solve.solution("aAb1B2cC34oOp");
        System.out.println("answer: "+ answer); // answer: 10
        int answer2 = solve.solution2("1a2b3c4d123"); // answer: 16
        System.out.println("answer2: "+ answer2); // answer2: 10
    }

    public int solution(String myString) {
        int answer = 0;
        for(int i = 0; i < myString.length(); i++) {
            if(Character.isDigit(myString.charAt(i))) {
                answer += Character.getNumericValue(myString.charAt(i));
            }
        }
        return answer;
    }

    public int solution2(String myString) {
        int answer = 0;
        // ^는 부정을 나타내는 역할. 즉, 0 부터 9 가 아니면 전부 제거합니다.
        String str = myString.replaceAll("[^0-9]", "");

        for(char c : str.toCharArray()){
            answer += Character.getNumericValue(c);
        }
        return answer;
    }
}

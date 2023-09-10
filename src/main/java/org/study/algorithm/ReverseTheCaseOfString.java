package org.study.algorithm;
public class ReverseTheCaseOfString {
    public static void main(String[] args) {
        ReverseTheCaseOfString solve = new ReverseTheCaseOfString();
        String answer = solve.solution("cccCCC");
        System.out.println(answer);
    }
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) <= 96){
                answer += (Character.toString(my_string.charAt(i) +32));
            } else if(my_string.charAt(i) > 96) {
                answer += (Character.toString(my_string.charAt(i) -32));
            }
        }
        return answer;
    }
}

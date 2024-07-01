package org.study.algorithm;

public class SumOrSubtractionFromString {
    public int solution(String my_string) {
        String[] strs = my_string.split(" ");
        int answer = 0;

        switch (strs[1]) {
            case "+" :
                answer += Integer.parseInt(strs[0]) + Integer.parseInt(strs[2]);
                break;
            case "-" :
                answer += Integer.parseInt(strs[0]) - Integer.parseInt(strs[2]);
                break;
            default :
                break;
        }

        if (strs.length > 3) {
            for (int i = 3; i < strs.length; i+=2) {
                switch (strs[i]) {
                    case "+" :
                        answer += Integer.parseInt(strs[i + 1]);
                        break;
                    case "-" :
                        answer -= Integer.parseInt(strs[i + 1]);
                        break;
                    default :
                        break;
                }
            }
        }

        return answer;
    }
}

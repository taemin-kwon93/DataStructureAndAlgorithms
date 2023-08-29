package org.study.algorithm;

public class DeleteVowel {
    public static void main(String[] args) {
        DeleteVowel deleteVowel = new DeleteVowel();
        String result = deleteVowel.solution("bus");
        System.out.println(result);
        String result2 = deleteVowel.solution2("nice to meet you"	);
        System.out.println(result2);
    }

    public String solution(String stringParameter) {
        String result = "";
        for(int i = 0; i < stringParameter.length(); i++) {
            if(stringParameter.charAt(i) != 'a' &
                stringParameter.charAt(i) != 'e' &
                stringParameter.charAt(i) != 'i' &
                stringParameter.charAt(i) != 'o' &
                stringParameter.charAt(i) != 'u'
            )
            result += stringParameter.charAt(i);
        }
        return result;
    }

    public String solution2(String my_string) {
        String answer = "";
        answer = my_string.replaceAll("[aeiou]", "");
        return answer;
    }
}

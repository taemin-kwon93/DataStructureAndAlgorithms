package org.study.algorithm;

public class CardDeck {
    public String solution(String[] card1, String[] card2, String[] goal) {
        int idx1 = 0;
        int idx2 = 0;

        for (String g : goal) {
            if (card1.length > idx1 && card1[idx1].equals(g)) {
                idx1++;
            } else if (card2.length > idx2 && card2[idx2].equals(g)){
                idx2++;
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}

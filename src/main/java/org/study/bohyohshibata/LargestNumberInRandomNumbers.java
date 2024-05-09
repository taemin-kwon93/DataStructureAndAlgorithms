package org.study.bohyohshibata;

import java.util.Random;

public class LargestNumberInRandomNumbers {
    public static void main(String[] args) {
        int[] randomNumbers = new int[5];
        Random random = new Random();
        for(int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(1000);
            System.out.println("randomNumbers[" + i + "]: " + randomNumbers[i]);
        }

        int result = maxOf(randomNumbers);
        System.out.println(result);
    }

    private static int maxOf(int[] randomNumbers) {
        int max = randomNumbers[0];
        for(int i = 0; i < randomNumbers.length; i++) {
            if(max < randomNumbers[i]) max = randomNumbers[i];
        }
        return max;
    }
}

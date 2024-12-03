package org.study.parksangkhil;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (gas.length == 1) return gas[0] > cost[0] ? 0 : -1;
        int len = gas.length;
        int sum, idx, nextIdx, counter;
        int answer = -1;
        boolean flag = false;

        for (int i = 0; i < len; i++) {
            if (flag)
                break;
            sum = 0;
            counter = len - 1;
            for (int j = i; j < i + len - 1; j++) {
                idx = j % len;
                nextIdx = (j + 1) % len;
                sum += gas[idx] - cost[idx];
                counter--;
                if (sum <= 0 && counter > 0 || sum + gas[nextIdx] - cost[nextIdx] < 0) break;
                if (sum >= 0 && counter == 0) {
                    answer = i;
                    flag = true;
                }
            }
        }
        return answer;
    }

    public int canCompleteCircuit2(int[] gas, int[] cost) {
        int sum = 0;
        int total = 0;
        int pos = 0; // index
        for (int i = 0; i < gas.length; i++) {
            sum = sum + gas[i] - cost[i];
            total = total + gas[i] - cost[i];
            if (sum < 0) {
                sum = 0;
                pos = i + 1;
            }
        }

        if (total >= 0) {
            return pos;
        }

        return -1;
    }
}
package org.study.parksangkhil;

import java.util.*;

public class FlightTicket {
    public static String[] solution(String[][] tickets) {
        List<String> answer = new LinkedList<>();
        Map<String, PriorityQueue<String>> fromToMap = new HashMap<>();

        for (String[] ticket : tickets) {
            fromToMap.putIfAbsent(ticket[0], new PriorityQueue<>());
            fromToMap.get(ticket[0]).add(ticket[1]);
        }

        String from = "ICN";
        dfs(answer, fromToMap, from);

        return answer.toArray(new String[0]);
    }

    public static void dfs(List<String> answer,
                           Map<String, PriorityQueue<String>> fromToMap,
                           String from) {

        while (fromToMap.containsKey(from) && !fromToMap.get(from).isEmpty()) {
            dfs(answer, fromToMap, fromToMap.get(from).poll());
        }
        answer.add(0, from);
    }
}

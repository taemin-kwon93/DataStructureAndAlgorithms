package org.study.parksangkhil;

import java.util.*;

public class MinimumWindow {
    /**
     * <p> 필요한 글자가 탐색될 범위를 구할 window 는 t의 총 길이를 담은 변수의 변화량을 통해 조건을 판별한다.
     * 필요한 글자와 필요없는 글자를 판별하기 위해 Map 을 사용한다.
     * 처음 Map 에 담길 값은 필요한 글자별 필요횟수이다. t 가 "ABC" 일 때, A = 1, B = 1, C = 1 이 된다.
     * 이후 s 글자를 순회하며 필요없는 글자들을 추가한다.</p>
     * <p> window 의 최소 width 를 구하기 위해 슬라이딩 윈도우와 투포인터를 사용한다.
     * window 는 필요한 글자가 다 탐색될때까지 계속해서 width 를 늘려간다.
     * s 를 char type Array 형태로 순차적으로 조회해 나갈 때 right 커서의 값을 증가하며 window width 를 늘려간다.
     * 이후 탐색이 완료되면 while 문을 통해 해당 되는 조건 아래에서 left 커서를 증가시키며 window width 를 감소시켜 나간다.
     * window 의 width 가 확정된 이후에는 최소 window width 값을 저장(갱신)한다.
     * 이에따라 int type 의 변수 left, right, minLen 을 선언하며,
     * 최소 window width 의 값에 따라 인덱스 위치를 저장해 줄 start, end 를 선언한다.</p>
     * <p>s 로 부터 조회하는 각 글자에 대해 집계횟수를 Map 에 추가함으로써 필요 글자와 필요하지 않는 글자를 구별해야 한다.
     * 필요글자는 필요 이상만큼 탐색돼 Map 에 저장됐을 시 음수이하의 수를 담을 수 있고 필요하지 않는 글자는 모두 음수 이하의 수를 갖는다.</p>
     */
    public String minWindow(String s, String t) {
        // t에서 필요한 글자별, 필요한 횟수를 저장할 map 선언
        Map<Character, Integer> need = new HashMap<>();

        // window 의 넓이를 조정할 left, right 선언
        // return 값의 인덱스 위치를 잡아줄 start, end 선언
        int left = 0, right = 0, start = 0, end = 0;
        // window 의 가장 적은 넓이를 찾기위한 기준값 minLen 선언
        int minLen = Integer.MAX_VALUE;
        // 필요한 글자의 길이 수 만큼 값이 감소되거나 증가한다면, window 넓이를 조정하며 탐색 범위를 확정지을수 있음
        int tLen = t.length();

        // 필요한 글자를 모두 need 에 추가, <글자 별, 필요 횟수> 를 추가
        for (char c : t.toCharArray())
            need.put(c, need.getOrDefault(c, 0) + 1);

        // 전체 글자로 부터 window 넓이를 조정하며 문제의 조건을 만족할 수 있는 답을 찾음
        for (char c : s.toCharArray()) {
            // 탐색 과정중 오른쪽 커서는 계속해서 증가함
            right++;

            // 필요 글자 카운터 맵에서 아직까지 검색이 안된 대상이 나오면, missing 을 감소
            if (need.containsKey(c) && need.get(c) > 0)
                tLen--;
            // 탐색 이후의 모든 글자는 카운터를 -1 처리한다.
            need.put(c, need.getOrDefault(c, 0) - 1);

            // 필요한 글자가 모두 나오면 실행한다.
            if (tLen == 0) {
                // window 에서 글자를 모두 탐색하게 됐을 경우, 창의 왼쪽 커서를 점점 좁히며 최소 넓이 윈도우를 찾음
                // need 에서 카운터의 수가 음수인 경우 t에 해당되지 않는 글자이거나 필요 이상으로 Map 에 담겨진 글자이다.
                // 예를들어 A, B, C가 1개씩 필요할때 "AABC" 와 같이 A가 2개 집계된 경우 음수가 될 수 있다.
                while (left < right && need.get(s.charAt(left)) < 0) {
                    need.put(s.charAt(left), need.get(s.charAt(left)) + 1);
                    left++;
                }

                // window 조정 완료 이후에 지금까지 찾은 최소창문 너비와 비교한다. 그리고 minLen, start, end 에 값을 대입한다.
                if (minLen > right - left + 1) {
                    minLen = right - left + 1;
                    start = left;
                    end = right;
                }

                // 아래 구문과 전체 for 문 상단의 right++ 가 동작하면 window 는 한칸 sliding 하게 된다.
                // tLen 의 값 또한 조정 해줌으로써 window 내에서 탐색되는 글자의 필요 조건을 수정해준다.
                need.put(s.charAt(left), need.get(s.charAt(left)) + 1);
                left++;
                tLen++;
            }
        }
        return s.substring(start, end);
    }
}

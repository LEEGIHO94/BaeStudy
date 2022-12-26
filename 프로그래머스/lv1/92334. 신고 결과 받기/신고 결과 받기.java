import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, HashSet<String>> map = new HashMap<>();//key = 신고당한 사람, value = 신고한 사람
        Map<String, Integer> mapOfNumber = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            map.put(id_list[i], new HashSet<>());
        }   //초기화

        for (int i = 0; i < report.length; i++) {
            String[] tmp = report[i].split(" ");
            map.get(tmp[1]).add(tmp[0]);
        }// 값 삽입

        for (int i = 0; i < id_list.length; i++) {
            if (map.get(id_list[i]).size() >= k) {
                for (String tmp : map.get(id_list[i])) {
                    mapOfNumber.put(tmp, mapOfNumber.getOrDefault(tmp,0)+1);
                }
            }
        }
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = mapOfNumber.getOrDefault(id_list[i],0);
        }
        return answer;
    }
}
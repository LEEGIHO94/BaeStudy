import java.util.*;

class Solution {
    public int[] solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] text = s.toCharArray();      //배열을 넣을 수 잇다.
        for (char characterOfString : text) {
            map.put(characterOfString,map.getOrDefault(characterOfString,-1)+1);
            //키가 없으면 -1을 반환하라 아니면 해당 키의 벨류를 반환해라.
        }
        int[] result = new int[map.size()];

        int i = 0;
        for (Integer value : map.values()) {
            result[i] = value;
        }





        return result;
    }
}
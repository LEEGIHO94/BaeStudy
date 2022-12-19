import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<Character, Integer> map = new HashMap<>();
        
        initMap(map);
        checkServayNum(survey, choices, map);
        answer = getAnswer(answer, map);


        return answer;
    }

    private static String getAnswer(String answer, Map<Character, Integer> map) {
        answer = answer + checkServery(map, 'R', 'T');
        answer = answer + checkServery(map, 'C', 'F');
        answer = answer + checkServery(map, 'J', 'M');
        answer = answer + checkServery(map, 'A', 'N');
        return answer;
    }

    private static void checkServayNum(String[] survey, int[] choices, Map<Character, Integer> map) {
        for(int i = 0; i < choices.length; i++){
            char[] tmp =  survey[i].toCharArray();
            switch (choices[i]){
                case 1: map.put(tmp[0], map.get(tmp[0])+3); break;
                case 2: map.put(tmp[0], map.get(tmp[0])+2); break;
                case 3: map.put(tmp[0], map.get(tmp[0])+1); break;
                case 4: break;
                case 5: map.put(tmp[1], map.get(tmp[1])+1); break;
                case 6: map.put(tmp[1], map.get(tmp[1])+2); break;
                case 7: map.put(tmp[1], map.get(tmp[1])+3); break;
            }
        }
    }

    private static void initMap(Map<Character, Integer> map){
        map.put('A',0);
        map.put('N',0);
        map.put('J',0);
        map.put('M',0);
        map.put('C',0);
        map.put('F',0);
        map.put('R',0);
        map.put('T',0);
    }
    private static char checkServery(Map<Character, Integer> map,char char1, char char2){
        if(map.get(char1)>=map.get(char2))
            return char1;
        return char2;
    }
}

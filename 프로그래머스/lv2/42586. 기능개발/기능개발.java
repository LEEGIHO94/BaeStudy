import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
       List<Integer> list = new ArrayList<>();

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++) {
            if((100-progresses[i]) % speeds[i] == 0)
                list.add((100-progresses[i]) / speeds[i]);
            else
                list.add((100-progresses[i]) / speeds[i] + 1);
        }

        int count = 1;

        while (true) {
            for(int i = 1 ; i<list.size(); i++){
                if (list.get(i) <= list.get(0)) {
                    count++;
                }
                else {
                    break;
                }
            }

            answer.add(count);
            for (int i = 0; i < count; i++) {
                list.remove(0);
            }

            count = 1;
            if(list.size() ==1) {
                answer.add(count);
                break;
            }
            if(list.size() == 0)
                break;
        }
        return answer.stream().mapToInt(m->m).toArray();
    }
}
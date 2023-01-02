import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {0,0};
        PriorityQueue<Integer> pqmax = new PriorityQueue<>(Collections.reverseOrder());
        //높은 숫자가 우선 순위
        PriorityQueue<Integer> pqmin = new PriorityQueue<>();
        //낮은 숫자 우선 순위

        for (String operation : operations) {
            switch (operation) {
                case "D 1":
                    if (!pqmax.isEmpty()) {
                        pqmin.remove(pqmax.poll());
                    }
                    break;
                case "D -1":
                    if (!pqmin.isEmpty()) {
                        pqmax.remove(pqmin.poll());
                    }
                    break;
                default :
                    int i = Integer.parseInt(operation.substring(2));
                    pqmax.add(i);
                    pqmin.add(i);
                    break;
            }
        }

        if(!pqmax.isEmpty()){
            answer[0] = pqmax.peek();
            answer[1] = pqmin.peek();
        }

        return answer;
    }
}
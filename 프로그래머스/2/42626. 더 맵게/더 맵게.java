import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue();

        for (int a : scoville) {
            heap.add(a);
        }

        while (heap.peek() < K) {
            //최대값 확인 
        
            //런타임 에러 해결
            if (heap.size() == 1) {
                return -1;
            }
            
            int tmp1 = heap.poll();
            int tmp2 = heap.poll();


            int addScovile = tmp1 + (tmp2 * 2);

            heap.add(addScovile);
            answer ++;
        }
        return answer;
    }
}
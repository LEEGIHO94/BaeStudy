import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int count = 0;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = -1000;
                    reserve[j] = -1000;
                    count++;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(lost));
        System.out.println(Arrays.toString(reserve));
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] + 1 == reserve[j]) {
                    lost[i] = -1000;
                    reserve[j] = -1000;
                    count++;
                    break;
                } else if (lost[i] - 1 == reserve[j]) {
                    lost[i] = -1000;
                    reserve[j] = -1000;
                    count++;
                    break;
                }
            }
        }
        return n - lost.length + count;
    }
}




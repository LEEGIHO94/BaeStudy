
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
        public static int solution(int n) {
        List<Integer> list = new ArrayList<>(Arrays.asList(0,1));

        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                list.add((list.get(i-1) + list.get(i-2)) % 1234567);
            }
        }

        return list.get(n);
    }
}
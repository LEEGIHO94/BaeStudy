import java.util.LinkedHashSet;
import java.util.Set;
class Solution {
    static int[][]arr = new int[11][11];
    static boolean[][]flag = new boolean[11][11];
    static int count=0;
    static Set<String> set = new LinkedHashSet<>();

    public static int solution(String dirs) {
        int num1 = 0;
        int num2 = 0;

        char[] chars = dirs.toCharArray();

        for (char c : chars) {
            switch (c){
                case 'U':
                    if(num1 >= 5) break;
                    set.add("["+ (num1+0.5) +"]["+num2+"]");
                    num1++;
                    break;
                case 'D':
                    if(num1 <= -5) break;
                    set.add("["+ (num1-0.5) +"]["+ num2 + "]");
                    num1--;
                    break;
                case 'L':
                    if(num2 <= -5) break;
                    set.add("["+ num1 +"]["+ (num2-0.5) + "]");
                    num2--;
                    break;
                case 'R':
                    if(num2 >= 5) break;
                    set.add("["+ num1 +"]["+ (num2+0.5) + "]");
                    num2++;
                    break;
            }
        }
        return set.size();
    }
}
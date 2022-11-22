class Solution {
    public int solution(int[] sides) {
        int max = Math.max(sides[0],sides[1]);
        int min = Math.min(sides[0],sides[1]);

        int result1 = max - min;    //4     3
        int result2 = max + min;    //18    9
        int result = result2 - result1 -1;
        return result;

    }
}
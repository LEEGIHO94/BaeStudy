class Solution {
    public static int solution(String A, String B) {
        String test = A;
        int count= 0;
        for(int i = 0 ; i < test.length() ; i ++){
            if(test.equals(B)) return count;

            char a = test.charAt(test.length()-1);
            test = a + test.substring(0,test.length()-1);
            count++;
        }
        return -1;
    }

}
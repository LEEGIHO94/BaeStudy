class Solution {
    public int[] solution(String s) {
        char[] text = s.toCharArray();      //배열을 넣을 수 잇다.
//        char tmp = '\u0000'; O
//        char tmp = = null; X


        int[] result = new int[text.length];    //값을 받을 것이다.

        for(int i = 0 ; i < text.length ; i ++){
            int num = -1;
            for(int j = 0 ; j <i ; j++){
                if(text[i]==text[j]) num = i - j;
            }
            result[i] = num;
            
        }

        return result;
    }

}
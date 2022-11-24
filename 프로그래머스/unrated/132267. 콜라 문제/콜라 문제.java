class Solution {
    public static int solution(int a, int b, int n) {

        int result = 0;
        while (true) {
            if (n >= a) {
                result += (b *(n/a));
                n = n -((n/a)*a) + (b *(n/a));
            //note     슈퍼에 준병   슈퍼에 주고 받은 병

//                n = (n /a)*a + (n % a);

            }
            else
                break;
        }
        return result;


    }
}


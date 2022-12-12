class Solution {
    public int solution(int n) {
        int count = 0;

        for(int i = 1 ; i <= n ; i++){
            count++; // 카운터를 증가 시켜라
            while (true){
                if(count % 3 == 0 || count%10 ==3 || count / 10 == 3 || count /10 ==13)
                    //3의 배수거나 10의 자리가 3이거나 1의 자리가 3이거나
                    count++;
                else break;
            }
        }
        return count;
    }
}

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        //통분 ->
        int arr= numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        int i = 2; 
        while(i <= denom){
            if(arr % i == 0 && denom % i == 0){
                arr = arr / i;
                denom = denom / i;
            }else{
                i++;
            }
        }
        return new int[]{arr,denom};
    }
}
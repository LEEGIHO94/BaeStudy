class Solution {
    public String solution(int[] food) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(int i = 1 ; i < food.length ; i++){
            if(food[i] >= 2){
                for(int j = 0 ; j <food[i]/2 ; j++){
                    sb1.append(i);
                    sb2.append(i);
                }
            }
        }
        
        return String.valueOf(sb1) + 0 + sb2.reverse();
    }
}

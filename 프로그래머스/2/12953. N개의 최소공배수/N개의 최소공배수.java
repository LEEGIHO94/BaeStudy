class Solution {
    public int solution(int[] arr) {
        int lcm = arr[0];
        for(int i = 1 ; i < arr.length; i++){
            lcm = lcm(lcm,arr[i]);
        }
        return lcm;
    }
    
    private int lcm(int a, int b){
        int gcd  = gcd(a,b);
        
        return a * b / gcd;
    }
    
    private int gcd(int a , int b){
        if(b == 0)
            return a;
        return gcd(b,a % b);
    }
}

/*
n개의 수의 최소공배수는 n개의 배수 중 가장 작은 숫자, -> n 개의 숫자를 담은 배열이 입력 되었을 때 이 수들의 최소 공배수를 반환하는 함수 구하시오
즉 2개씩 최소공배수를 구해서 사용하면 된다.

최소 공배수 구하는 방법
최대 공약수를 구한다.
A * B / 최대 공약수 = 최소 공배수
유클리드 호제법을 활용해 최대 공약수를 구할 수 있다.
num1 , num2의 나머지를 이용해 작은 수를 나누다 이 때 나머지가 0이 될때의 a값이 최소 공배수가 된다.
수도 코드

public int gcd(int num1, int num2){

}
*/
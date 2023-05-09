

import java.util.*;
import java.io.*;


public class Main {
    static Long[] memo;
    static long[] table;
    /*
    * 로직을 볼 때 키 포인트는 2가지다.
    *   1. 사람이 움직일 수 있는 것은 다음칸 or 다다음칸
    *   2. 연속해서 3칸을 이동할 수 없다. -:> 중간에 한칸을 띄워야한다.
    *
    * =:> 결론 2가지의 데이터를 가지고 있는 배열을 만들어야한다.
    * why?
    *   하나는 모든 데이터를 소모했을 때의 값 (1번지) 하나는 연속칸을 한칸 남은 데이터(2번지)
    *
    * memo에 들어갈 데이터를 long 데이터 타입 사용
    *
    * dp로 사용하는 이유?
    *   최대 300개 까지올 수 있다. 그렇다면 연산이 몇번 올 수 있는가?
    * 재귀를 계속 타야한다. 즉 n^m
    *
    * 처음부터 점화식을 이용해서 문제를 접근하는 방법을 생각해보자.
    *
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        memo = new Long[N+1];
        table = new long[N+1];
        for (int i = 1; i <= N; i++) {
            table[i] = Long.parseLong(br.readLine());
        }
        memo[0] = table[0];
        memo[1] = table[1];
        if (N >= 2) {
            memo[2] = table[1] + table[2];
        }

        System.out.println(dp(N));
    }

    public static long dp(int N) {

        if (memo[N] == null) {
            memo[N] =  Math.max(dp(N-3) + table[N-1], dp(N-2)) + table[N];
        }
        return memo[N];
    }
}


import java.io.*;
import java.util.*;

public class Main {
    static int[] memo;
    static int[] ls;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        //function declaration
        memo = new int[N + 1];
        ls = new int[N + 1];

        //init
        for (int i = 1; i < N + 1; i++) {
            memo[i] = ls[i] = Integer.parseInt(st.nextToken());
        }

        //logic
        dp();
        
        //get max
        System.out.println(Arrays.stream(memo).max().getAsInt());
    }

    public static void dp(){
        /*
        * dp에 저장될 값 : I개의 데이터를 골랐을 때의 최댓 값
        *
        * Loop. 1 ~ N 까지 i
        *   Loop. 1 ~ i 까지 각 자릿수의 대표 값을 체크하기 위해서
        *       if. ls[i] > ls[j]   증가하는 부분수열 체크 위한 것
        *           Math.max(memo[j] + ls[i],memo[i] )      큰 수 체크 기존에 저장되어 있는 값과 이전에 저장되어 있는 값들 중 어느 값이 더 큰가 체크
        *
        * 첫 항일 때 : 첫항에서의 최댓 값은 자기 자신이 된다 -> 생략
        * */

        for (int i = 1; i < memo.length; i++) {
            for(int j = 1 ; j < i ; j++){       //해당 Index보다 작은 각 N개의 최댓값을 구한다음 ls[i]의 값과 합한 값이 더 크다면 갈아 치워라
                if(ls[i] > ls[j])
                    memo[i] = Math.max(memo[i],memo[j] + ls[i]);
            }
        }

    }
}
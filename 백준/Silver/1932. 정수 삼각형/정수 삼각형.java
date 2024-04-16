import java.io.*;
import java.util.*;

public class Main {
    static int[][] l;
    static Integer[][] d;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        l = new int[N+1][N+1];
        d = new Integer[N+1][N+1];
        //init
        for(int i = 1 ; i < N+1 ;i++){
            for(int j = 1 ; j <= i ; j++){
                l[i][j] = sc.nextInt();
            }
        }

        //copy last array
        for(int i = 1; i < N+1; i++){
            d[N][i] = l[N][i];
        }

        int dp = dp(1, 1);
        System.out.println(dp);
    }

    public static int dp(int depth, int index){
        if(d[depth][index] != null) return d[depth][index];

        d[depth][index] = Math.max(dp(depth+1,index),dp(depth+1,index + 1)) + l[depth][index];

        return d[depth][index];
    }
}
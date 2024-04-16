import java.io.*;
import java.util.*;

public class Main {
    static Integer[][] d;
    static int[][] l;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        while(count-->0){
            int N = sc.nextInt();

            d = new Integer[2][N+1];
            l = new int[2][N+1];

            //init
            for (int i = 0; i < 2; i++) {
                for (int k = 1; k < N + 1; k++) {
                    l[i][k] = sc.nextInt();
                }
            }

            d[0][1] = l[0][1];
            d[1][1] = l[1][1];


            dp(0,N);
            dp(1,N);

            System.out.println(Math.max(d[0][N],d[1][N]));
        }

    }

    private static int dp(int depth, int index) {
        if(index <= 0)
            return -1;
        if(d[depth][index] != null) return d[depth][index];

        if(depth ==1)
            d[depth][index] = Math.max(dp(0,index -1),dp(0,index -2)) + l[depth][index];
        else
            d[depth][index] = Math.max(dp(1,index -1),dp(1,index -2)) + l[depth][index];

        return d[depth][index];
    }
}

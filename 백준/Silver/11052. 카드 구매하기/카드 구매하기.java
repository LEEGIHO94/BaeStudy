import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int target = Integer.parseInt(br.readLine());

        int[] table = new int[target + 1];
        int[] memo = new int[target+1];
        //테이블 초기화
        init(br.readLine(), table);
        memo[1] = table[1];
        System.out.println(aux(memo,table,target));
    }

    private static void init(String str, int[] table) throws IOException {
        StringTokenizer st = new StringTokenizer(str);
        int i = 1;
        while (st.hasMoreTokens()) {
            table[i++] = Integer.parseInt(st.nextToken());
        }
    }

    private static int aux(int[] memo, int[] table,int index) {
        if (memo[index] != 0 && index > 0) {
            return memo[index];
        }

        if (memo[index] == 0) {
            memo[index] = table[index];
        }

        //값이 존재하지 않는다면 i
        for (int i = index - 1; i > 0; i--) {
            memo[index] = Math.max(aux(memo,table,i) + table[index - i],memo[index]);
        }

        return memo[index];
    }
}
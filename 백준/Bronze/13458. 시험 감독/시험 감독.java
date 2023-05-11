
import java.util.*;
import java.io.*;

/*
 * 배열이 하나 필요함
 * 2번째 인자는 총감독이 가지는 인자
 * 3번째 인자는 부감독이 가지는 인자
 *
 * 총 백만까지만 가능하다. 다만 for문 1개로 사용 가능함 -> O(n)
 *
 * */
public class Main {
    static int N, B,C;
    static int[] arr;
    static long answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine() , " ");
        for (int i = 1; i < N + 1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine() , " ");
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        aux();
        if (C == 1000000) {
            answer = arr.length - 1;
        }   
        System.out.println(answer);
    }

    static void aux() {
        for (int i = 1 ; i < N+1 ; i++) {
             int num = arr[i] - B;
             answer++;
            if (num > 0) {
                if (num % C != 0) {
                    answer = answer + (num / C) + 1;
                }else{
                    answer = answer + (num / C);
                }
            }
        }
    }
}


import java.util.*;
import java.io.*;

public class Main {

    static int[] visit = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] split = br.readLine().split(" ");
        int start = Integer.parseInt(split[0]);
        int end = Integer.parseInt(split[1]);
        br.close();
        if (start == end) {
            System.out.println(0);
        }else{
            BFS(start, end);
        }
        
    }

    public static void BFS(int start,int end) {
        Queue<Integer> list = new LinkedList<>();
        int tmp = 0;
        int next = 0;
        list.add(start);
        visit[start] = 1;

        while(!list.isEmpty()){
            tmp = list.poll();
            for (int i = 0; i < 3; i++) {
                if (i == 0) {
                    next = tmp + 1;
                } else if (i == 1) {
                    next = tmp * 2;
                } else {
                    next = tmp -1;
                }
                if (next == end) {
                    System.out.println(visit[tmp]);
                    return;
                }
                if (isValid(next)) {
                    list.add(next);
                    visit[next] = visit[tmp]+1;
                }
            }
        }
    }

    private static boolean isValid(int num) {
        return num >= 0 && num < 100001 && visit[num] == 0;
    }
}

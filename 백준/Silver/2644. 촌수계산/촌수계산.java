import java.util.*;
import java.io.*;

public class Main {
    /*
     * 처음에 사람 인원 수 input
     * 구하고자하는 것들이 들어온다.
     * 선 그어야하는 input 갯수
     *
     * */

    static ArrayList<Integer>[] arr;
    static boolean[] visited;
    static int child;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine()) + 1;

        arr = new ArrayList[length];
        visited = new boolean[length];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = new ArrayList<Integer>();
        }

        String[] tmp = br.readLine().split(" ");
        int parents = Integer.parseInt(tmp[0]);
        child = Integer.parseInt(tmp[1]);

        int loopCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < loopCount; i++) {
            String[] str = br.readLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);

            arr[x].add(y);
            arr[y].add(x);
        }

        visited[parents] = true;
        int dfsResult = DFS(parents);
        if (dfsResult != child) {
            count = -1;
        }
        System.out.println(count);

    }

    /*
    * 마지막 루프에 도달 했을 때 값이 3이 아니다  -> 문제가 발생함 -> 탈출
    * */
    static int DFS(int start) {
        List<Integer> aux = arr[start];
        int index = 0;
        int tmpCount = count;
        if (start == child) {
            return child;
        }

        //처음 순회할 것이 parents에서 부터 시작한다.

        for (int i = 0; i < aux.size(); i++) {
            index = aux.get(i);
            if (!visited[index]) {
                visited[index] =true;
                count++;
                int checkNumber = DFS(index);
                //반복문 탈출 조건
                if (checkNumber == child) {
                    return checkNumber;
                }
            }
            count = tmpCount;
        }
        return index;
    }
}
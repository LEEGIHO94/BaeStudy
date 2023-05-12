
import java.util.*;
import java.io.*;

/*
* 문제를 보면 일단 11의 배열 길이를 만들 수 있다.
* 연산자는 최대 10까지 올 수 이싿. -> 4^10 가지의 경우 11까지의 경우 발생한다.
* 완전 탐색 시 문제가 없을 것이라고 판단된다.
* DP로 풀 수 있는가?
* 불가능 하다. 저장을 할 수 있는 방법이 불가능하다.
* DFS로 문제를 풀어야한다.
*   연산을 할 때 operator 에서 값을 빼줘야한다. Why? 총 기회가 정해져 있기 때문에
*       그렇다면 연산을 완료하고 다시 증가를 시켜줘야한다. 그래야 다음 순회 할 때 문제가 생기지 않는다.
* 수도코드
* 1. 전역변수 설정
*   1-1. N 배열의 길이, arr N의 길이를 가지는 배열, operator 연산자의 배열(이 곳에는 몇개의 연산이 들ㅇ가 있다.)
*   1-2. 입력을 받아 각각의 데이터를 초기화 한다.
* 2. DFS 로직 구현
*   2-1. for문에 따라 각각의 연산을 수행할 수 있는 로직을 구현해야한다.
*       2-1-1. 모든 연산을 수행해야하는데 백트래킹을 진행하는 것이 좋아보인다.
*
*   문제에서 if 조건을 활용해서 for문에서 선택한 operator에 있는 값을 1 줄이고 해당 연산을 수행한다.
*
*   2-2. 탈출 조건
*       2-2-1. N이랑 length 의 길이가 같을 때 탈출한다.
*   2-3. DFS를 재귀로 부른 이후 operator를 다시 1 증가시킨다.
* */

public class Main {
    static int N;
    static int[] arr;
    static int Min = Integer.MAX_VALUE;
    static int Max = Integer.MIN_VALUE;
    static int[] operator = new int[4];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N+1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 1; i < N + 1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int j = 0; j < 4 ; j++) {
            operator[j] = Integer.parseInt(st.nextToken());
        }

        DFS(2,arr[1]);


        System.out.println(Max);
        System.out.println(Min);
    }

    /*
     * 2. DFS 로직 구현
     * 탈출 조건 먼저 구현 -> 탈출 조건이 필요하다. 그리고 arr 관련된 것들을 먼저 연산해야한다. 그렇다면 저장한 값을 넘겨줄 필요성이 있다. 파라미터로 넘려주자
     *   2-1. for문에 따라 각각의 연산을 수행할 수 있는 로직을 구현해야한다.
     *       2-1-1. 모든 연산을 수행해야하는데 백트래킹을 진행하는 것이 좋아보인다.
     *
     *   문제에서 if 조건을 활용해서 for문에서 선택한 operator에 있는 값을 1 줄이고 해당 연산을 수행한다.
     *
     *   2-2. 탈출 조건
     *       2-2-1. N이랑 length 의 길이가 같을 때 탈출한다.
     *   2-3. DFS를 재귀로 부른 이후 operator를 다시 1 증가시킨다.
    * */
    static void DFS(int index,int num) {
        //탈출 조건
        if (index == N + 1) {
            Max = Math.max(num,Max);
            Min = Math.min(num,Min);
            return ;
        }

        for(int dir = 0; dir < 4 ; dir++){
            if (operator[dir]-- > 0) {
                switch(dir){
                    case 0: DFS(index+1, num + arr[index]); break;
                    case 1: DFS(index+1, num - arr[index]); break;
                    case 2: DFS(index+1, num * arr[index]); break;
                    case 3: DFS(index+1, num / arr[index]); break;
                }
            }
            //이곳에 있어야하는 이유는 for문이 올라가게 되면 다시 처음부터 로직을 수행해야되기 때문이다.
            operator[dir]++;
        }
    }
}

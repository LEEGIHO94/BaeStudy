import java.io.*;
import java.util.*;

public class Main {
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numberOfNotices = Integer.parseInt(br.readLine());

        for (int i = 0; i < numberOfNotices; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            choiceMethod(st);
        }

    }

    private static void choiceMethod(StringTokenizer st) {
        switch (st.nextToken()) {
            case "push" :
                push(Integer.parseInt(st.nextToken()));
                return;
            case "pop":
                System.out.println(pop());
                return;
            case "top":
                System.out.println(top());; return;
            case "size":
                System.out.println(size());;return;
            default :
                System.out.println(empty());; return;
        }
    }

    private static void push(int num) {
        list.add(num);
    }
    private static int pop(){
        return !list.isEmpty() ?  list.remove(list.size()-1) : -1;
    }

    private static int top() {
        return !list.isEmpty() ? list.get(list.size()-1) : -1;
    }

    private static int size() {
        return !list.isEmpty() ? list.size() : 0;
    }

    private static int empty() {
        return list.isEmpty() ? 1 : 0 ;
    }
}

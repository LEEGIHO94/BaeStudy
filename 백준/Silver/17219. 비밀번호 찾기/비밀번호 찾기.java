import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int S = sc.nextInt();

        Map<String,String> map = new HashMap();

        while(T-->0){
            map.put(sc.next(),sc.next());
        }
        while(S-->0){
            System.out.println(map.get(sc.next()));
        }
    }
}

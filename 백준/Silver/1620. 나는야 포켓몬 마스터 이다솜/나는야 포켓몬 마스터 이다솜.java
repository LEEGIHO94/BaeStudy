import java.util.*;

public class Main {
    public static void main(String[] args) {
        //이름 순
        Map<String, String> map1 = new HashMap<>();
        //id 순
        Map<String,String> map2 = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int S = sc.nextInt();

        for(int i = 1 ; i < T + 1 ; i++){
            String s = sc.next();
            map1.put(s,String.valueOf(i));
            map1.put(String.valueOf(i),s);
        }

        while(S-->0){
            String s = sc.next();
            if(map1.containsKey(s)){
                System.out.println(map1.get(s));
            }else{
                System.out.println(map2.get(s));
            }
        }
    }
}

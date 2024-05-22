import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<String> set = new HashSet();
        int T = Integer.parseInt(br.readLine());

        while(T-->0){
            String[] tmp = br.readLine().split(" ");
            if(tmp[1].equals("leave"))
                set.remove(tmp[0]);
            else
                set.add(tmp[0]);
        }

        List<String> list = new ArrayList<>(set);

        list.sort((s1,s2) -> s2.compareTo(s1));

        list.forEach(System.out::println);
    }


}

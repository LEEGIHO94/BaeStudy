import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new TreeSet<>();
        //init
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }
        ArrayList<String> strArr = new ArrayList<>(set);
        Collections.sort(strArr,(o1,o2)->{
            if(o1.length() == o2.length())
                return o1.compareTo(o2);
            else
                return o1.length() - o2.length();
        });

        for (String s : strArr) {
            System.out.println(s);
        }
    }
}

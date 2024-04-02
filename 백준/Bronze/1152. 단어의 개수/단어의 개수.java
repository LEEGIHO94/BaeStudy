
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        System.out.println(st.countTokens());
    }



    public static void aux1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();

        if(s.isEmpty()) {
            System.out.println(1);
            return;
        }
        System.out.println(s.split(" ").length);
    }
}

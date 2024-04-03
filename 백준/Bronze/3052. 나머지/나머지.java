import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();
        int N = 10;
        while (N-- > 0) {
            int i = Integer.parseInt(br.readLine());
            set.add(i % 42);
        }

        System.out.println(set.size());
    }
}

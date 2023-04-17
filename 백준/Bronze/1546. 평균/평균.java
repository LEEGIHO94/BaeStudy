import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        double[] scores = new double[count];

        for(int i =0; i < count; i++){
            scores[i] = Double.parseDouble(st.nextToken());
        }

        double max = Arrays.stream(scores).max().orElse(0);

        double average = Arrays.stream(scores).map(value -> value / max * 100)
                .average().orElse(0.0);

        System.out.println(average);
    }

}
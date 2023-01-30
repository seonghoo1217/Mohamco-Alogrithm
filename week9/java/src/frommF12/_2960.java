package problems.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2960 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());


        boolean[] array = new boolean[N + 1];

        for (int i = 0; i <= N; i++) {
            array[i] = true;
        }

        int count = 0;
        for (int i = 2; i <= N; i++) {
            for (int j = i; j <= N; j += i) {
                if (array[j]) {
                    array[j] = false;
                    count++;
                }
                if (count == K) {
                    System.out.println(j);
                    return;
                }
            }
        }
    }
}


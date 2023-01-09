package Gawq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;
// 33m41s
public class _1773 {
    private static int N, C;
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        input = new BufferedReader(new StringReader(src));

        StringTokenizer st = null;
        st = new StringTokenizer(input.readLine());

        N = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(input.readLine());
        }

        int sum = 0;
        for (int i = 1; i <= C; i++) {
            int beforeSum = 0;
            for (int j = 0; j < N; j++) {
                if (i % arr[j] == 0) beforeSum++;
            }
            if (beforeSum == 1) sum++;
            else if (beforeSum > 0 && beforeSum <= N) {
                sum++;
            }
        }
        System.out.println(sum);
    }
    private static String src = "3 20\n" +
            "4\n" +
            "6\n" +
            "3\n";
}

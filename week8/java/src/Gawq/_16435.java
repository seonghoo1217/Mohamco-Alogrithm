package Gawq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;
// 12m26s
public class _16435 {
    private static int N, L;
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new StringReader(src));
        StringTokenizer st = null;

        st = new StringTokenizer(input.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());

        int[] h = new int[N];
        st = new StringTokenizer(input.readLine());
        for (int i = 0; i < N; i++) {
            h[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(h);
        for (int i = 0; i < N; i++) {
            if (L >= h[i]) {
                L++;
            }
        }
        System.out.println(L);
    }
    private static String src = "8 1\n" +
            "9 5 1 3 2 7 6 4";
}

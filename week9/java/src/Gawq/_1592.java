package Gawq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 28m11s
public class _1592 {
    private static int N, M, L;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());

        int[] count = new int[N];
        count[0] = 1;

        int i = L;
        int cnt = 0;
        here : while (true) {
            for (int j = 0; j < count.length; j++) {
                if (count[j] == M) {
                    break here;
                }
            }
            if (i > N - 1) {
                i -= N;
            }
            else if (i < 0) {
                i += N;
            }
            count[i]++;

            if (count[i] % 2 == 1) {
                i += L;
            }
            else {
                i -= L;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
